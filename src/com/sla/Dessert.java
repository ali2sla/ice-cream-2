package com.sla;

class Dessert {
    String name;
    int calories;
    String type;
    boolean order;

    void explains() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Type: " + type);
    }

    int calories() {
        return calories;
    }
}
