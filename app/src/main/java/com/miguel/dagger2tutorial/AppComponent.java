package com.miguel.dagger2tutorial;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent.Factory getActivityComponentFactory();


    @Component.Factory
    interface Factory{

        // This method takes a DriverModule because we have to pass the drivers name
        // in the constructor of that class

        AppComponent create(DriverModule driverModule);
    }
}
