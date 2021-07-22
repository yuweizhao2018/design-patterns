package com.soft.design.strategy.pay;

import com.soft.design.strategy.pay.payport.PayStrategy;
import com.soft.design.strategy.pay.payport.Payment;

/**
 * @ClassName Order
 * @Description: TODO
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 21:11
 * @Version V1.0
 **/
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用："+payment.getName());
        System.out.println("本次交易金额为："+amount+",开始扣款");
        return payment.pay(uid,amount);
    }
}
