package uk.ac.kcl.inf.mazegame;

import uk.ac.kcl.inf.mazegame.model.Direction;
import uk.ac.kcl.inf.mazegame.model.DoorWall;
import uk.ac.kcl.inf.mazegame.model.MazeGame;
import uk.ac.kcl.inf.mazegame.model.Room;
import uk.ac.kcl.inf.mazegame.model.Wall;
import uk.ac.kcl.inf.mazegame.view.MazeViewer;

public class Main {

	public static void main(String[] args) {
		MazeGame mg = new MazeGame();
		Room startRoom = new Room("You're in a dark and dank room.");
		Room secondRoom = new Room("You're in a brightly lit room.");
		for (Direction d: Direction.values()) {
			startRoom.setSide(d, new Wall());
		}
		for (Direction d: Direction.values()) {
			secondRoom.setSide(d, new Wall());
		}
		DoorWall dw = new DoorWall(startRoom, secondRoom);
		dw.open();
		startRoom.setSide(Direction.NORTH, dw);
		secondRoom.setSide(Direction.NORTH, dw);
		mg.addRoom(startRoom);
		mg.addRoom(secondRoom);
		
		new MazeViewer(mg).setVisible(true);
	}

}