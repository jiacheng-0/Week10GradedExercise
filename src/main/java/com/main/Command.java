package com.main;

import com.main.Observer.ItemObserverInterface;

public class Command {

    public CommandType commandType;

    public ItemObserverInterface observer;

    public Command(CommandType commandType) {
        this.commandType = commandType;
    }

    public Command(CommandType commandType, ItemObserverInterface observer) {
        this.commandType = commandType;
        this.observer = observer;
    }
}

