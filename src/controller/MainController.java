package controller;

import model.Logic;
import processing.core.PApplet;

public class MainController {
	private PApplet app;
	private Logic logic;

	public MainController(PApplet app) {
		this.app = app;
		this.logic = new Logic(app);
	}
	
	public void paintElements() {
		this.logic.createdElements();
	}
	
}