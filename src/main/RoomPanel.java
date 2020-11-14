package main;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import rooms.Room;
import util.Coord;

@SuppressWarnings("serial")
public class RoomPanel extends JPanel {
	private static final boolean TESTING = true;

	private JFrame parentFrame;
	private JButton[][] buttonGrid;
	private Room room;

	public RoomPanel(JFrame parentFrame, Room room) {
		this.room = room;

		int nrows = Room.NROWS;
		int ncols = Room.NCOLS;

		buttonGrid = new JButton[nrows][ncols];
		this.setBackground(Color.white);
		this.setPreferredSize(parentFrame.getSize());
		this.setLayout(new GridLayout(nrows, ncols));

		JFrame testWindow = new JFrame();
		JLabel buttonIDLabel = new JLabel();
		if (TESTING) {
			testWindow.setLayout(new FlowLayout());
			testWindow.setSize(300,300);
			testWindow.setVisible(true);
		}

		// Create and initialize buttons
		for (int i = 0; i < nrows; i++) {
			for (int k = 0; k < ncols; k++) {
				JButton button = new JButton();
				button.setText("");

				final int row = i;
				final int col = k;
				button.addActionListener(e -> this.buttonCallback(row, col));

				if (TESTING) {
					button.setOpaque(false);
					button.setContentAreaFilled(false);
					//button.setBorderPainted(false);
				}

				if (TESTING) {
					String buttonNum ="Row: " + i +", Col: " + k;
					button.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							buttonIDLabel.setText(buttonNum);
							testWindow.add(buttonIDLabel);
						}
					});
				}

				buttonGrid[i][k] = button;
				add(button);
				System.out.println("i:" + i + " k:" + k);
			}
		}

	}

	private void buttonCallback(int row, int col) {
		if (this.room.runTask(this.parentFrame, new Coord(row, col)) && this.room.isComplete()) {
			// TODO: add popup introducing the next room?
			this.room = this.room.getNextRoom();
			this.repaint();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(room.getBackground(), 0, 0, null);
	}

}
