package com.example.upbitcoinautosell.Websocket;

import com.example.upbitcoinautosell.UpbitService.UpbitService;
import com.example.upbitcoinautosell.VO.MarketVo;
import com.example.upbitcoinautosell.VO.TickerVo;
import com.example.upbitcoinautosell.upbitAPI.UpbitApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class Task {

    @Autowired
    private UpbitService upbitService;

    private static int running_cnt = 0;
    private static List<MarketVo> listMarketVo;
    private static UpbitApi api;
    private static boolean is_running = false;

    @Scheduled(fixedDelay = 100, initialDelay = 0)
    public void upbitMarket() throws IOException {
        try {
            if(!is_running) {
                is_running = true;
                if(running_cnt == 0) {
                    // Cmd 생성
                    api = new UpbitApi();

                    // 모든 마켓 정보 수신
                    listMarketVo =  api.markets();
                }

                // 모든 마켓 실시간 수신
                for (MarketVo v : listMarketVo) {
                    if(v.getMarket().startsWith("KRW")) {
                        Thread.sleep(100);
                        List<TickerVo> listTickerVo = api.ticker(v.getMarket());
                        TickerVo tickerVo = listTickerVo.getFirst();

                    }
                }

                running_cnt++;
                is_running = false;
            }
        } catch (Exception ignored) {

        }
    }
}