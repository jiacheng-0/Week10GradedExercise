package com.main.Service.ItemSubject;

import com.main.Command;
import com.main.Service.ServiceFactoryInterface;

public class ItemSubjectServiceFactory implements ServiceFactoryInterface {
    @Override
    public void invokeService(Command command) {
        ItemSubjectService.getINSTANCE().processService(command);
    }
}
