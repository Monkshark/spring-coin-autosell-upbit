package com.example.upbitcoinautosell.UpbitService;

import com.example.upbitcoinautosell.DAO.UpbitDao;
import com.example.upbitcoinautosell.VO.TickerVo;
import org.springframework.stereotype.Service;

@Service
public class UpbitServiceImpl implements UpbitService{

    private final UpbitDao upbitDao;

    public UpbitServiceImpl(UpbitDao upbitDao) {
        this.upbitDao = upbitDao;
    }

    @Override
    public void test() {
        upbitDao.test();
    }

    @Override
    public void insert_ticker(TickerVo tickerVo) {
        upbitDao.insert_ticker(tickerVo);
    }

}