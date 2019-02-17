package isw.simulador;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Caballero extends Soldado{
	
	private static ImageView sprite;
	private static final int puntosAtaque = 25;
	private static final int puntosResistencia = 110;

	public Caballero() {
		super();
	}
	public Caballero(String color) {
		super(color, puntosAtaque, puntosResistencia);
		this.setSprite(new ImageView(new Image("/isw/vista/caballeroQuieto.gif", 200, 300, false, true)));//250 337
	}
	
	public static int getPuntosataque() {
		return puntosAtaque;
	}

	public static int getPuntosresistencia() {
		return puntosResistencia;
	}
	
	public boolean atacar(int puntos, Soldado soldado) {
		sprite = getSprite();
		sprite.setImage(new Image("/isw/vista/caballeroMov.gif", 200, 300, false, true));
		return Ataque.atacar(puntos, soldado);
	}

	public void mover() {
		sprite = getSprite();
		sprite.setImage(new Image("/isw/vista/caballeroMov.gif", 200, 300, false, true));	
		if(this.getColor() == "Rojo") {
			for(int i = 0; i<120; i++) {
        		sprite.setTranslateX(sprite.getTranslateX()+2);;
    		}
		}	
		else if(this.getColor() == "Azul") {
			for(int i = 0; i<120; i++) {
        		sprite.setTranslateX(sprite.getTranslateX()-2);;
    		}
		}
		//sprite.setImage(new Image("/isw/vista/caballeroQuieto.gif", 200, 300, false, true));
	}
	
}
