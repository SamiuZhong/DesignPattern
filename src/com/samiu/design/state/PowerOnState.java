package com.samiu.design.state;

/**
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("next channel!");
    }

    @Override
    public void prevChannel() {
        System.out.println("pre channel!");
    }

    @Override
    public void turnUp() {
        System.out.println("turn up!");
    }

    @Override
    public void turnDown() {
        System.out.println("turn down!");
    }
}
