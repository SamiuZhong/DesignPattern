package com.samiu.design.state;

/**
 * 状态模式
 *
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Client {

    public static void main(String[] args) {
        TvController controller = new TvController();
        controller.powerOn();
        controller.nextChannel();
        controller.turnUp();
        controller.powerOff();
        controller.turnDown();
    }
}
