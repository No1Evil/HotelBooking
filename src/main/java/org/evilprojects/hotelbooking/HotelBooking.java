package org.evilprojects.hotelbooking;

import org.evilprojects.hotelbooking.managers.RoomManager;

public class HotelBooking {
    private static final RoomManager roomManager = new RoomManager();

    public static void main(String[] args){

    }

    public static RoomManager getRoomManager() {
        return roomManager;
    }
}
