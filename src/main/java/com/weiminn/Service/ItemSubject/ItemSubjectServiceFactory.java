package com.weiminn.Service.ItemSubject;

import com.weiminn.Command;
import com.weiminn.Service.ServiceFactoryInterface;

public class ItemSubjectServiceFactory implements ServiceFactoryInterface {
    @Override
    public void invokeService(Command command) {
        new ItemSubjectService().processService(command);
    }
}
