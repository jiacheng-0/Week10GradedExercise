package com.weiminn.Observer;

public class SubscriberB implements ItemObserverInterface{
    @Override
    public void update() {
        System.out.println("Updated Type B!");

    }
}
