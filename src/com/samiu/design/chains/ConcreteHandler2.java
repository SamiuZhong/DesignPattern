package com.samiu.design.chains;

/**
 * @author Samiu 2020/7/16
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handlerRequest(String condition) {
        if (condition.equals("002号")) {
            System.out.println("002号处理");
            return;
        } else successor.handlerRequest(condition);
    }
}
