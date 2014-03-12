package com.pattern.strategy;

public enum RechargeTypeEnum {
    E_BANK(1, "网银"),
    BUSI_ACCOUNTS(2, "商户账号"),
    MOBILE(3,"手机卡充值"),
    CARD_RECHARGE(4,"充值卡");
    
    private final int value;
    private final String description;
    
    private RechargeTypeEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public static RechargeTypeEnum valueOf(int value) {
        for(RechargeTypeEnum type : RechargeTypeEnum.values()) {
            if(type.value == value) {
                return type;
            }
        }
        return null;
    }
}
