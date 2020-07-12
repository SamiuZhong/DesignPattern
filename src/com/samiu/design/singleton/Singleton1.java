package com.samiu.design.singleton;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    /**
     * 饿汉式
     *
     * @return
     */
    public static Singleton1 getInstance() {
        return instance;
    }
}
