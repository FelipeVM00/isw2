package isw.simulador;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Capitan extends Soldado{
	
	private static ImageView sprite;
	private static final int puntosAtaque = 40;
	private static final int puntosResistencia = 140;
	private static final int puntosAtaqueEspecial = 80;

	public Capitan() {
		super();
	}
	public Capitan(String color) {
		super(color, puntosAtaque, puntosResistencia);
		this.setSprite(new ImageView(new Image("/isw/vista/capitanQuieto.gif", 250, 337, false, true)));
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
		sprite = getSprite();
		sprite.setImage(new Image("/isw/vista/capitanAtaque.gif", 250, 337, false, true));
		return Ataque.atacar(puntos, soldado);
	}
	
	public void mover() {
		sprite = getSprite();
		if(this.getColor() == "Rojo") {
			for(int i = 0; i<300; i++) {
        		sprite.setTranslateX(sprite.getTranslateX()+2);;
    		}
		}	
		else if(this.getColor() == "Azul") {
			for(int i = 0; i<300; i++) {
        		sprite.setTranslateX(sprite.getTranslateX()-2);;
    		}
		}	
	}
}
