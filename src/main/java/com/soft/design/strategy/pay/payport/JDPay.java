package com.soft.design.strategy.pay.payport;

import com.soft.design.strategy.pay.MsgResult;

/**
 * @ClassName JDPay
 * @Description: TODO
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 21:59
 * @Version V1.0
 **/
public class JDPay extends Payment{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    public MsgResult invokePayGateWay() {
        System.out.println("调用京东白条接口进行支付...");
        return null;
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
