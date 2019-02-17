package isw.simulador;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Caballero extends Soldado{
	
	private static final int puntosAtaque = 25;
	private static final int puntosResistencia = 110;

	public Caballero() {
		super();
	}
	public Caballero(String color) {
		super(color, puntosAtaque, puntosResistencia);
		this.setSprite(new ImageView(new Image("\\caballeroQuieto.gif", 200, 300, false, true)));//250 337
	}
	
	public static int getPuntosataque() {
		return puntosAtaque;
	}

	public static int getPuntosresistencia() {
		return puntosResistencia;
	}
	
	public boolean atacar(int puntos, Soldado soldado) {
		this.setSprite(new ImageView(new Image("\\caballeroMov.gif", 200, 300, false, true)));
		return Ataque.atacar(puntos, soldado);
	}

}
