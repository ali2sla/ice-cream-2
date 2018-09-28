package com.sla;

class Snackshop extends Food {

    public static void main(String[] args) {

        Foods[] food = new Foods[11];

        // List of Fruits
        food[0] = new Fruit("Cherry",77,"Fruit",1,6,8/100,false);
        food[1]= new Fruit("Apple", 95, "Fruit", 1, 1, 8/100,true);
        food[2]= new Fruit("Pineapple",452, "Fruit", 1, 4, 8/100, true);
        food[3]= new Fruit("Cantaloupe", 186, "Fruit", 1, 7, 8/100, true);
        food[4]= new Fruit("Orange", 186, "Fruit", 1, 7, 8/100,false);
        food[5]= new Fruit("Peach", 59, "Fruit", 1, 4, 8/100, true);


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


