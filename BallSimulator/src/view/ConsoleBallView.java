package view;

import java.util.Observable;
import java.util.Observer;

import model.Ball;

public class ConsoleBallView implements Observer {

	public ConsoleBallView(Ball o) {
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(((Ball) o).getState());
	}

}
