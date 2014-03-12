package com.pattern.strategy;

public class MobileStrategy implements IStrategy {

    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge;
    }

}
