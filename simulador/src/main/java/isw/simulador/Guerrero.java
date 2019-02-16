package isw.simulador;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Guerrero extends Soldado{
	
	private static final int puntosAtaque = 15;
	private static final int puntosResistencia = 80;
	
	public Guerrero() {
		this.setSprite(new ImageView(new Image("\\guerreroQuieto.gif", 100, 200, false, true)));
	}

	public static int getPuntosataque() {
		return puntosAtaque;
	}

	public static int getPuntosresistencia() {
		return puntosResistencia;
	}
	
	

}
