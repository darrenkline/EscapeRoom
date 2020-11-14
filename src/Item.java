

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.HashSet;

import javax.swing.JFrame;

public class Item {

	private String name;
	private HashSet <Coordinates> coords;
	private Image image;
	private JFrame task;
	private boolean taskStartable;
	
	public Item(String n, HashSet<Coordinates> c, Image i) {
		this.name = n;	
		this.coords = c;
		this.image = i;
		this.task = new JFrame();
		
		task.setSize(400,400);
		
	}
	
	public String getName() {
		return name;
	}
	
	public HashSet<Coordinates> getCoordinatesSet() {
		return this.coords;
	}
	
	public Image getImage() {
		return this.image;
	}
	
	public void setStartable(boolean startable) {
		taskStartable = startable;
	}
	
	public boolean getStartable() {
		return this.taskStartable;
	}
	
	/*This really needs to be done in the runner because every single task is going to need 
	 * a different layout. May want to make a task object*/
	public void initializeTasks() {
		task.setLayout(new FlowLayout());//can really be any layout
	}
	
}
