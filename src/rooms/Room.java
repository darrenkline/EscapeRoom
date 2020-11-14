package rooms;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;

import tasks.Task;
import util.Coord;
import util.Util;

public abstract class Room {
	public static final int NROWS = 30;
	public static final int NCOLS = 30;

	private BufferedImage background;
	private ArrayList<Task> tasks = new ArrayList<>();
	private Task[][] taskGrid = new Task[NROWS][NCOLS];
	private Room nextRoom;

	/*Updates frame when we complete one room and move to the next*/
	public void moveToNextRoom() {
		/*TODO actually just do in runner*/
		//update background photo
		//clear items and images
		//update new items and images and tasks
	}

	protected void setBackground(Image img) {
		this.background = Util.toBufferedImage(img);
	}

	public BufferedImage getBackground() {
		return this.background;
	}

	protected void addTask(Task task, Coord... coords) {
		tasks.add(task);
		for (Coord coord : coords) {
			this.taskGrid[coord.row][coord.col] = task;
		}
	}

	public boolean runTask(JFrame mainFrame, Coord coord) {
		Task task = this.taskGrid[coord.row][coord.col];
		if (task != null && task.isAvailable()) {
			task.runTask(mainFrame);

			return true;
		}

		return false;
	}

	public boolean isComplete() {
		for (Task task : tasks) {
			if (!task.isComplete()) {
				return false;
			}
		}

		return true;
	}

	public void setNextRoom(Room nextRoom) {
		this.nextRoom = nextRoom;
	}

	public Room getNextRoom() {
		return this.nextRoom;
	}

}