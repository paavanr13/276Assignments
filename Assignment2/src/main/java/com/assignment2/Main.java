package com.assignment2;

public class Main{
public static void main(String args[]){
    MazeFactory factory = new MazeFactory();
    MazeGame game = new MazeGame();
    Maze maze = game.createMaze(factory);
}
}