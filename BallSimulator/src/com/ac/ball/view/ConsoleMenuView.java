package com.ac.ball.view;

import com.ac.ball.model.Menu;

public class ConsoleMenuView {
	private Menu menu;

	public ConsoleMenuView(Menu menu) {
		this.setMenu(menu);
	}

	public void show() {
		System.out.println(menu.getMenu());
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

}
