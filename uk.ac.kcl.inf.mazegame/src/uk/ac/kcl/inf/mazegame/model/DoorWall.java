package uk.ac.kcl.inf.mazegame.model;

public class DoorWall extends Wall {
	private Room r1;
	private Room r2;
	private boolean isOpen;

	public DoorWall(Room r1, Room r2) {
		this.r1 = r1;
		this.r2 = r2;
		this.isOpen = false;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void open() {
		this.isOpen = true;
	}

	public void close() {
		this.isOpen = false;
	}

	public Room getAdjacentRoom(Room lookingFrom) {
		if (lookingFrom == r1) {
			return r2;
		} else if (lookingFrom == r2) {
			return r1;
		} else {
			return null;
		}
	}
	
	public boolean isDoor() {
		return true;
	}
}