package com.weiminn.Service.ItemSubject;

import com.weiminn.Command;
import com.weiminn.Observer.ItemObserverInterface;
import com.weiminn.Observer.SubscriberA;
import com.weiminn.Service.ServiceInterface;

import java.util.ArrayList;

public class ItemSubjectService implements ServiceInterface, ItemSubjectInterface {

    ArrayList<ItemObserverInterface> observers = new ArrayList<>();

    @Override
    public void processService(Command command) {
        System.out.println("Item Subject: " + command.toString());
        register(new SubscriberA());
        notifyRegisteredUsers();
    }

    @Override
    public void register(ItemObserverInterface anObserver) {
        observers.add(anObserver);
    }

    @Override
    public void unregister(ItemObserverInterface anObserver) {
        observers.remove(anObserver);
    }

    @Override
    public void notifyRegisteredUsers() {
        System.out.println("Notifying: " + observers.size());
        for (ItemObserverInterface observer: observers) {
            observer.update();
        }
    }
}