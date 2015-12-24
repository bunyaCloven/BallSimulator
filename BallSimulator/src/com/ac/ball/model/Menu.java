package com.ac.ball.model;

import java.util.Observable;

public class Menu extends Observable {

	public String getMenu() {
		return "stop, move, terminate";
	}

}
