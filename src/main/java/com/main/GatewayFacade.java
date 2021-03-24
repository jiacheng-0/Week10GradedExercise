package com.main;

import com.main.Service.Checkout.CheckoutServiceFactory;
import com.main.Service.ItemSubject.ItemSubjectServiceFactory;
import com.main.Service.Payment.PaymentServiceFactory;
import com.main.Service.ServiceType;
import com.main.Service.Shipping.ShippingServiceFactory;

public class GatewayFacade {

    private GatewayFacade() {
    }

    ;

    private static GatewayFacade INSTANCE;

    public static GatewayFacade getGatewayFacade() {
        if (INSTANCE == null) {
            INSTANCE = new GatewayFacade();
            System.out.println("GatewayFacade INSTANCE Instantiated");
        }
        return INSTANCE;
    }

    public void invokeService(ServiceType service, Command command) {
        if (service.equals(ServiceType.ShippingService)) {
            new ShippingServiceFactory().invokeService(command);

        } else if (service.equals(ServiceType.CheckoutService)) {
            new CheckoutServiceFactory().invokeService(command);

        } else if (service.equals(ServiceType.PaymentService)) {
            new PaymentServiceFactory().invokeService(command);

        } else if (service.equals(ServiceType.ItemSubjectService)) {
            new ItemSubjectServiceFactory().invokeService(command);
        }
    }
}
