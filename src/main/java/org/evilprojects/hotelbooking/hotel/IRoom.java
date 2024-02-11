package org.evilprojects.hotelbooking.hotel;

import org.evilprojects.hotelbooking.HotelBooking;

public interface IRoom {
    String getName();
    int getBedsNumber();
    void setBeds(int amount);
    double getPrice();
    double getPriceWithDiscount(int percentage);
    void setPrice(double price);
    boolean isBusy();
    void setBusy(boolean isBusy);
    int getId();
    default void register(){
        HotelBooking.getRoomManager().addRoom(this);
    }

}
