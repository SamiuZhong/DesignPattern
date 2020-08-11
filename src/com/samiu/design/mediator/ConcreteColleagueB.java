package com.samiu.design.mediator;

/**
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class ConcreteColleagueB extends Colleague{

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("Colleague B put message to mediator ~");
    }
}
