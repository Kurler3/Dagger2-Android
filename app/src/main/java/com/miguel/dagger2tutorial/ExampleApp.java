package com.miguel.dagger2tutorial;

import android.app.Application;

public class ExampleApp extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.factory().create(new DriverModule("xiao mi"));

    }
    public AppComponent getAppComponent(){
        return component;
    }
}
