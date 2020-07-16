package com.samiu.design.observer;

import java.util.Vector;

/**
 * @author Samiu 2020/7/16
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public abstract class Subject {

    private Vector<Observer> mObservers = new Vector<>();

    public void addObserver(Observer observer) {
        mObservers.add(observer);
    }

    public void delObserver(Observer observer) {
        mObservers.remove(observer);
    }

    public void notifyObservers() {
        mObservers.forEach(Observer::update);
    }
}
