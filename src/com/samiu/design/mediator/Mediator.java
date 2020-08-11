package com.samiu.design.mediator;

/**
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public abstract class Mediator {

    protected ConcreteColleagueA mColleagueA;
    protected ConcreteColleagueB mColleagueB;

    public abstract void method();

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        mColleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        mColleagueB = colleagueB;
    }
}
