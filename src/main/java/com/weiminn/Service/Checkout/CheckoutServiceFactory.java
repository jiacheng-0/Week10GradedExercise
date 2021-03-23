package com.weiminn.Service.Checkout;

import com.weiminn.Service.ServiceFactoryInterface;
import com.weiminn.*;

public class CheckoutServiceFactory implements ServiceFactoryInterface {
    @Override
    public void invokeService(Command command) {
        new CheckoutService().processService(command);
    }
}
