package com.sla;

class Fruit extends Foods {

    //constructor
    Fruit(String theName, int theCalories, String theType, int theSize, int thePrice, int theTax, boolean theOrder, boolean whatsOrganic){
        super(theName, theCalories, theType, theSize, thePrice, theTax, theOrder, whatsOrganic);
    }

    void explains2() {
        if (theWhatsOrganic()) {
            System.out.println("It is organic");
        } else {
            System.out.println("It is not organic.");
        }
    }

    void buy() {
        int cost;
        cost = thePrice() + thePrice()*theTax();
        System.out.println("It will cost $" + cost +" for Bob's Famous " + theName() + ".");
        }

}
