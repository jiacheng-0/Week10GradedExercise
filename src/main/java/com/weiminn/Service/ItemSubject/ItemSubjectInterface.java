package com.weiminn.Service.ItemSubject;

import com.weiminn.Observer.ItemObserverInterface;

public interface ItemSubjectInterface {

    void register(ItemObserverInterface anObserver);

    void unregister(ItemObserverInterface anObserver);

    void notifyRegisteredUsers();

}
