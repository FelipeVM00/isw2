package isw.simulador;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Arquero extends Soldado{
	
	private static final int puntosAtaque = 20;
	private static final int puntosResistencia = 90;

	public Arquero() {
		this.setSprite(new ImageView(new Image("\\arqueroQuieto.gif", 100, 200, false, true)));
	}
	
	public static int getPuntosataque() {
		return puntosAtaque;
	}

	public static int getPuntosresistencia() {
		return puntosResistencia;
	}

}
