package game;

public class Game {

	private final int DESIRED_FPS = 60;

	private boolean exit = false;

	private void start() throws InterruptedException {
		// Main game loop
		while (!exit) {
			long timeBefore = System.currentTimeMillis();
			tick();
			render();
			long timeAfter = System.currentTimeMillis();
			long remainingTimeToWait = ((long) (1.0 / DESIRED_FPS * 1000) - (timeAfter - timeBefore));
			if (remainingTimeToWait > 0) {
				Thread.sleep(remainingTimeToWait);
			}
		}
	}

	private void tick() {

	}

	private void render() {

	}

	public static void main(String[] args) throws InterruptedException {
		new Game().start();
	}

}
