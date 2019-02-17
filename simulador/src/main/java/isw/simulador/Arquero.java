package isw.simulador;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Arquero extends Soldado{
	
	private static final int puntosAtaque = 20;
	private static final int puntosResistencia = 90;

	public Arquero() {
		super();
	}
	public Arquero(String color) {
		super(color, puntosAtaque, puntosResistencia);
		this.setSprite(new ImageView(new Image("\\arqueroQuieto.gif", 100, 200, false, true)));
	}
	
	public static int getPuntosataque() {
		return puntosAtaque;
	}

	public static int getPuntosresistencia() {
		return puntosResistencia;
	}

	public boolean atacar(int puntos, Soldado soldado) {
		this.setSprite(new ImageView(new Image("\\arqueroAtaque.gif", 100, 200, false, true)));
		return Ataque.atacar(puntos, soldado);
	}
}
