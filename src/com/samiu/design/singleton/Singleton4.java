package com.samiu.design.singleton;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Singleton4 {

    private volatile static Singleton4 instance = null;

    public Singleton4() {
    }

    /**
     * 双重检查模式（DCL）
     *
     * @return
     */
    public static Singleton4 getInstance() {
        if (instance == null)
            synchronized (Singleton4.class) {
                if (instance == null)
                    instance = new Singleton4();
            }
        return instance;
    }
}
