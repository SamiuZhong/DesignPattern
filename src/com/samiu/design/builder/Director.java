package com.samiu.design.builder;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Director {

    Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public void construct(String board,String display,String OS){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS(OS);
    }
}
