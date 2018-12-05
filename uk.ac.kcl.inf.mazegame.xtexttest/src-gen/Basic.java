import static uk.ac.kcl.inf.mazegame.fluentInterface.MakeMaze2.createMaze;

public class Basic {

	public static void main(String[] args) {
		createMaze()
			.withRoom(0)
				.description("You're in the dark and not very happy. Let's get out of here!!!")
			.end()
			
			
			.withRoom(1)
				.description("This is much better now!")
				.doorSouthTo(0)
			.end()
			
			.validate()
			
			.run();
	}
}

