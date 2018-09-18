package com.sla;

class Main {

    public static void main(String[] args) {

        // List of Fruits
        Fruit cherry = new Fruit();
        cherry.name = "Cherry";
        cherry.calories = 77;
        cherry.type = "Fruit";
        cherry.order = false;

        // List of Dessert
        Dessert sundae = new Dessert();
        sundae.name = "Sundae";
        sundae.calories = 284;
        sundae.type = "Dessert";
        sundae.order = false;

        // Buy fruit
        System.out.println("Information:");
        cherry.explains();
        System.out.println();
        sundae.explains();
        System.out.println();

    }
}


