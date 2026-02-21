package com.assignment2;

/**
 * Class that represents a room
 */
public class Room extends MapSite {
    private int room_number;
    private static int room_count=1;

    private MapSite north_side;
    private MapSite south_side;
    private MapSite east_side;
    private MapSite west_side;

    public Room(){
        room_number=room_count++;
        System.out.println("Creating room #" + room_number);
    }

    void setSide(Direction dir, MapSite side){
        if (dir==Direction.North){
            north_side=side;
        }
        else if (dir==Direction.South){
            south_side=side;
        }
        else if (dir==Direction.West){
            west_side=side;
        }
        else if (dir==Direction.East){
            east_side=side;
        }
        System.out.println("Setting " + dir.toString() + " side of "
        + this.toString() + " to " + side.toString());
    }

    public String toString(){
        String room_string =  "Room #" + room_number;
        return room_string;
    }

    public void enter(){
        System.out.println("You are entering room #" + room_number);
    }

}