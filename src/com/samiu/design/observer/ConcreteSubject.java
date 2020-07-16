package com.samiu.design.observer;

/**
 * @author Samiu 2020/7/16
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class ConcreteSubject extends Subject {

    public void method() {
        System.out.println("进行了一顿操作！");
        super.notifyObservers();
    }
}
