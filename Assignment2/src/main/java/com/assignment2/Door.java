package com.assignment2;

/**
 * Class that represents a door
 */
public class Door extends MapSite{
    private Room r1;
    private Room r2;
    private int door_number = 0;
    private static int door_count = 1;

    /**
     * Constructor prints the door number
     * Also prints the rooms the door is connecting
     */
    public Door(Room room1, Room room2){
        door_number=door_count++;
        System.out.println("Creating door #" + door_number
        + "between" + room1 + "and" + room2);
        r1=room1;
        r2=room2;
    }

    /**
     * Enter method - tells you that you have passed through a door
     */
    @Override
    public void enter(){
        System.out.println("You passed through a door");
    }

    @Override
    public String toString(){
        String door_string = "Door " + door_number;
        return door_string;
    }
    
}