package com.samiu.design.mediator;

/**
 * 中介者模式
 *
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        mediator.method();
    }
}
