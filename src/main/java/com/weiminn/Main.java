package com.weiminn;

import com.weiminn.Service.ServiceType;

public class Main {
    public static void main(String[] args){
        GatewayFacade.INSTANCE.invokeService(ServiceType.ItemSubjectService, Command.REGISTER);
        GatewayFacade.INSTANCE.invokeService(ServiceType.ItemSubjectService, Command.REGISTER);
        GatewayFacade.INSTANCE.invokeService(ServiceType.ItemSubjectService, Command.REGISTER);
        GatewayFacade.INSTANCE.invokeService(ServiceType.ItemSubjectService, Command.REGISTER);
    }
}
