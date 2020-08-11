package com.samiu.design.proxy;

/**
 * 代理模式
 *
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Client {

    public static void main(String[] args) {
        RealSubject real = new RealSubject();
        ProxySubject proxy = new ProxySubject(real);
        proxy.visit();
    }
}
