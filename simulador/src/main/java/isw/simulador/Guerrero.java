package isw.simulador;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Guerrero extends Soldado{
	
	private static final int puntosAtaque = 15;
	private static final int puntosResistencia = 80;
	
	public Guerrero() {
		super();
	}
	public Guerrero(String color) {
		super(color, puntosAtaque, puntosResistencia);
		this.setSprite(new ImageView(new Image("\\guerreroQuieto.gif", 100, 200, false, true)));
	}

	public int getPuntosataque() {
		return puntosAtaque;
	}

	public int getPuntosResistencia() {
		return puntosResistencia;
	}
	
	public boolean atacar(int puntos, Soldado soldado) {
		this.setSprite(new ImageView(new Image("\\guerreroAtaque.gif", 100, 200, false, true)));
		return Ataque.atacar(puntos, soldado);
	}
	

}
