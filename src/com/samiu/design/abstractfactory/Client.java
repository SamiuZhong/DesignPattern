package com.samiu.design.abstractfactory;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB1 = factory1.createProductB();
        AbstractProductB productB2 = factory2.createProductB();

        productA1.method();
        productA2.method();
        productB1.method();
        productB2.method();
    }
}
