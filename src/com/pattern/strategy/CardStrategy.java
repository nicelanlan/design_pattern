package com.pattern.strategy;

public class CardStrategy implements IStrategy {

    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge+charge*0.01;
    }

}
