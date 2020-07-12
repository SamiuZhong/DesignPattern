package com.samiu.design.abstractfactory;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public abstract class AbstractFactory {

    /**
     * 生产A产品的方法
     *
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * 生产B产品的方法
     *
     * @return
     */
    public abstract AbstractProductB createProductB();
}
