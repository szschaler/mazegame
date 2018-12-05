/**
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.mazegame.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import uk.ac.kcl.inf.mazegame.mazeGame.DoorDefinition;
import uk.ac.kcl.inf.mazegame.mazeGame.MazeGame;
import uk.ac.kcl.inf.mazegame.mazeGame.RoomDefinition;
import uk.ac.kcl.inf.mazegame.services.MazeGameGrammarAccess;

@SuppressWarnings("all")
public class MazeGameFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MazeGameGrammarAccess _mazeGameGrammarAccess;
  
  protected void _format(final MazeGame mazeGame, @Extension final IFormattableDocument document) {
    EList<RoomDefinition> _rooms = mazeGame.getRooms();
    for (final RoomDefinition roomDefinition : _rooms) {
      document.<RoomDefinition>format(roomDefinition);
    }
  }
  
  protected void _format(final RoomDefinition roomDefinition, @Extension final IFormattableDocument document) {
    EList<DoorDefinition> _doors = roomDefinition.getDoors();
    for (final DoorDefinition doorDefinition : _doors) {
      document.<DoorDefinition>format(doorDefinition);
    }
  }
  
  public void format(final Object mazeGame, final IFormattableDocument document) {
    if (mazeGame instanceof XtextResource) {
      _format((XtextResource)mazeGame, document);
      return;
    } else if (mazeGame instanceof MazeGame) {
      _format((MazeGame)mazeGame, document);
      return;
    } else if (mazeGame instanceof RoomDefinition) {
      _format((RoomDefinition)mazeGame, document);
      return;
    } else if (mazeGame instanceof EObject) {
      _format((EObject)mazeGame, document);
      return;
    } else if (mazeGame == null) {
      _format((Void)null, document);
      return;
    } else if (mazeGame != null) {
      _format(mazeGame, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(mazeGame, document).toString());
    }
  }
}
