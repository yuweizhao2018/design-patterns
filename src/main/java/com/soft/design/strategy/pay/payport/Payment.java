package com.soft.design.strategy.pay.payport;

import com.soft.design.strategy.pay.MsgResult;

/**
 * @ClassName Payment
 * @Description: 支付策略抽象类
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 21:06
 * @Version V1.0
 **/
public abstract class Payment {
    //抽象方法，获取支付方式名称
    public abstract String getName();

    //抽象方法，调用对应的支付网管
    public abstract MsgResult invokePayGateWay();

    /**
     * @Description: 支付的通用逻辑放到抽象类里面实现
     * @Params [uid, amount]
     * @Return com.soft.design.strategy.pay.MsgResult
     * @Author ZhaoZhao.Yu
     * @Date 2021/7/22 21:57
     */
    public MsgResult pay(String uid,double amount){
        //余额是否足够
        if(queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        this.invokePayGateWay();
        return new MsgResult(200,"支付成功","支付金额："+amount);
    }

    protected abstract double queryBalance(String uid);


}
