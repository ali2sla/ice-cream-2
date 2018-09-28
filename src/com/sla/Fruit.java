package com.sla;

class Fruit extends Foods{
    private boolean organic;

    void explains2() {
        if (organic) {
            System.out.println("It is organic");
        } else {
            System.out.println("It is not organic.");
        }
    }

    void buy() {
        int cost;
        cost = price + price*tax;
        System.out.println("It will cost $" + cost +" for Bob's Famous " + name + ".");
        }

}
