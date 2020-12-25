package com.miguel.dagger2tutorial;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelModule {
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        return new Tires();
    }

    @Provides
    static Wheel provideWheel(Rims rims, Tires tires) {
        return new Wheel(rims, tires);
    }
}
