package com.pattern.strategy;

public class Context {
    private IStrategy strategy;
    
    public Double calRecharge(Double charge, int type) {
        strategy = StrategyFactory.getInstance().creator(type);
        return strategy.calRecharge(charge, RechargeTypeEnum.valueOf(type));
    }
    
    public IStrategy getStrategy() {
        return strategy;
    }
  
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
