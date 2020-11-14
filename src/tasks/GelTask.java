package tasks;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JFrame;

import util.Util;

public class GelTask extends Task {

	@Override
	public void runTask(JFrame mainFrame) {
		Image img = Util.loadImage("/images/MedbayGel.jpg");

		JFrame taskFrame = new JFrame();
		taskFrame.setLayout(new BorderLayout());
	}

}
