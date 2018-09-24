package com.sla;

class Dessert extends Food  {

    boolean order;

    void explains() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Type: " + type);
        System.out.println("Serving size: " + size);
        if (order) {
            System.out.println("Bob's Famous " + name + " is added to your wishlist.");
        } else {
            System.out.println("Bob's Famous " + name + " is not in your wishlist.");
        }
    }

        void buy () {
            int cost;
            cost = price + price * tax;
            System.out.println("It will cost $" + cost + " for Bob's Famous " + name + ".");
        }

        int calories () {
            return calories;
        }
        int size () {
            return size;
        }
    }