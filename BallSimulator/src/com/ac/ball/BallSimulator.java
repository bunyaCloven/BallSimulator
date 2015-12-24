package com.ac.ball;

import java.io.IOException;

import com.ac.ball.controller.SwingJuggler;
import com.ac.ball.model.Ball;
import com.ac.ball.view.SwingBallView;

public class BallSimulator {
	public static void main(String... args) throws IOException {
		Ball ball = new Ball();
		SwingBallView view = new SwingBallView(ball);
		SwingJuggler controller = new SwingJuggler(ball, view);
		controller.control();
	}
}
