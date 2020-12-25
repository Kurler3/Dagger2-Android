package com.miguel.dagger2tutorial;

import android.util.Log;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheel wheels;

    @Inject
    public Car(Driver driver ,Engine engine, Wheel wheels) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }
    public void drive(){
        Log.d(TAG, "driving...");
    }
}
