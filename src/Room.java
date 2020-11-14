import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.*;  

/*Update this class to become an individual room. Should accept the background image as parameter*/
public class Room {  
	private JFrame f;  
	
	//private HashMap<String, JFrame> tasks;
	private HashSet<Item> items;

	/*A Room is an individual room for the game. Each Room has a background image, a set of items, and a pointer to reference
	 * and access the main JFrame that hosts the entire game*/
	public Room(Image img, HashSet<Item> items, JFrame mainFrame, int buttonRows, int buttonCols, boolean invisibleButtons, boolean testing) throws MalformedURLException, IOException {  
		
		this.items = items;
		mainFrame.add(new CustomJPanel(buttonRows, buttonCols, img, items, invisibleButtons, testing));
	
		/*f=new JFrame();  
		f.setSize(800,800);
		f.add(new CustomJPanel(BUTTON_ROWS,BUTTON_COLS, img, items, invisibleButtons, testing));
		f.setResizable(false);
		f.setVisible(true); */ 
		
		//tasks = new HashMap<String, JFrame>();
	} 

	/*Updates frame when we complete one room and move to the next*/
	public void moveToNextRoom() {
		/*TODO actually just do in runner*/
		//update background photo
		//clear items and images
		//update new items and images and tasks
	}

	
	
	/*This doesnt get used*/
	public void setBackgroundImage() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Class<? extends JFrame> j = f.getClass();
		Image image = tk.createImage(j.getResource("/images/cafeteriaNewspaper.jpg"));
		Image newImage = image.getScaledInstance(800, 800, Image.SCALE_DEFAULT);

		/*Turn image into a JLabel that can be set as the background of the pane in our JFrame*/
		ImageIcon backgroundPic = new ImageIcon(); 
		backgroundPic.setImage(newImage);
		JLabel backgroundLabel = new JLabel(backgroundPic);

		f.getContentPane().add(backgroundLabel);
		//f.getContentPane().prepareImage(newImage, 600, 600, null);
		f.add(new JLabel(new ImageIcon(newImage)));
	}

	/*private int getNumGridRows() {
		return BUTTON_ROWS;
	}
	
	private int getNumGridCols() {
		return BUTTON_COLS;
	}*/

	private HashSet<Item> getRoomItems() {
		return this.items;
	}
	
	/*Main*/
	/*public static void main(String[] args) throws MalformedURLException, IOException {  
		new Room(null, null);  
	}  */





	/*
	 * //OVERRIDING PAINT
	private Image img;
	private JPanel panel;

	try {
	    img = ImageIO.read(new File("C:\\Users\\Cara\\Pictures\\christmas.jpg"));
	} catch (IOException e) {
	    e.printStackTrace();
	}

	panel = new JPanel(new GridBagLayout()){
	    @Override
	    public void paintComponent(Graphics g){
	        super.paintComponent(g);
	        g.drawImage(img, 0, 0, this);
	    }
	};*/
}  