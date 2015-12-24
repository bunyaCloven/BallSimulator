package com.ac.ball.model;

import java.util.Observable;
import java.util.Observer;

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

	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
		setChanged();
		notifyObservers();
	}
}
