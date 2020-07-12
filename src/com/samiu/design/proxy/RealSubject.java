package com.samiu.design.proxy;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.println("Real visit");
    }
}
