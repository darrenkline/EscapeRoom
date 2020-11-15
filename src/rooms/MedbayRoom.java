package rooms;
import java.awt.Image;

import tasks.GelTask;
import tasks.PosterTask;
import tasks.Task;
import util.Coord;
import util.Util;

public class MedbayRoom extends Room {

	public MedbayRoom() {
		Image backgroundImg = Util.loadImage("images/Medbay.png");
		backgroundImg = Util.scaleImage(backgroundImg, 800, 800);
		this.setBackground(backgroundImg);

		Task posterTask = new PosterTask();
		this.addTask(posterTask,
				new Coord(3,16),
				new Coord(4,16),
				new Coord(5,16),
				new Coord(3,17),
				new Coord(4,17),
				new Coord(5,17)
				);

		Task gelTask = new GelTask();
		this.addTask(gelTask,
				new Coord(20,21),
				new Coord(20,22),

				new Coord(21,21),
				new Coord(21,22),
				new Coord(21,23),

				new Coord(22,22),
				new Coord(22,23),

				new Coord(23,22),
				new Coord(23,23),

				new Coord(24,22),
				new Coord(24,23)
				);
	}

}
