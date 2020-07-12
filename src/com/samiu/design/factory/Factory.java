package com.samiu.design.factory;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class<T> c);
}
