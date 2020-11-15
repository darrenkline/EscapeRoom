package tasks;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JFrame;
import util.Util;

public class ElectricalWiresWikipediaTask extends Task {

	/*NO IMAGE FOR THIS TASK. just a jlabel that says "Enter website URL:" followed by a textbox that accepts 
	 * "https://en.wikipedia.org/wiki/Mountain_Dew" as the correct answer. Once they enter the correct answer, 
	 * a text label will come up that says “Enter the total number of links found in the ‘article’ section of the 
	 * Mountain Dew Wikipedia Page: (numerical answer only, no words)” followed by a text entry box. 
	 * 134 is the correct answer. Correctly answering this task completes the task and moves to the next room.*/
	@Override
	public void runTask(JFrame mainFrame) {
		Image img = null;//Util.loadImage("/images/ElectricalWordsearch.png");
		//img = Util.scaleImage(img, 500, 500);

		JFrame taskFrame = new JFrame();
		taskFrame.setLayout(new BorderLayout());
	}

}
