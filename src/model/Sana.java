package model;

import processing.core.PApplet;

public class Sana extends Persona{

	public Sana(PApplet app, float posX, float posY, int tam, String type) {
		super(app, posX, posY, tam, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		app.fill(0,255,0);
		app.ellipse(posX, posY, tam, tam);
	}

}
