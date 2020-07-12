package com.samiu.design.prototype;

import java.util.ArrayList;

/**
 * @author Samiu 2020/7/12
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Thing implements Cloneable {

    public Thing() {
        System.out.println("走到了构造方法！");
    }

    private ArrayList<String> mList = new ArrayList<>();

    @Override
    protected Thing clone() throws CloneNotSupportedException {
        Thing thing = null;
        thing = (Thing) super.clone();

//        //深拷贝
//        thing.mList = (ArrayList<String>) this.mList.clone();

        return thing;
    }

    public void setValue(String value) {
        mList.add(value);
    }

    public ArrayList<String> getValue() {
        return mList;
    }
}
