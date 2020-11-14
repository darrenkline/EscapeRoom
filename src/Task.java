import java.awt.Image;

import javax.swing.JFrame;

public class Task {

	private JFrame taskFrame;
	private boolean isUnlocked = false;
	private boolean isComplete = false;
	
	/*Possibly add a layout parameter as well?*/
	public Task (JFrame frame, int windowSize, Image img) {
		this.taskFrame = frame;
		/*TODO initialize frame with specified window size*/
		if (img != null) {
			
		}
	}
	
	
	/*Will likely be called by a button event listener in the customjpanel class*/
	public void startTask() {
		if (isUnlocked) {
			/*cause task window to open up*/
			
			
		}
	}
	
	public void unlockTask() {
		this.isUnlocked = true;
	}
	
	
	public void taskCompleted() {
		this.isComplete = true;
	}
	
}
