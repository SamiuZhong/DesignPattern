package com.samiu.design.builder;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class MacBookBuilder extends Builder {

    private Computer mComputer = new MacBook();


    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS(String OS) {
        mComputer.setOS(OS);
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
