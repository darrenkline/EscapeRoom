package rooms;
import java.awt.Image;

import tasks.ElectricalCirclesWordsearchTask;
import tasks.ElectricalWiresWikipediaTask;
import tasks.ReactorWallButtonTask;
import tasks.StartReactorTask;
import tasks.Task;
import util.Coord;
import util.Util;

public class ElectricalRoom extends Room {

	public ElectricalRoom() {
		Image backgroundImg = Util.loadImage("images/Electrical.png");
		backgroundImg = Util.scaleImage(backgroundImg, 800, 800);
		this.setBackground(backgroundImg);
		
		Task electricalCirclesWordsearchTask = new ElectricalCirclesWordsearchTask();
		
		/*Coords updated*/
		this.addTask(electricalCirclesWordsearchTask,
				new Coord(5,18),
				new Coord(6,18),
				new Coord(7,18)
				);

		/*Coords updated*/
		Task electricalWiresWikipediaTask = new ElectricalWiresWikipediaTask();
		this.addTask(electricalWiresWikipediaTask,
				new Coord(7,12),
				new Coord(7,13)
				);
	}

}
