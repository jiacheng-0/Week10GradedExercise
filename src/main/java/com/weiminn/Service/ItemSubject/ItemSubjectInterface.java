package com.weiminn.Service.ItemSubject;

import com.weiminn.Observer.ItemObserverInterface;

public interface ItemSubjectInterface {
    public void register(ItemObserverInterface anObserver);
    public void unregister(ItemObserverInterface anObserver);
    public void notifyRegisteredUsers();

}
