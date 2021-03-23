package com.weiminn.Service.Payment;

import com.weiminn.Command;
import com.weiminn.Service.ServiceFactoryInterface;

public class PaymentServiceFactory implements ServiceFactoryInterface {

    @Override
    public void invokeService(Command command) {
        new PaymentService().processService(command);
    }
}
