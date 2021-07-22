package com.soft.design.strategy.general;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 20:30
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        //选择一个具体的策略类
        IStrategy strategy = new ConcreteStrategyA();
        //初始化上下文环境
        Context context = new Context(strategy);
        //执行具体算法策略
        context.algorithm();
    }
}
