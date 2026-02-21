package com.assignment2;

/**
 * Class that represents a wall
 */
public class Wall extends MapSite{
    private int wall_number = 0;
    private static int wall_count = 0;

    /**
     * Constructor for wall class - prints the number of the wall you are creating
     * */
    public Wall(){
    wall_number=wall_count++;
    System.out.println("Creating wall #" + wall_number);
    }

    /**
     * Enter method - lets you know you hit a wall
     */
    @Override
    public void enter(){
        System.out.println("You hit a wall.");
    }

    @Override
    public String toString(){
        String wall_string = "Wall #" + wall_number;
        return wall_string;
    }
}