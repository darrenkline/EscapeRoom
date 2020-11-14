import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;

import javax.imageio.ImageIO;
import javax.swing.*;

import javax.swing.JFrame;
public class Runner 
{

	private static Room currentRoom;
	private static JFrame mainFrame;
	private static int BUTTON_ROWS = 30;
	private static int BUTTON_COLS = 30;
	private static boolean invisibleButtons = true;
	private static boolean testing = true;

	public static void runCafeteria() throws MalformedURLException, IOException {
		
		/*Retrieve background image for cafeteria*/
		Image cafeteriaImage = getImage("/images/cafeteriaNewspaper.jpg");
		cafeteriaImage = cafeteriaImage.getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		

		/*Newspaper: (14,19), (13,20), (14,20), (14,21)*/
		HashSet<Coordinates> newspaperCoords = new HashSet<Coordinates>();
		newspaperCoords.add(new Coordinates(14,19));
		newspaperCoords.add(new Coordinates(13,20));
		newspaperCoords.add(new Coordinates(14,20));
		newspaperCoords.add(new Coordinates(14,21));
		Image cafeteriaNewspaperImage = getImage("/images/cafeteriaNewspaperItem.png");
		cafeteriaNewspaperImage = getScaledImage(cafeteriaNewspaperImage, 500, 500);
		JFrame newspaperTaskFrame = new JFrame();
		newspaperTaskFrame.setLayout(new BorderLayout());
		//newspaperTaskFrame.add(new JLabel().setIcon(new Icon(cafeteriaNewspaperImage)), BorderLayout.CENTER);
		Task cafeteriaNewspaperTask = new Task(newspaperTaskFrame, 600, cafeteriaNewspaperImage);
		Item newspaper = new Item("newspaper", newspaperCoords, cafeteriaNewspaperImage);	

		/*Wires: (4,2), (5,2)*/
		HashSet<Coordinates> wireCoords = new HashSet<Coordinates>();
		wireCoords.add(new Coordinates(4,2));
		wireCoords.add(new Coordinates(5,2));
		//TODO UPDATE IMAGE FILES*******************************************************************************************
		Image cafeteriaWiresImage = getImage("/images/wordsearch.png");
		Item wires = new Item("computer", wireCoords, cafeteriaWiresImage);


		/*Computer: (14,9), (15,9), (15,10)*/
		HashSet<Coordinates> computerCoords = new HashSet<Coordinates>();
		computerCoords.add(new Coordinates(14,9));
		computerCoords.add(new Coordinates(15,9));
		computerCoords.add(new Coordinates(15,10));
		//TODO UPDATE IMAGE FILES*******************************************************************************************
		Image cafeteriaComputerImage = getImage("/images/wordsearch.png");
		Item computer = new Item("computer", computerCoords, cafeteriaComputerImage);

		HashSet<Item> cafeteriaItems = new HashSet<Item>();
		cafeteriaItems.add(newspaper);
		cafeteriaItems.add(wires);
		cafeteriaItems.add(computer);

		//initializeCafeteriaTasks()		
		//insert cafeteriaItems into room constructor
		currentRoom = new Room(cafeteriaImage, cafeteriaItems, mainFrame, BUTTON_ROWS, BUTTON_COLS, invisibleButtons, testing);
	}

	
	/*Initializes the newspaper, wires, and computer tasks for the cafeteria*/
	public void initializeCafeteriaTasks() {
		
	}

	/*Accepts string image address, returns specified image*/
	public static Image getImage(String imageUrl) {
		JFrame bsFrame = new JFrame();

		Toolkit tk = Toolkit.getDefaultToolkit();
		Class<? extends JFrame> j = bsFrame.getClass();
		Image image = tk.createImage(j.getResource(imageUrl));
		return image;
	}
	
	/*Returns a scaled instance of the img provided*/
	public static Image getScaledImage(Image img, int width, int height) {
		return img.getScaledInstance(width, height, Image.SCALE_DEFAULT);
	}
	

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		/*TODO CTRL-F INSERT URL and replace with actual image file locations*/
		mainFrame = new JFrame(); 
		mainFrame.setSize(800,800);
		mainFrame.setResizable(false);
		/*TODO Make a start screen, then call set visible, then call runCafeteria()*/  
		mainFrame.setVisible(true);
		runCafeteria();
		mainFrame.setVisible(true);
	}




}
