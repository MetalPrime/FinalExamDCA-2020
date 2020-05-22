package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private String[] textElements;
	private String[] takeElements;
	private LinkedList<Persona> listPersonas;

	public Logic(PApplet app) {
		this.app = app;
		textElements = app.loadStrings("./../data/archive.txt");
		listPersonas = new LinkedList<Persona>();
		for(int i=0; i<textElements.length;i++) {
			takeElements = textElements[i].split(":");
			if(takeElements[0].contentEquals("sanas")) {
				for(int j=0; j<Integer.parseInt(takeElements[1]);j++) {
					listPersonas.add(new Sana(app, (int) app.random(10,790), (int) app.random(10,790), 7));
				}
			}
			if(takeElements[0].contentEquals("infectadas")) {
				for(int j=0; j<Integer.parseInt(takeElements[1]);j++) {
					listPersonas.add(new Infectada(app, (int) app.random(10,790), (int) app.random(10,790), 7));
				}
			}
			if(takeElements[0].contentEquals("recuperadas")) {
				for(int j=0; j<Integer.parseInt(takeElements[1]);j++) {
					listPersonas.add(new Recuperada(app, (int) app.random(10,790), (int) app.random(10,790), 7));
				}
			}
		}
		System.out.println(listPersonas.size());
	}

	public void createdElements() {
		// TODO Auto-generated method stub
		for (Persona persona : listPersonas) {
			persona.draw();
			new Thread(persona).start();
		}
		
	}
	
	public void sortElements() {
		
	}

}
