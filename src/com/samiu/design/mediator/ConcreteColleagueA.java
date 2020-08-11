package com.samiu.design.mediator;

/**
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class ConcreteColleagueA extends Colleague{

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("Colleague A put message to mediator ~");
    }
}
