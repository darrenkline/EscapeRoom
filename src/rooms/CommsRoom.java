package rooms;
import java.awt.Image;

import tasks.CommsHeadPhoneCallTask;
import tasks.CommsStickyNoteTask;
import tasks.ElectricalCirclesWordsearchTask;
import tasks.ElectricalWiresWikipediaTask;
import tasks.ReactorWallButtonTask;
import tasks.StartReactorTask;
import tasks.Task;
import util.Coord;
import util.Util;

public class CommsRoom extends Room {

	public CommsRoom() {
		Image backgroundImg = Util.loadImage("images/Comms.jpg");
		backgroundImg = Util.scaleImage(backgroundImg, 800, 800);
		this.setBackground(backgroundImg);
		
		Task commsStickyNoteTask = new CommsStickyNoteTask();
		
		/*Coords Updated*/
		this.addTask(commsStickyNoteTask,
				new Coord(10,8),
				new Coord(10,9)
				);

		/*Coords Updated*/
		Task commsHeadPhoneCallTask = new CommsHeadPhoneCallTask();
		this.addTask(commsHeadPhoneCallTask,
				new Coord(9,12),
				new Coord(9,13),
				new Coord(9,14),
				
				new Coord(10,12),
				new Coord(10,13),
				new Coord(10,14)
				);
	}

}
