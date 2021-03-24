package com.main.Service.ItemSubject;

import com.main.Command;
import com.main.CommandType;
import com.main.Observer.ItemObserverInterface;
import com.main.Observer.SubscriberA;
import com.main.Service.ServiceInterface;

import java.util.ArrayList;

public class ItemSubjectService implements ServiceInterface, ItemSubjectInterface {

    private static ItemSubjectService INSTANCE;

    public static ItemSubjectService getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new ItemSubjectService();
        }
        return INSTANCE;
    }

    ArrayList<ItemObserverInterface> observers = new ArrayList<>();

    @Override
    public void processService(Command command) {
        System.out.println("Processing Item Subject: " + command.commandType);

        if (command.commandType == CommandType.REGISTER) {
            register(new SubscriberA());
            System.out.println("Registered 1 Subscriber");
        } else if (command.commandType == CommandType.UNREGISTER) {
            unregister(new SubscriberA());
        }
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
        System.out.println("Total: " + observers.size() + " subscribers");
        for (ItemObserverInterface observer: observers) {
            observer.update();
        }
    }
}