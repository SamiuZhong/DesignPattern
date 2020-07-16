package com.samiu.design.strategy;

/**
 * @author Samiu 2020/7/16
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Context {

    private Strategy mStrategy = null;

    public Context(Strategy strategy) {
        mStrategy = strategy;
    }

    public void method(){
        mStrategy.method();
    }
}
