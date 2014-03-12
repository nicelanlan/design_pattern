package com.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private static StrategyFactory factory = new StrategyFactory();
    
    public static Map<Integer, IStrategy> strategyMap = new HashMap<Integer, IStrategy>();
    
    static{
        strategyMap.put(RechargeTypeEnum.E_BANK.getValue(), new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNTS.getValue(), new BusiAccountsStrategy());
        strategyMap.put(RechargeTypeEnum.MOBILE.getValue(), new MobileStrategy());
        strategyMap.put(RechargeTypeEnum.CARD_RECHARGE.getValue(), new CardStrategy());
    }
    
    public IStrategy creator(int type) {
        return strategyMap.get(type);
    }
    
    public static StrategyFactory getInstance() {
        return factory;
    }
}
