package com.casettalab.model;

import com.casettalab.type.Size;

public abstract class Beverage {
    Size size = Size.SMALL;
    String description = "";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
