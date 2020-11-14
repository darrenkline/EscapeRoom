package main;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JFrame;

import rooms.CafeteriaRoom;
import rooms.MedbayRoom;
import rooms.Room;
public class Runner {

	private static Room currentRoom;
	private static JFrame mainFrame;

	private static Room cafeteria;
	private static Room medbay;

	private static void initRooms() {
		Runner.cafeteria = new CafeteriaRoom();
		Runner.medbay = new MedbayRoom();

		Runner.cafeteria.setNextRoom(medbay);
	}


	public static void main(String[] args) throws MalformedURLException, IOException {
		initRooms();

		mainFrame = new JFrame();
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		RoomPanel roomPanel = new RoomPanel(mainFrame, Runner.cafeteria);
		mainFrame.add(roomPanel);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}




}
