package com.ac.ball.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observer;

import com.ac.ball.model.Ball;
import com.ac.ball.model.BallState;
import com.ac.ball.model.Menu;
import com.ac.ball.view.ConsoleMenuView;

public class ConsoleJuggler {

	private Ball ball;
	private Observer view;

	public ConsoleJuggler(Ball ball, Observer view) {
		this.setBall(ball);
		this.setView(view);
	}

	public void control() throws IOException {
		new ConsoleMenuView(new Menu()).show();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		for (;;) {
			String command = reader.readLine();
			switch (command) {
			case "stop":
				stop();
				break;
			case "move":
				move();
				break;
			case "terminate":
				terminate();
				break;
			default:
			}
		}
	}

	public void move() {
		if (BallState.INITIAL.equals(ball.getState())
				|| BallState.STOPPED.equals(ball.getState())) {
			ball.setState(BallState.MOVING);
		}
	}

	public void stop() {
		if (BallState.MOVING.equals(ball.getState())) {
			ball.setState(BallState.STOPPED);
		}
	}

	public void terminate() {
		if (BallState.STOPPED.equals(ball.getState())) {
			ball.setState(BallState.TERMINATED);
		}
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}

	public Observer getView() {
		return view;
	}

	public void setView(Observer view) {
		this.view = view;
	}
}
