package com.main.Service.Payment;

import com.main.Command;
import com.main.Service.ServiceFactoryInterface;

public class PaymentServiceFactory implements ServiceFactoryInterface {

    @Override
    public void invokeService(Command command) {
        new PaymentService().processService(command);
    }
}
