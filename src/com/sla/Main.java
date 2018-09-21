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
        cantaloupe.organic = false;

        Fruit orange = new Fruit();
        orange.name = "Orange";
        orange.calories = 186;
        orange.type = "Fruit";
        orange.size = 1;
        orange.price = 7;
        orange.tax = 8/100;
        orange.organic = true;

        Fruit peach = new Fruit();
        peach.name = "Peach";
        peach.calories = 59;
        peach.type = "Fruit";
        peach.size = 1;
        peach.price = 4;
        peach.tax = 8/100;
        peach.organic = false;

        // List of Dessert
        Dessert sundae = new Dessert();
        sundae.name = "Sundae";
        sundae.calories = 284;
        sundae.type = "Dessert";
        sundae.size = 1;
        sundae.price = 1;
        sundae.tax = 8/100;
        sundae.order = false;

        Dessert redcake = new Dessert();
        redcake.name = "Red Velvet Cake";
        redcake.calories = 453;
        redcake.type = "Dessert";
        redcake.size = 1;
        redcake.price = 30;
        redcake.tax = 8/100;
        redcake.order = false;

        // Get inforrmation
        System.out.println("Information:");
        cherry.explains();
        System.out.println();
        apple.explains();
        System.out.println();
        pineapple.explains();
        System.out.println();
        cantaloupe.explains();
        System.out.println();
        orange.explains();
        System.out.println();
        peach.explains();
        System.out.println();
        sundae.explains();
        System.out.println();
        redcake.explains();
        System.out.println();

        // Get cost
        System.out.println("Receipt:");
        cherry.buy();
        System.out.println();
        apple.buy();
        System.out.println();
        pineapple.buy();
        System.out.println();
        cantaloupe.buy();
        System.out.println();
        orange.buy();
        System.out.println();
        peach.buy();
        System.out.println();
        sundae.buy();
        System.out.println();
        redcake.buy();
        System.out.println();

        // Check total calories
        int totalcalories = cherry.calories + apple.calories + pineapple.calories + cantaloupe.calories + orange.calories + peach.calories;
        System.out.println("The total number of calories is " + totalcalories + ".");

        // Check total price
        int totalprice = cherry.price + apple.price + pineapple.price + cantaloupe.price + orange.price + peach.price;
        System.out.println("The total cost of the food is $" + totalprice + ".");
    }
}


