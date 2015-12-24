package com.ac.ball.view;

import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.ac.ball.model.Ball;
import com.ac.ball.model.BallState;
import com.ac.ball.model.Menu;

public class SwingMenuView extends JPanel {
	/***/
	private static final long serialVersionUID = 4003384392609327189L;
	private Menu menu;
	private Ball ball;

	public SwingMenuView(Menu menu, Ball ball) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.menu = menu;
		this.ball = ball;
		for (String value : this.menu.getMenu().split(", ")) {
			JButton button = new JButton(value);
			button.addActionListener(this::action);
			this.add(button);
		}
	}

	private void action(ActionEvent e) {
		String action = ((JButton) e.getSource()).getText();
		switch (action) {
		case "stop":
			doStop();
			break;
		case "move":
			doMove();
			break;
		case "terminate":
			doTerminate();
			break;
		default:
			break;
		}
	}

	private void doStop() {
		if (BallState.MOVING.equals(ball.getState())) {
			ball.setState(BallState.STOPPED);
		}
	}

	private void doMove() {
		switch (ball.getState()) {
		case INITIAL:
		case STOPPED:
			ball.setState(BallState.MOVING);
		default:
		}
	}

	private void doTerminate() {
		if (BallState.STOPPED.equals(ball.getState())) {
			ball.setState(BallState.TERMINATED);
		}
	}
}
