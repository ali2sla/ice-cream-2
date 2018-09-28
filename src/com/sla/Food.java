package com.sla;

class Food {

    private String name;
    private int calories;
    private String type;
    private int size;
    private int price;
    private int tax;

    //constructor
    Food (String theName, int theCalories, String theType, int theSize, int thePrice, int theTax) {
        name = theName;
        calories = theCalories;
        type = theType;
        size = theSize;
        price = thePrice;
        tax = theTax;
    }

    void explains() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Type: " + type);
        System.out.println("Serving size: " + size);
    }


    String theName() {
        return name;
    }
    int theCalories() {
        return calories;
    }
    String theType() {
        return type;
    }
    int theSize() {
        return size;
    }
    int thePrice() {
        return price;
    }
    int theTax() {
        return tax;
    }
}