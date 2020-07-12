package com.samiu.design.singleton;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    /**
     * 懒汉式（线程安全）
     *
     * @return
     */
    public static synchronized Singleton3 getInstance() {
        if (instance == null)
            instance = new Singleton3();
        return instance;
    }
}
