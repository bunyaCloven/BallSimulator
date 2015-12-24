package com.ac.ball.view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

import com.ac.ball.model.Ball;

public class SwingBallView extends JLabel implements Observer {
	/***/
	private static final long serialVersionUID = 7883837874926303616L;

	public SwingBallView(Ball o) {
		super();
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		setText(((Ball) o).getState().toString());
	}

}
