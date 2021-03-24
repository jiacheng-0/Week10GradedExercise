package com.main.Service.Payment;

import com.main.Command;
import com.main.Service.ServiceInterface;

public class PaymentService implements ServiceInterface {
    @Override
    public void processService(Command command) {
        System.out.println("Payment processed.");
    }
}