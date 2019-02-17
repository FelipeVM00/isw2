package isw.simulador;

import javafx.scene.image.ImageView;

public abstract class Soldado implements Ataque{
	
	private ImageView sprite;
	private String color;
	private int puntosAtaque;
	private int puntosResistencia;
	
	public Soldado(String color, int pA, int pR) {
		this.setColor(color);
		this.setPuntosAtaque(pA);
		this.setPuntosResistencia(pR);
	}
	
	public Soldado() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPuntosAtaque() {
		return puntosAtaque;
	}

	public void setPuntosAtaque(int puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}

	public int getPuntosResistencia() {
		return puntosResistencia;
	}

	public void setPuntosResistencia(int puntosResistencia) {
		this.puntosResistencia = puntosResistencia;
	}
	
	public void disminuirPuntosResistencia(int puntos) {
		this.puntosResistencia -= puntos;
	}
	
	public boolean atacar(int puntos, Soldado soldado) {
		return Ataque.atacar(puntos, soldado);
	}
	
	public void setSprite(ImageView sprite) {
		this.sprite = sprite;
	}
	
	public ImageView getSprite() {
		return this.sprite;
	}
	
	public void mover() { 
		
	}
	 
}
