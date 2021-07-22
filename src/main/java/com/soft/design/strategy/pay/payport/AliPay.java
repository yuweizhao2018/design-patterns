package com.soft.design.strategy.pay.payport;

import com.soft.design.strategy.pay.MsgResult;

/**
 * @ClassName AliPay
 * @Description: 支付宝策略实现类
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 21:58
 * @Version V1.0
 **/
public class AliPay extends Payment{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public MsgResult invokePayGateWay() {
        System.out.println("调用阿里支付接口进行支付...");
        return null;
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
