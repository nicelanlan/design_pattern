package com.pattern.strategy;

public class BusiAccountsStrategy implements IStrategy {

    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge*0.90;
    }

}
