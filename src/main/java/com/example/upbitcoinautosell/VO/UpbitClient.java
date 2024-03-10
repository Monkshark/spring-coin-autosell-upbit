package com.example.upbitcoinautosell.VO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UpbitClient {
    private double krw_money;
    private double all_money;
    private List<TickerVo> CashMemoryListTickerVo;
    private List<MyBankVo> accounts;
}