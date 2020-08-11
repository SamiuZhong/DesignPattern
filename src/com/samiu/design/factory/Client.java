package com.samiu.design.factory;

/**
 * 普通工厂模式
 *
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product productA = factory.createProduct(ConcreteProductA.class);
        Product productB = factory.createProduct(ConcreteProductB.class);

        productA.method();
        productB.method();
    }
}
