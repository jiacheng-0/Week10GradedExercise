package com.main;

import com.main.Observer.ItemObserverInterface;
import com.main.Service.ServiceType;

public class Client implements ItemObserverInterface {

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + " updated.");
    }

    void callStuff() {
        Command command = new Command(CommandType.REGISTER, this);
        GatewayFacade.getGatewayFacade().invokeService(ServiceType.PaymentService, command);

        System.out.println("---- ---- ----");

        GatewayFacade.getGatewayFacade().invokeService(ServiceType.ItemSubjectService, command);

        System.out.println("---- ---- ----");

        GatewayFacade.getGatewayFacade().invokeService(ServiceType.ItemSubjectService, command);

    }

    public static void main(String[] args) {
        new Client().callStuff();

        GatewayFacade.getGatewayFacade().invokeService(ServiceType.ItemSubjectService, new Command(CommandType.NOTIFY));
    }
}
