package uk.ac.kcl.inf.mazegame.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import uk.ac.kcl.inf.mazegame.model.Direction;
import uk.ac.kcl.inf.mazegame.model.DoorWall;
import uk.ac.kcl.inf.mazegame.model.MazeGame;
import uk.ac.kcl.inf.mazegame.model.Room;
import uk.ac.kcl.inf.mazegame.model.Wall;

@SuppressWarnings("serial")
public class MazeViewer extends JFrame {
	private Room currentRoom;
	private JTextArea jtaInfoDisplay;
	private JButton[] moveButtons = new JButton[4];
	
	public MazeViewer(MazeGame m) {
		super("Maze Game!");
		
		currentRoom = m.getStartRoom();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initComponents();
		pack();
		
		updateView();
	}

	private void initComponents() {
		setLayout(new BorderLayout());
		
		jtaInfoDisplay = new JTextArea(5, 80);
		jtaInfoDisplay.setEditable(false);
		
		add(new JScrollPane(jtaInfoDisplay), BorderLayout.CENTER);
		
		JPanel jpSouth = new JPanel(new FlowLayout());
		for (Direction side : Direction.values()) {
			moveButtons[side.ordinal()] = new JButton("Go " + side.getLabel());
			moveButtons[side.ordinal()].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					moveTo(side);
				}
			});
			jpSouth.add(moveButtons[side.ordinal()]);			
		}
		add(jpSouth, BorderLayout.SOUTH);		
	}
	
	private void updateView() {
		String displayText = currentRoom.getDescription();
		List<Direction> doors = new ArrayList<>(4);
		for (Direction side : Direction.values()) {
			if (currentRoom.getSide(side).isDoor()) {
				doors.add(side);
			}
		}
		
		if (doors.isEmpty()) {
			displayText += "\n\nThere are no doors out of this room.";
		} else {
			String doorsText = "\n\nThere are doors to";
			for (int i = 0; i < doors.size(); i++) {
				doorsText += " the " + doors.get(i).getLabel();
				if (i < doors.size() - 1) {
					doorsText += ",";
				}
			}
			displayText += doorsText + ".";
		}
		
		jtaInfoDisplay.setText(displayText);
		
		for (JButton jb: moveButtons) {
			jb.setEnabled(false);
		}
		for (Direction d: doors) {
			moveButtons[d.ordinal()].setEnabled(true);
		}
	}
	
	private void moveTo(Direction d) {
		Wall w = currentRoom.getSide(d);
		if (w.isDoor()) {
			DoorWall dw = (DoorWall) w;
			
			if (dw.isOpen()) {
				currentRoom = dw.getAdjacentRoom(currentRoom);
				updateView();
			}
		}
	}
}
