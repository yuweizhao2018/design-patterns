package com.soft.design.strategy.general;

/**
 * @ClassName Context
 * @Description: 策略上下文环境
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 20:28
 * @Version V1.0
 **/
public class Context {
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void algorithm(){
        this.iStrategy.algorithm();
    }
}
