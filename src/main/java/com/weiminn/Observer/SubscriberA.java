package com.weiminn.Observer;

public class SubscriberA implements ItemObserverInterface {
    @Override
    public void update() {
        System.out.println("Updated Subscriber Type A!");
    }
}
