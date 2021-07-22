package com.soft.design.strategy.pay.payport;

import com.soft.design.strategy.pay.MsgResult;

/**
 * @ClassName WechatPay
 * @Description: TODO
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 22:00
 * @Version V1.0
 **/
public class WechatPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public MsgResult invokePayGateWay() {
        System.out.println("调用京微信支付接口进行支付..");
        return null;
    }

    @Override
    protected double queryBalance(String uid) {
        return 263;
    }
}
