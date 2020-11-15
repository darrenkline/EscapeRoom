package tasks;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JFrame;
import util.Util;

public class CommsHeadPhoneCallTask extends Task {

	@Override
	public void runTask(JFrame mainFrame) {
		Image img = Util.loadImage("/images/CommsHeadPhoneCall.png");
		img = Util.scaleImage(img, 500, 500);

		JFrame taskFrame = new JFrame();
		taskFrame.setLayout(new BorderLayout());
	}

}
