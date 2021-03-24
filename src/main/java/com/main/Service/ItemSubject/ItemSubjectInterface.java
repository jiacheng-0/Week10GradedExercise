package com.main.Service.ItemSubject;

import com.main.Observer.ItemObserverInterface;

public interface ItemSubjectInterface {

    void register(ItemObserverInterface anObserver);

    void unregister(ItemObserverInterface anObserver);

    void notifyRegisteredUsers();

}
