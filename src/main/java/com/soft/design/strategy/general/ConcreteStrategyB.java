package com.soft.design.strategy.general;

/**
 * @ClassName ConcreteStrategyB
 * @Description: 具体策略类B
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 20:27
 * @Version V1.0
 **/
public class ConcreteStrategyB implements IStrategy{
    @Override
    public void algorithm() {
        System.out.println("Strategy B");
    }
}
