package tasks;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JFrame;

import util.Util;

public class WireTask extends Task {

	public WireTask(Task preceedingTask) {
		super(preceedingTask);
	}

	@Override
	public void runTask(JFrame mainFrame) {
		Image img = Util.loadImage("/images/wordsearch.png");

		JFrame taskFrame = new JFrame();
		taskFrame.setLayout(new BorderLayout());
	}

}
