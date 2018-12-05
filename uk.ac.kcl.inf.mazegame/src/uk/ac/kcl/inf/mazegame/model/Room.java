package uk.ac.kcl.inf.mazegame.model;

public class Room {
	private Wall[] sides = new Wall[4];
	private String description;

	public Room(String description) {
		this.setDescription(description);
	}

	public Wall getSide(Direction side) {
		return sides[side.ordinal()];
	}

	public void setSide(Direction side, Wall wall) {
		sides[side.ordinal()] = wall;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}