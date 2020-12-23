package com.miguel.dagger2tutorial;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheel wheels;

    @Inject
    public Car(Engine engine, Wheel wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    public void drive(){
        Log.d(TAG, "driving...");
    }
}
