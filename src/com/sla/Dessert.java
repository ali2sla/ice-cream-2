package com.sla;

class Dessert extends Foods {

    //constructor
    Dessert(String theName, int theCalories, String theType, int theSize, int thePrice, int theTax, boolean whatsOrganic, boolean theOrder){
        super(theName, theCalories, theType, theSize, thePrice, theTax, whatsOrganic, theOrder);
    }

    void explains() {
        System.out.println("Name: " + theName());
        System.out.println("Calories: " + theCalories());
        System.out.println("Type: " + theType());
        System.out.println("Serving size: " + theSize());
        if (whatsOrganic()) {
            System.out.println("It is organic");
        } else {
            System.out.println("It is not organic.");
        }
        if (theOrder()) {
            System.out.println("Bob's Famous " + theName() + " is added to your wishlist.");
        } else {
            System.out.println("Bob's Famous " + theName() + " is not in your wishlist.");
        }
    }

        void buy(){
            int cost;
            cost = thePrice() + thePrice() * theTax();
            System.out.println("It will cost $" + cost + " for Bob's Famous " + theName() + ".");
        }

    }