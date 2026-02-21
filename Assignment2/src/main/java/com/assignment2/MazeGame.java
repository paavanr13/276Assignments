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

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.North, door);
        room1.setSide(Direction.South, factory.makeWall());
        room1.setSide(Direction.East, factory.makeWall());
        room1.setSide(Direction.West, factory.makeWall());

        room2.setSide(Direction.North, factory.makeWall());
        room2.setSide(Direction.South, door);
        room2.setSide(Direction.East, factory.makeWall());
        room2.setSide(Direction.West, factory.makeWall());

        return maze;
    }
}