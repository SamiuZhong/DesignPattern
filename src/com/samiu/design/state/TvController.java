package com.samiu.design.state;

/**
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class TvController implements PowerController {

    private TvState mState;

    public void setState(TvState state) {
        mState = state;
    }

    @Override
    public void powerOn() {
        setState(new PowerOnState());
        System.out.println("Turn power on!");
    }

    @Override
    public void powerOff() {
        setState(new PowerOffState());
        System.out.println("Turn power off!");
    }

    public void nextChannel() {
        mState.nextChannel();
    }

    public void prevChannel() {
        mState.prevChannel();
    }

    public void turnUp() {
        mState.turnUp();
    }

    public void turnDown() {
        mState.turnDown();
    }
}
