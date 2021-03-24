package com.main.Observer;

public class SubscriberB implements ItemObserverInterface{
    @Override
    public void update() {
        System.out.println("Updated Subscriber Type B!");
    }
}
