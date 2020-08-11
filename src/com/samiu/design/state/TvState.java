package com.samiu.design.state;

/**
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public interface TvState {

    void nextChannel();

    void prevChannel();

    void turnUp();

    void turnDown();
}
