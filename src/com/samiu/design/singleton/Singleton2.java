package com.samiu.design.singleton;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    /**
     * 懒汉式（线程不安全）
     *
     * @return
     */
    public static Singleton2 getInstance() {
        if (instance == null)
            instance = new Singleton2();
        return instance;
    }
}
