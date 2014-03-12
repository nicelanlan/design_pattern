package com.pattern.strategy;

public class EBankStrategy implements IStrategy {

    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge*0.85;
    }
    
}
