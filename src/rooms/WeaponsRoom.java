package rooms;
import java.awt.Image;

import tasks.CommsHeadPhoneCallTask;
import tasks.CommsStickyNoteTask;
import tasks.ElectricalCirclesWordsearchTask;
import tasks.ElectricalWiresWikipediaTask;
import tasks.ReactorWallButtonTask;
import tasks.StartReactorTask;
import tasks.Task;
import tasks.WeaponsButtonClickTask;
import tasks.WeaponsMineSweeperTask;
import util.Coord;
import util.Util;

public class WeaponsRoom extends Room {

	public WeaponsRoom() {
		Image backgroundImg = Util.loadImage("images/Weapons.jpg");
		backgroundImg = Util.scaleImage(backgroundImg, 800, 800);
		this.setBackground(backgroundImg);
		
		Task mineSweeperTask = new WeaponsMineSweeperTask();
		
		/*Coords Updated*/
		this.addTask(mineSweeperTask,
				new Coord(12,11),
				new Coord(12,12),
				new Coord(12,13),
				new Coord(12,14),
				
				new Coord(13,11),
				new Coord(13,12),
				new Coord(13,13),
				new Coord(13,14),
				
				new Coord(14,11),
				new Coord(14,12),
				new Coord(14,13),
				new Coord(14,14),
				
				new Coord(15,11),
				new Coord(15,12),
				new Coord(15,13),
				new Coord(15,14),
				
				new Coord(16,11),
				new Coord(16,12),
				new Coord(16,13),
				new Coord(16,14)
				
				);

		/*Coords Updated*/
		Task weaponsButtonClickTask = new WeaponsButtonClickTask(mineSweeperTask);
		this.addTask(weaponsButtonClickTask,
				new Coord(2,11),
				new Coord(3,11)
				);
	}

}
