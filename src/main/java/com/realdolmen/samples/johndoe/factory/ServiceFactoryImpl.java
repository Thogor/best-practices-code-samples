package com.realdolmen.samples.janolaerts.factory;

public class ServiceFactoryImpl implements ServiceFactory {

    @Override
    public Service makeService() {
        return new ConcreteImpl();
    }
}
