package uk.ac.kcl.inf.mazegame.model;

import java.util.ArrayList;
import java.util.List;

public class MazeGame {
	private List<Room> rooms = new ArrayList<>();
	private Room startRoom;
	
	public void addRoom(Room room) {
		rooms.add(room);
		if (startRoom == null) {
			setStartRoom (room);
		}
	}
	
	public void setStartRoom(Room room) {
		if (!rooms.contains(room)) {
			throw new IllegalStateException("Start room must be in list of rooms!");
		}
		
		startRoom = room;
	}
	
	public Room getStartRoom() {
		return startRoom;
	}
	
}
