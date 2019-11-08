package com.geekq.miaosha;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("-100");
        BigDecimal bigDecimal2 = new BigDecimal("0");

        System.out.println(bigDecimal1.compareTo(new BigDecimal(0)));
        System.out.println(bigDecimal2.compareTo(new BigDecimal(0)));
    }
}
