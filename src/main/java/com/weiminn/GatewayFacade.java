package com.weiminn;

import com.weiminn.Service.ServiceType;
import com.weiminn.Service.Checkout.CheckoutServiceFactory;
import com.weiminn.Service.ItemSubject.ItemSubjectServiceFactory;
import com.weiminn.Service.Payment.PaymentServiceFactory;
import com.weiminn.Service.Shipping.ShippingServiceFactory;

public class GatewayFacade {

    private GatewayFacade(){};

    public static GatewayFacade INSTANCE = new GatewayFacade();

    public void invokeService(ServiceType service, Command command){
        if (service.equals(ServiceType.ShippingService)){
            new ShippingServiceFactory().invokeService(command);
        } else if (service.equals(ServiceType.CheckoutService)){
            new CheckoutServiceFactory().invokeService(command);
        } else if (service.equals(ServiceType.PaymentService)){
            new PaymentServiceFactory().invokeService(command);
        } else if (service.equals(ServiceType.ItemSubjectService)){
            new ItemSubjectServiceFactory().invokeService(command);
        }
    }
}
