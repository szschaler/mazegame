/**
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.mazegame.mazeGame.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.mazegame.mazeGame.Direction;
import uk.ac.kcl.inf.mazegame.mazeGame.DoorDefinition;
import uk.ac.kcl.inf.mazegame.mazeGame.MazeGame;
import uk.ac.kcl.inf.mazegame.mazeGame.MazeGameFactory;
import uk.ac.kcl.inf.mazegame.mazeGame.MazeGamePackage;
import uk.ac.kcl.inf.mazegame.mazeGame.RoomDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MazeGamePackageImpl extends EPackageImpl implements MazeGamePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mazeGameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roomDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.mazegame.mazeGame.MazeGamePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MazeGamePackageImpl()
  {
    super(eNS_URI, MazeGameFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MazeGamePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MazeGamePackage init()
  {
    if (isInited) return (MazeGamePackage)EPackage.Registry.INSTANCE.getEPackage(MazeGamePackage.eNS_URI);

    // Obtain or create and register package
    MazeGamePackageImpl theMazeGamePackage = (MazeGamePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MazeGamePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MazeGamePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMazeGamePackage.createPackageContents();

    // Initialize created meta-data
    theMazeGamePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMazeGamePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MazeGamePackage.eNS_URI, theMazeGamePackage);
    return theMazeGamePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMazeGame()
  {
    return mazeGameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMazeGame_Rooms()
  {
    return (EReference)mazeGameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoomDefinition()
  {
    return roomDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoomDefinition_Name()
  {
    return (EAttribute)roomDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoomDefinition_Description()
  {
    return (EAttribute)roomDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoomDefinition_Doors()
  {
    return (EReference)roomDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoorDefinition()
  {
    return doorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoorDefinition_Direction()
  {
    return (EAttribute)doorDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoorDefinition_AdjacentRoom()
  {
    return (EReference)doorDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDirection()
  {
    return directionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MazeGameFactory getMazeGameFactory()
  {
    return (MazeGameFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mazeGameEClass = createEClass(MAZE_GAME);
    createEReference(mazeGameEClass, MAZE_GAME__ROOMS);

    roomDefinitionEClass = createEClass(ROOM_DEFINITION);
    createEAttribute(roomDefinitionEClass, ROOM_DEFINITION__NAME);
    createEAttribute(roomDefinitionEClass, ROOM_DEFINITION__DESCRIPTION);
    createEReference(roomDefinitionEClass, ROOM_DEFINITION__DOORS);

    doorDefinitionEClass = createEClass(DOOR_DEFINITION);
    createEAttribute(doorDefinitionEClass, DOOR_DEFINITION__DIRECTION);
    createEReference(doorDefinitionEClass, DOOR_DEFINITION__ADJACENT_ROOM);

    // Create enums
    directionEEnum = createEEnum(DIRECTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(mazeGameEClass, MazeGame.class, "MazeGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMazeGame_Rooms(), this.getRoomDefinition(), null, "rooms", null, 0, -1, MazeGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roomDefinitionEClass, RoomDefinition.class, "RoomDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoomDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoomDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRoomDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, RoomDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoomDefinition_Doors(), this.getDoorDefinition(), null, "doors", null, 0, -1, RoomDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doorDefinitionEClass, DoorDefinition.class, "DoorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoorDefinition_Direction(), this.getDirection(), "direction", null, 0, 1, DoorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoorDefinition_AdjacentRoom(), this.getRoomDefinition(), null, "adjacentRoom", null, 0, 1, DoorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(directionEEnum, Direction.class, "Direction");
    addEEnumLiteral(directionEEnum, Direction.NORTH);
    addEEnumLiteral(directionEEnum, Direction.EAST);
    addEEnumLiteral(directionEEnum, Direction.SOUTH);
    addEEnumLiteral(directionEEnum, Direction.WEST);

    // Create resource
    createResource(eNS_URI);
  }

} //MazeGamePackageImpl