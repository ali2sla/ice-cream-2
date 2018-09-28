package com.sla;

class Fruit extends Food {
    private boolean organic;

    // Constructors
    Fruit(String theName, int theCalories, String theType, int theSize, int thePrice, int theTax) {
        super(theName, theCalories, theType, theSize, thePrice, theTax);
    }

    /*void explains() {
        if (organic) {
            System.out.println("It is organic");
        } else {
            System.out.println("It is not organic.");
        }
    }

    /*boolean theOrganic() {
        return organic;
    }
    */

    void buy() {
        int cost;
        cost = thePrice() + thePrice()*theTax() ;
        System.out.println("It will cost $" + cost +" for Bob's Famous " + theName() + ".");
        }

}
