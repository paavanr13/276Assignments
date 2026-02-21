package com.assignment2;
import java.util.*;

public class Maze{
    private Set<Room> room_list = new HashSet<>();
    public Maze(){
        System.out.println("Creating a maze");
    }
    void addRoom(Room room){
        if (!room_list.contains(room)){
            room_list.add(room);
        }
    }

    

    
}