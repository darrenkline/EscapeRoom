package tasks;

import javax.swing.JFrame;

public abstract class Task {

	private Task preceedingTask;
	private boolean complete = false;

	public Task() {
		this.preceedingTask = null;
	}

	public Task(Task preceedingTask) {
		this.preceedingTask = preceedingTask;
	}

	public abstract void runTask(JFrame mainFrame);

	public boolean isAvailable() {
		return preceedingTask == null || preceedingTask.complete;
	}

	protected void markComplete() {
		this.complete = true;
	}

	public boolean isComplete() {
		return complete;
	}

}
