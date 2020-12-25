package com.miguel.dagger2tutorial;

import javax.inject.Inject;

public class Wheel {

    private Rims mRims;
    private Tires mTires;


    public Wheel(Rims rims, Tires tires) {
        this.mRims = rims;
        this.mTires = tires;
    }
}
