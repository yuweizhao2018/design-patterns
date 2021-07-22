package com.soft.design.strategy.pay.payport;

import com.soft.design.strategy.pay.MsgResult;

/**
 * @ClassName UnionPay
 * @Description: TODO
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 22:00
 * @Version V1.0
 **/
public class UnionPay extends Payment{
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public MsgResult invokePayGateWay() {
        System.out.println("调用银联支付接口进行支付...");
        return null;
    }

    @Override
    protected double queryBalance(String uid) {
        return 120;
    }
}
