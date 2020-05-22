package view;

import controller.MainController;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	MainController controlador;
	
	public void settings() {
		size(800,800);
	}
	
	public void setup() {
		controlador = new MainController (this);
	}
	
	public void draw() {
		controlador.paintElements();
	}
	
	public void keyReleased() {
		
	}

}
