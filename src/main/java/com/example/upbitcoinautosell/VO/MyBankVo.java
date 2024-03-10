package com.example.upbitcoinautosell.VO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyBankVo {
    private String currency;
    private String balance;
    private String locked;
    private String avg_buy_price;
    private boolean avg_buy_price_modified;
    private String unit_currency;
    private String korean_name;

}