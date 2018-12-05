package uk.ac.kcl.inf.mazegame.fluentInterface;

import static uk.ac.kcl.inf.mazegame.fluentInterface.MakeMaze.createMaze;

public class Main {

	public static void main(String[] args) {
		createMaze()
			.withRoom(0, (r) -> {r
				.description("You're in a dark and dank room."); })
			
			.withRoom(1, (r) -> {r
				.description("You're in a brightly lit room.")
				.doorSouthTo(0); })
			
			.run();
	}
}
