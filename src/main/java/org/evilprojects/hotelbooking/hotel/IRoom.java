package org.evilprojects.hotelbooking.hotel;

import org.evilprojects.hotelbooking.HotelBooking;
import org.evilprojects.hotelbooking.consumer.IConsumer;

import java.util.Optional;

public interface IRoom {
    String getName();
    int getBedsNumber();
    void setBeds(int amount);
    double getPrice();
    double getPriceWithDiscount(int percentage);
    void setPrice(double price);
    boolean isBusy();
    Optional<IConsumer> getConsumer();
    void setConsumer(IConsumer consumer);
    int getId();
    default void register(){
        HotelBooking.getRoomManager().addRoom(this);
    }

}
