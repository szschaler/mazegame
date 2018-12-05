package uk.ac.kcl.inf.mazegame.model;

public enum Direction {
	NORTH("North"), EAST("East"), SOUTH("South"), WEST("West");

	private String label;
	
	Direction(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
}
