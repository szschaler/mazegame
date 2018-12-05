/*
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.mazegame.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.inf.mazegame.mazeGame.MazeGame

import static org.junit.Assert.*
import uk.ac.kcl.inf.mazegame.mazeGame.MazeGamePackage
import uk.ac.kcl.inf.mazegame.validation.MazeGameValidator

@RunWith(XtextRunner)
@InjectWith(MazeGameInjectorProvider)
class MazeGameParsingTest {
	@Inject
	extension ParseHelper<MazeGame> parseHelper
	
	@Inject
	extension ValidationTestHelper

	@Test
	def void loadModel() {
		val result = '''
			maze {
				room _0 "You're in a dark and dank room." {}
				
				room _1 "You're in a brightly lit room." {
					south: _0
				}
				
				room _2 "Can you reach this room (it has the treasure!)?" {
					east: _1
				}
				
					room "You should be able to get here, though!" {
						east: _1
					}
				}
		'''.parse
		
		assertNotNull("Did not produce parse result", result)
		assertTrue("Had parsing errors", result.eResource.errors.isEmpty)
		
		result.assertWarning(MazeGamePackage.Literals.ROOM_DEFINITION, MazeGameValidator.UNREACHABLE_ROOM)
	}
}
