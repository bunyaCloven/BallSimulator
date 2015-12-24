package com.ac.ball;

import java.io.IOException;

import com.ac.ball.controller.ConsoleJuggler;
import com.ac.ball.model.Ball;
import com.ac.ball.view.ConsoleBallView;

public class BallSimulator {
	public static void main(String... args) throws IOException {
		Ball ball = new Ball();
		ConsoleBallView view = new ConsoleBallView(ball);
		ConsoleJuggler controller = new ConsoleJuggler(ball, view);
		controller.control();
	}
}
