package isw.simulador;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Capitan extends Soldado{
	
	private static final int puntosAtaque = 40;
	private static final int puntosResistencia = 140;
	private static final int puntosAtaqueEspecial = 80;

	public Capitan() {
		super();
	}
	public Capitan(String color) {
		super(color, puntosAtaque, puntosResistencia);
		this.setSprite(new ImageView(new Image("\\capitanQuieto.gif", 250, 337, false, true)));//500 675
	}
	
	public static int getPuntosataque() {
		return puntosAtaque;
	}

	public static int getPuntosresistencia() {
		return puntosResistencia;
	}

	public static int getPuntosataqueespecial() {
		return puntosAtaqueEspecial;
	}
	
	public boolean atacar(int puntos, Soldado soldado) {
		this.setSprite(new ImageView(new Image("\\capitanAtaque.gif", 250, 337, false, true)));
		return Ataque.atacar(puntos, soldado);
	}
	
}
