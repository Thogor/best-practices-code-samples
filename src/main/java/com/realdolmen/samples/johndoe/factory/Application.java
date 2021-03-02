package com.realdolmen.samples.janolaerts.factory;

public class Application {

    private ServiceFactoryImpl serviceFactoryImpl;

    private Service getService() {
        return serviceFactoryImpl.makeService();
    }
}
