package com.main.Service.Checkout;

import com.main.Service.ServiceFactoryInterface;
import com.main.*;

public class CheckoutServiceFactory implements ServiceFactoryInterface {
    @Override
    public void invokeService(Command command) {
        new CheckoutService().processService(command);
    }
}
