package com.samiu.design.iterator;

/**
 * @author Samiu 2020/7/16
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handlerRequest(String condition) {
        if (condition.equals("001号")) {
            System.out.println("001号处理");
            return;
        } else successor.handlerRequest(condition);
    }
}
