package com.samiu.design.builder;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director macDirector = new Director(builder);
        macDirector.construct("B450M", "Mi Display", "MacOs X");

        Computer macBook = builder.create();
        System.out.println(macBook.toString());
    }
}
