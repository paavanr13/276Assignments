package com.assignment2;

/**
 * Creates a basic maze using MazeFactory
 */
public class MazeGame {
    public Maze createMaze(MazeFactory factory){
        Maze maze = factory.makeMaze();
        Room room1 = factory.makeRoom();
        Room room2 = factory.makeRoom();
        Door door = factory.makeDoor(room1,room2);
    }
}