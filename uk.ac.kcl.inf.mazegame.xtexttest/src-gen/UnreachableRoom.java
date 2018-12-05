import static uk.ac.kcl.inf.mazegame.fluentInterface.MakeMaze2.createMaze;

public class UnreachableRoom {

	public static void main(String[] args) {
		createMaze()
			.withRoom(0)
				.description("You're in a dark and dank room.")
			.end()
			
			
			.withRoom(1)
				.description("You're in a brightly lit room.")
				.doorSouthTo(0)
			.end()
			
			
			.withRoom(2)
				.description("Can you reach this room (it has the treasure!)?")
				.doorEastTo(1)
			.end()
			
			
			.withRoom(3)
				.description("You should be able to get here, though!")
				.doorEastTo(1)
			.end()
			
			.validate()
			
			.run();
	}
}

