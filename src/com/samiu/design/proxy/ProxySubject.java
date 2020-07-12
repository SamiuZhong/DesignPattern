package com.samiu.design.proxy;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class ProxySubject extends Subject {

    private RealSubject mSubject;

    public ProxySubject(RealSubject subject) {
        mSubject = subject;
    }

    @Override
    public void visit() {
        mSubject.visit();
    }
}
