package org.evilprojects.hotelbooking.util;

public class math {
    public static double getDiscount(double price, int discount){
        return discount < 0 || discount > 100 ? price : price * (1 - (double)discount / 100);
    }
}
