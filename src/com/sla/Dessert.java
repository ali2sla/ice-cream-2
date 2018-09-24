package com.sla;

class Dessert extends Foods {

    boolean order;

    void explains() {

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

    }