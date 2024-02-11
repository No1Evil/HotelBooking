package org.evilprojects.hotelbooking.managers;

import org.evilprojects.hotelbooking.hotel.IRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RoomManager {
    List<IRoom> rooms = new ArrayList<>();
    public RoomManager(){

    }
    public boolean addRoom(IRoom room){
        return rooms.add(room);
    }
    public boolean removeRoom(IRoom room){
        return rooms.remove(room);
    }
    public Optional<IRoom> getAnyRoom(){
        return rooms.stream().findAny();
    }
    public Optional<IRoom> getRoomByName(String name){
        return rooms.stream().filter(iRoom -> iRoom.getName().equalsIgnoreCase(name)).findAny();
    }
    public Optional<IRoom> getRoomById(int id){
        return rooms.stream().filter(iRoom -> iRoom.getId() == id).findAny();
    }
    public List<IRoom> getBusyRooms(){
        return rooms.stream().filter(IRoom::isBusy).collect(Collectors.toList());
    }
    public List<IRoom> getNonBusyRooms(){
        List<IRoom> rooms = new ArrayList<>(this.rooms);
        rooms.removeAll(getBusyRooms());
        return rooms;
    }
}
