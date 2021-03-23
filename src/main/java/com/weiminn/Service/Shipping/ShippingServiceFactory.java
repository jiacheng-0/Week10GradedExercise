package com.weiminn.Service.Shipping;

import com.weiminn.Command;
import com.weiminn.Service.ServiceFactoryInterface;

public class ShippingServiceFactory implements ServiceFactoryInterface {

    @Override
    public void invokeService(Command command) {
        new ShippingService().processService(command);
    }
}
