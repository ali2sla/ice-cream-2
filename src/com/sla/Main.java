package com.sla;

class Snackshop {

    public static void main(String[] args) {

        // Create Foods
        Foods[] foods = new Foods[12];

        // List of Fruits
        foods[0] = new Fruit("Cherry", 77, "Fruit", 1, 6, 8 / 100, true, false);
        foods[1] = new Fruit("Apple", 95, "Fruit", 1, 1, 8 / 100, false, false);
        foods[2] = new Fruit("Pineapple", 452, "Fruit", 1, 4, 8 / 100, true, false);
        foods[3] = new Fruit("Cantaloupe", 186, "Fruit", 1, 7, 8 / 100, false, false);
        foods[4] = new Fruit("Orange", 186, "Fruit", 1, 7, 8 / 100, true, true);
        foods[5] = new Fruit("Peach", 59, "Fruit", 1, 4, 8 / 100, false, false);

        // List of Dessert
        foods[6] = new Dessert("Sundae", 284, "Dessert", 1, 1, 8 / 100, false, false);
        foods[7] = new Dessert("Red Velvet Cake", 453, "Dessert", 1, 30, 8 / 100, false, false);
        foods[8] = new Dessert("Tiramisu", 240, "Dessert", 1, 35, 8 / 100, false, true);
        foods[9] = new Dessert("Jello", 110, "Dessert", 1, 1, 8 / 100, false, true);
        foods[10] = new Dessert("Brownie", 132, "Dessert", 1, 1, 8 / 100, false, true);
        foods[11] = new Dessert("Pudding", 792, "Dessert", 6, 3, 8 / 100, false, false);


        // Get inforrmation
        System.out.println("Information:");
        for (int i = 0; i < 12; i++) {
            foods[i].explains();
            System.out.println("\n");
        }

            // Get cost
            System.out.println("\n" + "Receipt:");
            for (int i = 0; i < 12; i++) {
                foods[i].buy();
            }

            // Check total price
            int totalprice = 0;
            for (int i = 0; i < 12; i++) {
                totalprice = totalprice + foods[i].thePrice();
            }
            System.out.println("The total cost of the food is $" + totalprice + ".");
        }
    }


