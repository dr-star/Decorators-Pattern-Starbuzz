package com.casettalab.model;

import com.casettalab.model.Beverage;
import com.casettalab.model.CondimentDecorator;
import com.casettalab.type.Size;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double result = beverage.cost();

        switch (beverage.size) {
            case SMALL:
                result += 0.10;
            case MEDIUM:
                result += 0.15;
            case LARGE:
                result += 0.20;
            default:
                result += 0.10;
        }

        return result;
    }
}
