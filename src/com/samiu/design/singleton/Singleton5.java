package com.samiu.design.singleton;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Singleton5 {

    public Singleton5() {
    }

    private static class SingletonHolder {
        private static final Singleton5 sInstance = new Singleton5();
    }

    /**
     * 静态内部类
     *
     * @return
     */
    public static Singleton5 getInstance() {
        return SingletonHolder.sInstance;
    }
}
