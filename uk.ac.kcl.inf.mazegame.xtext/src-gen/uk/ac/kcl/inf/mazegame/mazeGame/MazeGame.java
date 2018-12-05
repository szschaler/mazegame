/**
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.mazegame.mazeGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maze Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mazegame.mazeGame.MazeGame#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mazegame.mazeGame.MazeGamePackage#getMazeGame()
 * @model
 * @generated
 */
public interface MazeGame extends EObject
{
  /**
   * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.mazegame.mazeGame.RoomDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rooms</em>' containment reference list.
   * @see uk.ac.kcl.inf.mazegame.mazeGame.MazeGamePackage#getMazeGame_Rooms()
   * @model containment="true"
   * @generated
   */
  EList<RoomDefinition> getRooms();

} // MazeGame
