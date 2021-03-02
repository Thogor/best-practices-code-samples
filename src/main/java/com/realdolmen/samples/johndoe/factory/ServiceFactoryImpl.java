package com.realdolmen.samples.johndoe.factory;

public class ServiceFactoryImpl implements ServiceFactory {

    @Override
    public Service makeService() {
        return new ConcreteImpl();
    }
}
