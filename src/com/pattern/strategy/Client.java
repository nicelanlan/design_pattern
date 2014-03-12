package com.pattern.strategy;

public class Client {

    public static void main(String args[]) {
        Context context = new Context();
        // 网银充值100 需要付多少
        Double money = context.calRecharge(100D, RechargeTypeEnum.E_BANK.getValue());
        System.out.println(money);

        // 商户账户充值100 需要付多少
        Double money2 = context.calRecharge(100D, RechargeTypeEnum.BUSI_ACCOUNTS.getValue());
        System.out.println(money2);

        // 手机充值100 需要付多少
        Double money3 = context.calRecharge(100D, RechargeTypeEnum.MOBILE.getValue());
        System.out.println(money3);

        // 充值卡充值100 需要付多少
        Double money4 = context.calRecharge(100D, RechargeTypeEnum.CARD_RECHARGE.getValue());
        System.out.println(money4);
    }

    public Double calRecharge(Double charge, RechargeTypeEnum type) {

        if (type.equals(RechargeTypeEnum.E_BANK)) {
            return charge * 0.85;
        } else if (type.equals(RechargeTypeEnum.BUSI_ACCOUNTS)) {
            return charge * 0.90;
        } else if (type.equals(RechargeTypeEnum.MOBILE)) {
            return charge;
        } else if (type.equals(RechargeTypeEnum.CARD_RECHARGE)) {
            return charge + charge * 0.01;
        } else {
            return null;
        }

    }
}
