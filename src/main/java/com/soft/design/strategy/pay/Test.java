package com.soft.design.strategy.pay;

import com.soft.design.strategy.pay.payport.PayStrategy;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 22:09
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","202107222210231001",324.5);
        MsgResult msgResult = order.pay(PayStrategy.ALI_PAY);
        System.out.println(msgResult);
    }
}
