package com.sla;

class Fruit {
    String name;
    int calories;
    String type;
    boolean organic;

    void explains() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Type: " + type);
        if (organic) {
            System.out.println("It is organic");
        } else {
            System.out.println("It is not organic.");
        }
    }

    int calories() {
        return calories;
    }
}
