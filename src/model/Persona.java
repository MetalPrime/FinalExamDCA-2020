package model;

import processing.core.PApplet;

public abstract class Persona implements Runnable,Comparable<Persona>{
	
	protected PApplet app;
	protected float posX;
	protected float posY;
	protected int tam;
	protected int movX;
	protected int movY;
	protected String type;

	public Persona(PApplet app,float posX,float posY,int tam,String type) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		this.type = type;
		this.movX = 1;
		this.movY = 1;
	}
	
	public abstract void draw();
	
	public void move() {
		if(this.posX<=0 || this.posX>=600 ) {
			this.movX*=-1;
		}
		if(this.posY<=0 || this.posY>=600) {
			this.movY*=-1;
		}
		
		this.posX+=this.movX;
		this.posY+=this.movY;
	}
	
	public void paintList(int cantidad,int X,int Y) {
		app.textSize(30);
		app.fill(0);
		app.text(this.type,50, 500);
		app.text(cantidad,X,Y);
	}
	

	/**
	 * @return the posX
	 */
	public float getPosX() {
		return posX;
	}

	/**
	 * @param posX the posX to set
	 */
	public void setPosX(float posX) {
		this.posX = posX;
	}

	/**
	 * @return the posY
	 */
	public float getPosY() {
		return posY;
	}

	/**
	 * @param posY the posY to set
	 */
	public void setPosY(float posY) {
		this.posY = posY;
	}

	/**
	 * @return the tamX
	 */
	public int getTamX() {
		return tam;
	}

	/**
	 * @param tamX the tamX to set
	 */
	public void setTamX(int tamX) {
		this.tam = tamX;
	}

	/**
	 * @return the tamY
	 */

	/**
	 * @return the movX
	 */
	public int getMovX() {
		return movX;
	}

	/**
	 * @param movX the movX to set
	 */
	public void setMovX(int movX) {
		this.movX = movX;
	}

	/**
	 * @return the movY
	 */
	public int getMovY() {
		return movY;
	}

	/**
	 * @param movY the movY to set
	 */
	public void setMovY(int movY) {
		this.movY = movY;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		move();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
