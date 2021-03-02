package com.realdolmen.samples.johndoe.factory;

public class Application {

    private ServiceFactoryImpl serviceFactoryImpl;

    private Service getService() {
        return serviceFactoryImpl.makeService();
    }
}
