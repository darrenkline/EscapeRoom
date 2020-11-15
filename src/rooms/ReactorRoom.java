package rooms;
import java.awt.Image;
import tasks.ReactorWallButtonTask;
import tasks.StartReactorTask;
import tasks.Task;
import util.Coord;
import util.Util;

public class ReactorRoom extends Room {

	public ReactorRoom() {
		Image backgroundImg = Util.loadImage("images/Reactor.png");
		backgroundImg = Util.scaleImage(backgroundImg, 800, 800);
		this.setBackground(backgroundImg);
		
		Task startReactorTask = new StartReactorTask();
		
		/*Coords updated*/
		this.addTask(startReactorTask,
				new Coord(21,13),
				new Coord(22,13),
				new Coord(22,13),
				
				new Coord(20,14),
				new Coord(21,14),
				new Coord(22,14),
				new Coord(23,14),	
				
				new Coord(21,15),
				new Coord(22,15),
				new Coord(23,15)
				);

		/*Coords updated*/
		Task reactorWallButtonTask = new ReactorWallButtonTask();
		this.addTask(reactorWallButtonTask,
				new Coord(9,19)
				);
	}

}
