package com.sla;

public class Foods {

    String name;
    int calories;
    String type;
    int size;
    int price;
    int tax;

    void explains() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Type: " + type);
        System.out.println("Serving size: " + size);
    }

    int calories() {
        return calories;
    }
    int size() {return size;}

}