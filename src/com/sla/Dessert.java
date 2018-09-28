package com.sla;

class Dessert extends Foods {

    //constructor
    Dessert(String theName, int theCalories, String theType, int theSize, int thePrice, int theTax, boolean theOrder){
        super(theName, theCalories, theType, theSize, thePrice, theTax, theOrder);
    }

    void explains() {

        if (theOrder) {
            System.out.println("Bob's Famous " + getName() + " is added to your wishlist.");
        } else {
            System.out.println("Bob's Famous " + getName() + " is not in your wishlist.");
        }
    }

        void buy () {
            int cost;
            cost = getPrice() + getPrice() * getTax();
            System.out.println("It will cost $" + cost + " for Bob's Famous " + getName() + ".");
        }

    }