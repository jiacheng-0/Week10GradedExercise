package com.main;

import com.main.Service.ServiceType;

public class Main {
    public static void main(String[] args) {

        GatewayFacade.getGatewayFacade().invokeService(ServiceType.ItemSubjectService, new Command(CommandType.REGISTER));
        GatewayFacade.getGatewayFacade().invokeService(ServiceType.ItemSubjectService, new Command(CommandType.REGISTER));

    }
}
