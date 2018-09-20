package com.sla;

class Snackshop {

    public static void main(String[] args) {

        // List of Fruits
        Fruit cherry = new Fruit();
        cherry.name = "Cherry";
        cherry.calories = 77;
        cherry.type = "Fruit";
        cherry.size = 1;
        cherry.price = 6;
        cherry.tax = 8/100;
        cherry.organic = true;

        Fruit apple = new Fruit();
        apple.name = "Apple";
        apple.calories = 95;
        apple.type = "Fruit";
        apple.size = 1;
        apple.price = 1;
        apple.tax = 8/100;
        apple.organic = false;

        Fruit pineapple = new Fruit();
        pineapple.name = "Pineapple";
        pineapple.calories = 452;
        pineapple.type = "Fruit";
        pineapple.size = 1;
        pineapple.price = 4;
        pineapple.tax = 8/100;
        pineapple.organic = true;

        Fruit cantaloupe = new Fruit();
        cantaloupe.name = "Cantaloupe";
        cantaloupe.calories = 186;
        cantaloupe.type = "Fruit";
        cantaloupe.size = 1;
        cantaloupe.price = 7;
        cantaloupe.tax = 8/100;
        cantaloupe.organic = true;

        Fruit orange = new Fruit();
        orange.name = "Orange";
        orange.calories = 186;
        orange.type = "Fruit";
        orange.size = 1;
        orange.price = 7;
        orange.tax = 8/100;
        orange.organic = true;

        // List of Dessert
        Dessert sundae = new Dessert();
        sundae.name = "Sundae";
        sundae.calories = 284;
        sundae.type = "Dessert";
        sundae.order = false;

        Dessert recake = new Dessert();
        recake.name = "Red Velvet Cake";
        recake.calories = 453;
        recake.type = "Dessert";
        recake.order = false;

        // Get inforrmation
        System.out.println("Information:");
        cherry.explains();
        System.out.println();
        apple.explains();
        System.out.println();
        pineapple.explains();
        System.out.println();
        sundae.explains();
        System.out.println();
        recake.explains();
        System.out.println();

        // Get cost
        System.out.println("Receipt:");
        cherry.buy();
        System.out.println();
        apple.buy();
        System.out.println();
        pineapple.buy();
        System.out.println();

        // Check total calories
        int totalcalories = cherry.calories + apple.calories + pineapple.calories + cantaloupe.calories + orange.calories + sundae.calories + recake.calories;
        System.out.println("The total number of calories is " + totalcalories + ".");
    }
}


