package com.samiu.design.command;

/**
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Invoker {

    private Command mCommand;

    public Invoker(Command command) {
        mCommand = command;
    }

    public void action(){
        mCommand.execute();
    }
}
