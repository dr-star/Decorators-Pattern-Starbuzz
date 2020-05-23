package com.casettalab;

import com.casettalab.model.*;
import com.casettalab.type.Size;

public class Main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Whip(espresso);
        espresso = new Soy(espresso);
        espresso = new Mocha(espresso);
        printProduct(espresso.getDescription(), espresso.cost());


        Beverage decaf = new Decaf();
        decaf.setSize(Size.LARGE);
        decaf = new Soy(decaf);
        printProduct(decaf.getDescription(), decaf.cost());

    }

    private static void printProduct(String description, double cost) {
        System.out.println("Selected product " + description + "\tPrice " + cost );
    }
}
