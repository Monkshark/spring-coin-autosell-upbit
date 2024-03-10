package com.example.upbitcoinautosell.VO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderVo {
    private String market;
    private String side;
    private String volume;
    private String price;
    private String ord_type;

}