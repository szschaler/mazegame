package uk.ac.kcl.inf.mazegame.fluentInterface;

import java.util.HashMap;
import java.util.Map;

import uk.ac.kcl.inf.mazegame.model.Direction;
import uk.ac.kcl.inf.mazegame.model.DoorWall;
import uk.ac.kcl.inf.mazegame.model.MazeGame;
import uk.ac.kcl.inf.mazegame.model.Room;
import uk.ac.kcl.inf.mazegame.model.Wall;
import uk.ac.kcl.inf.mazegame.view.MazeViewer;

public class MakeMaze2 {
	private MazeGame theGame = new MazeGame();
	private Map<Integer, Room> roomIndex = new HashMap<>();

	private MakeMaze2() {
	}

	public static MakeMaze2 createMaze() {
		return new MakeMaze2();
	}

	public RoomInitialiser withRoom(int roomID) {
		if (roomIndex.containsKey(roomID)) {
			throw new IllegalArgumentException("Room ID " + roomID + " already used.");
		}

		Room r = new Room("");
		for (Direction side : Direction.values()) {
			r.setSide(side, new Wall());
		}
		theGame.addRoom(r);
		roomIndex.put(roomID, r);

		return new RoomInitialiser(r);
	}

	public class RoomInitialiser {
		private Room room;

		RoomInitialiser(Room room) {
			this.room = room;
		}

		public RoomInitialiser description(String description) {
			room.setDescription(description);
			return this;
		}

		public RoomInitialiser doorNorthTo(int targetRoomID) {
			addDoor(targetRoomID, Direction.NORTH, Direction.SOUTH);

			return this;
		}

		public RoomInitialiser doorEastTo(int targetRoomID) {
			addDoor(targetRoomID, Direction.EAST, Direction.WEST);

			return this;
		}

		public RoomInitialiser doorSouthTo(int targetRoomID) {
			addDoor(targetRoomID, Direction.SOUTH, Direction.NORTH);

			return this;
		}

		public RoomInitialiser doorWestTo(int targetRoomID) {
			addDoor(targetRoomID, Direction.WEST, Direction.EAST);

			return this;
		}
		
		public MakeMaze2 end() {
			return MakeMaze2.this;
		}

		private void addDoor(int targetRoomID, Direction fromRoom, Direction toRoom) {
			Room targetRoom = roomIndex.get(targetRoomID);
			if (targetRoom != null) {
				DoorWall door = new DoorWall(room, targetRoom);
				door.open();
				room.setSide(fromRoom, door);
				targetRoom.setSide(toRoom, door);
			} else {
				throw new IllegalArgumentException("Room with ID " + targetRoomID + " not yet defined.");
			}
		}
	}

	public void run() {
		new MazeViewer(theGame).setVisible(true);
	}
}