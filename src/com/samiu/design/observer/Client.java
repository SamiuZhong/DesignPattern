package com.samiu.design.observer;

/**
 * 观察者模式
 *
 * @author Samiu 2020/7/16
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();

        subject.addObserver(observer);
        subject.method();
    }
}
