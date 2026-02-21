package com.assignment2;
/**
 * Class for anything that you can enter/hit: rooms, doors, or walls
 */
public abstract class MapSite{
    /**
     * Prints a different message when you enter a room, door, or when you hit a wall
     */
    public abstract void enter();
}