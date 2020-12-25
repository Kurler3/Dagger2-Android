package com.miguel.dagger2tutorial;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Driver {
    // Imagine you don't own this class so can't use Inject annotation so you need to
    // create a module that provides it

    String name;

    public Driver(String name) {
        this.name = name;
    }
}
