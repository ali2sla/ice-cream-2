package com.sla;

class Foods {

   private String name;
    private int calories;
    private String type;
    private int size;
    private int price;
    private int tax;
    private boolean organic;
    private boolean order;


    //constructor
    Foods(String theName, int theCalories, String theType, int theSize, int thePrice, int theTax, boolean whatsOrganic, boolean theOrder) {
        name = theName;
        calories = theCalories;
        type = theType;
        size = theSize;
        price = thePrice;
        tax = theTax;
        organic = whatsOrganic;
        order = theOrder;
    }

    void explains() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Type: " + type);
        System.out.println("Serving size: " + size);
        if (theWhatsOrganic()) {
            System.out.println("It is organic");
        } else {
            System.out.println("It is not organic.");
        }
    }





    String theName(){return name;}
    int theCalories(){return calories;}
    String theType(){return type;}
    int theSize(){return size;}
    int thePrice(){return price;}
    int theTax(){return tax;}
    boolean theWhatsOrganic(){return organic;}
    boolean theOrder(){return order;}


}