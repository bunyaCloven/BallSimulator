package com.ac.ball.controller;

import java.awt.GridLayout;

import javax.swing.JFrame;

import com.ac.ball.model.Ball;
import com.ac.ball.model.Menu;
import com.ac.ball.view.SwingBallView;
import com.ac.ball.view.SwingMenuView;

public class SwingJuggler {
	private Ball ball;
	private SwingBallView view;

	public SwingJuggler(Ball ball, SwingBallView view) {
		this.setBall(ball);
		this.setView(view);
	}

	private void setView(SwingBallView view) {
		this.view = view;
	}

	private void setBall(Ball ball) {
		this.ball = ball;
	}

	public void control() {
		JFrame main = new JFrame();
		main.setLayout(new GridLayout());
		main.add(view);
		main.add(new SwingMenuView(new Menu(), ball));
		main.setSize(300, 100);
		main.setLocationRelativeTo(null);
		main.setVisible(true);
	}
}
