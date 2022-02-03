package org.test;

public class FindTheDiscount {

    public static double discount(int price, int percentage) {
        return price-(price*percentage/100);
    }
}
