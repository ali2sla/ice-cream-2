package com.sla;

class Snackshop extends Food {

    public static void main(String[] args) {

        Food[] food = new Food[11];

        // List of Fruits
        food[0] = new Fruit("Cherry",77,"Fruit",1,6,8/100);
        food[1]= new Fruit("Apple", 95, "Fruit", 1, 1, 8/100);

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
        food[6] = new Dessert ("Sundae",284, "Dessert",1,1, 8/100, false);

        food[7] = new Dessert ("Red Velvet Cake",453, "Dessert",1,30, 8/100, false);

        food[8] = new Dessert ("Tiramisu",240, "Dessert",1,35, 8/100, true);

        food[9] = new Dessert ("Jello",110, "Dessert",1,1, 8/100, true);

        food[10] = new Dessert ("Brownie",132, "Dessert",1,1, 8/100, true);

        food[11] = new Dessert ("Pudding",792, "Dessert",6,3, 8/100, false);


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
        tiramisu.explains();
        System.out.println();
        jello.explains();
        System.out.println();
        brownie.explains();
        System.out.println();
        pudding.explains();
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
        tiramisu.buy();
        System.out.println();
        jello.buy();
        System.out.println();
        brownie.buy();
        System.out.println();
        pudding.buy();
        System.out.println();

        // Check total calories
        int totalcalories = cherry.calories + apple.calories + pineapple.calories + cantaloupe.calories + orange.calories + peach.calories + tiramisu.calories + jello.calories;
        System.out.println("The total number of calories is " + totalcalories + ".");

        // Check total price
        int totalprice = cherry.price + apple.price + pineapple.price + cantaloupe.price + orange.price + peach.price + tiramisu.price + jello.price;
        System.out.println("The total cost of the food is $" + totalprice + ".");

    }
}


