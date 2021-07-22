package com.soft.design.strategy.general;

/**
 * @ClassName ConcreteStrategyA
 * @Description: 具体策略类A
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 20:26
 * @Version V1.0
 **/
public class ConcreteStrategyA implements IStrategy{
    @Override
    public void algorithm() {
        System.out.println("Strategy A");
    }
}
