package com.samiu.design.strategy;

/**
 * 策略模式
 *
 * @author Samiu 2020/7/16
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.method();
    }
}
