package com.casettalab.model;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
