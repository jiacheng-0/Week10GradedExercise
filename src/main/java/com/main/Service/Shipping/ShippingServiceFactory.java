package com.main.Service.Shipping;

import com.main.Command;
import com.main.Service.ServiceFactoryInterface;

public class ShippingServiceFactory implements ServiceFactoryInterface {

    @Override
    public void invokeService(Command command) {
        new ShippingService().processService(command);
    }
}
