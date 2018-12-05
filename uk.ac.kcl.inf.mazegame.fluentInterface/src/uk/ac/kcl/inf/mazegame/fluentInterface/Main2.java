package uk.ac.kcl.inf.mazegame.fluentInterface;

import static uk.ac.kcl.inf.mazegame.fluentInterface.MakeMaze2.createMaze;

public class Main2 {

	public static void main(String[] args) {
		createMaze()
			.withRoom(0)
				.description("You're in a dark and dank room.")
			.end()
			
			.withRoom(1)
				.description("You're in a brightly lit room.")
				.doorSouthTo(0)
			.end()
			
			.run();
	}
}
