package com.samiu.design.state;

/**
 * 状态模式——改造前
 *
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class OriginTvController {

    //开机状态
    private static final int POWER_ON = 1;
    //关机状态
    private static final int POWER_OFF = 2;
    private int mState = POWER_OFF;

    private void powerOn() {
        mState = POWER_ON;
        if (mState == POWER_OFF)
            System.out.println("Turn power on!");
    }

    private void powerOff() {
        mState = POWER_OFF;
        if (mState == POWER_ON)
            System.out.println("Turn power off!");
    }

    private void nextChannel() {
        if (mState == POWER_ON)
            System.out.println("Turn next channel");
        else
            System.out.println("Is power off");
    }

    private void prevChannel() {
        if (mState == POWER_ON)
            System.out.println("Turn pre channel");
        else
            System.out.println("Is power off");
    }

    private void turnUp() {
        if (mState == POWER_ON)
            System.out.println("Turn up");
        else
            System.out.println("Is power off");
    }

    private void turnDown() {
        if (mState == POWER_ON)
            System.out.println("Turn down");
        else
            System.out.println("Is power off");
    }
}
