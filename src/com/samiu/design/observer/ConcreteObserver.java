package com.samiu.design.observer;

/**
 * @author Samiu 2020/7/16
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("收到消息，开始处理！");
    }
}
