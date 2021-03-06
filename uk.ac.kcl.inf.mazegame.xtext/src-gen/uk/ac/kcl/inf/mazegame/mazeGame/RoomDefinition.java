/**
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.mazegame.mazeGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mazegame.mazeGame.RoomDefinition#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mazegame.mazeGame.RoomDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mazegame.mazeGame.RoomDefinition#getDoors <em>Doors</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mazegame.mazeGame.MazeGamePackage#getRoomDefinition()
 * @model
 * @generated
 */
public interface RoomDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.mazegame.mazeGame.MazeGamePackage#getRoomDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mazegame.mazeGame.RoomDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see uk.ac.kcl.inf.mazegame.mazeGame.MazeGamePackage#getRoomDefinition_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mazegame.mazeGame.RoomDefinition#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Doors</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.mazegame.mazeGame.DoorDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doors</em>' containment reference list.
   * @see uk.ac.kcl.inf.mazegame.mazeGame.MazeGamePackage#getRoomDefinition_Doors()
   * @model containment="true"
   * @generated
   */
  EList<DoorDefinition> getDoors();

} // RoomDefinition
