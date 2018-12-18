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
		// Note how all room walls need to be initialised (yes, I could have done this in the constructor, I know)
		for (Direction d: Direction.values()) {
			startRoom.setSide(d, new Wall());
			secondRoom.setSide(d, new Wall());
		}
		DoorWall dw = new DoorWall(startRoom, secondRoom);
		// By default doors are closed -- I haven't put in anything at the moment to allow players to open doors, so need to make sure they're open
		dw.open();
		startRoom.setSide(Direction.NORTH, dw);
		// Note the logical error in choice of direction here...
		secondRoom.setSide(Direction.NORTH, dw);
		mg.addRoom(startRoom);
		mg.addRoom(secondRoom);
		
		new MazeViewer(mg).setVisible(true);
	}

}