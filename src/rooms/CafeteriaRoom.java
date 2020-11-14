package rooms;
import java.awt.Image;

import tasks.ComputerTask;
import tasks.NewspaperTask;
import tasks.Task;
import tasks.WireTask;
import util.Coord;
import util.Util;

public class CafeteriaRoom extends Room {

	public CafeteriaRoom() {
		Image backgroundImg = Util.loadImage("images/cafeteriaNewspaper.jpg");
		backgroundImg = Util.scaleImage(backgroundImg, 800, 800);
		this.setBackground(backgroundImg);

		Task newspaperTask = new NewspaperTask();
		this.addTask(newspaperTask,
				new Coord(14,19),
				new Coord(13,20),
				new Coord(14,20),
				new Coord(14,21)
				);

		Task wireTask = new WireTask(newspaperTask);
		this.addTask(wireTask,
				new Coord(4,2),
				new Coord(5,2)
				);

		Task computerTask = new ComputerTask(wireTask);
		this.addTask(computerTask,
				new Coord(14,9),
				new Coord(15,9),
				new Coord(15,10)
				);
	}

}
