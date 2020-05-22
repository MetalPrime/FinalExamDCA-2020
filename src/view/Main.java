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
		size(600,600);
	}
	
	public void setup() {
		controlador = new MainController (this);
	}
	
	public void draw() {
		background(255);
		controlador.paintElements();
		
		for(int i=0; i< 1; i++) {
			int cantidad = 0;
			if(controlador.listPersons().get(i).getType().contentEquals("sanas")) {
				cantidad = controlador.listPersons().size();
				controlador.listPersons().get(i).paintList(cantidad, (i*25)+25, (i*25)+500);
			}
			
		}
		
		
	}
	
	public void keyReleased() {
		
	}

}
