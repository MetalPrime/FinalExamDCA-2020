package controller;

import java.util.LinkedList;

import model.Logic;
import model.Persona;
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
	
	public void selectedChar(char c) {
		this.logic.sortElements(c);
	}
	
	public LinkedList<Persona> listPersons(){
		return this.logic.getListPersonas();
	}
	
}