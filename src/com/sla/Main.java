package com.sla;

class Main {

    public static void main(String[] args) {

        // List of Fruits
        Fruit cherry = new Fruit();
        cherry.name = "Cherry";
        cherry.calories = 77;
        cherry.type = "Fruit";
        cherry.organic = true;

        Fruit apple = new Fruit();
        apple.name = "Apple";
        apple.calories = 95;
        apple.type = "Fruit";
        cherry.organic = true;

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
        sundae.explains();
        System.out.println();

        // Check total calories
        int totalcalories = cherry.calories() + sundae.calories + recake.calories;
        System.out.println("The total number of calories is " + totalcalories + ".");
    }
}


