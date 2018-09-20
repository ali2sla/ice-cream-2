package com.sla;

class Fruit {
    String name;
    int calories;
    String type;
    int size;
    int price;
    int tax;
    boolean organic;

    void explains() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Type: " + type);
        System.out.println("Serving size: " + size);
        if (organic) {
            System.out.println("It is organic");
        } else {
            System.out.println("It is not organic.");
        }
    }

    void buy() {
        int cost;
        cost = price + price*tax;
        System.out.println("It will cost $" + cost +" for Bob's Famous " + name + ".");
        }

    int calories() {
        return calories;
    }
    int size() {
        return size;
    }
}
