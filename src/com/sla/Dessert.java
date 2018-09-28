package com.sla;

class Dessert extends Food {

    // Constructors
    Dessert(String theName, int theCalories, String theType, int theSize, int thePrice, int theTax) {
        super(theName, theCalories, theType, theSize, thePrice, theTax);
    }

    boolean order;

    void explains() {

        if (order) {
            System.out.println("Bob's Famous " + theName() + " is added to your wishlist.");
        } else {
            System.out.println("Bob's Famous " + theName() + " is not in your wishlist.");
        }
    }

    void buy() {
        int cost;
        cost = thePrice() + thePrice()*theTax() ;
        System.out.println("It will cost $" + cost +" for Bob's Famous " + theName() + ".");
    }
}
