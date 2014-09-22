import java.io.IOException;

import controller.ConsoleJuggler;
import view.ConsoleBallView;
import model.Ball;

public class BallSimulator {
	public static void main(String... args) throws IOException {
		Ball ball = new Ball();
		ConsoleBallView view = new ConsoleBallView(ball);
		ConsoleJuggler controller = new ConsoleJuggler(ball, view);
		controller.control();
	}
}
