package com.samiu.design.mediator;

/**
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public abstract class Colleague {

    protected Mediator mMediator;

    public Colleague(Mediator mediator) {
        mMediator = mediator;
    }

    public abstract void action();
}
