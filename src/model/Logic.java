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
					listPersonas.add(new Sana(app, (int) app.random(10,790), (int) app.random(10,790), 7, takeElements[0]));
				}
			}
			if(takeElements[0].contentEquals("infectadas")) {
				for(int j=0; j<Integer.parseInt(takeElements[1]);j++) {
					listPersonas.add(new Infectada(app, (int) app.random(600,790), (int) app.random(600,790), 7, takeElements[0]));
				}
			}
			if(takeElements[0].contentEquals("recuperadas")) {
				for(int j=0; j<Integer.parseInt(takeElements[1]);j++) {
					listPersonas.add(new Recuperada(app, (int) app.random(10,790), (int) app.random(10,790), 7, takeElements[0]));
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
		
		infection();
	}
	
	public void sortElements(char c) {
		
	}
	
	public void infection() {
		for (int i=0; i<listPersonas.size();i++) {
			if(listPersonas.get(i).getType().contentEquals("sanas")) {
				if(PApplet.dist(listPersonas.get(i).getPosX(), listPersonas.get(i).getPosY(), listPersonas.get(i).getPosX(), listPersonas.get(i).getPosY())<3) {
					listPersonas.remove(listPersonas.get(i));
					listPersonas.add(new Infectada(app, app.random(10,790), (int) app.random(10,790), 7, takeElements[0]));
				}
			}
		}
	}

	/**
	 * @return the listPersonas
	 */
	public LinkedList<Persona> getListPersonas() {
		return listPersonas;
	}

	/**
	 * @param listPersonas the listPersonas to set
	 */
	public void setListPersonas(LinkedList<Persona> listPersonas) {
		this.listPersonas = listPersonas;
	}

}
