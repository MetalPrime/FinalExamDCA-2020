package model;

import processing.core.PApplet;

public class Infectada extends Persona{

	public Infectada(PApplet app, float posX, float posY, int tam) {
		super(app, posX, posY, tam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		app.fill(255,0,0);
		app.ellipse(posX, posY, tam, tam);
	}

}
