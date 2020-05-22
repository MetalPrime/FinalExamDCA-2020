package model;

import processing.core.PApplet;

public class Recuperada extends Persona{

	public Recuperada(PApplet app, float posX, float posY, int tam) {
		super(app, posX, posY, tam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		app.fill(0,0,255);
		app.ellipse(posX, posY, tam, tam);
	}

}
