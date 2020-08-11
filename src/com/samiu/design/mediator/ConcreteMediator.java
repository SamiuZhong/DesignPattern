package com.samiu.design.mediator;

/**
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void method() {
        mColleagueA.action();
        mColleagueB.action();
    }
}
