package model;

import java.util.Observable;

public class Ball extends Observable {
	private BallState state;

	public Ball() {
		setState(BallState.INITIAL);
	}

	public BallState getState() {
		return state;
	}

	public void setState(BallState state) {
		this.state = state;
		setChanged();
		notifyObservers();
	}

}
