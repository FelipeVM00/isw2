package isw.simulador;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Guerrero extends Soldado{
	
	private static ImageView sprite;
	private static final int puntosAtaque = 15;
	private static final int puntosResistencia = 80;
	
	public Guerrero() {
		super();
	}
	public Guerrero(String color) {
		super(color, puntosAtaque, puntosResistencia);
		this.setSprite(new ImageView(new Image("/isw/vista/guerreroQuieto.gif", 100, 200, false, true)));
	}

	public int getPuntosataque() {
		return puntosAtaque;
	}

	public int getPuntosResistencia() {
		return puntosResistencia;
	}
	
	public boolean atacar(int puntos, Soldado soldado) {
		sprite = getSprite();
		sprite.setImage(new Image("/isw/vista/guerreroAtaque.gif", 100, 200, false, true));
		return Ataque.atacar(puntos, soldado);
	}
	
	public void mover() {
		sprite = getSprite();
		sprite.setImage(new Image("/isw/vista/guerreroMov.gif", 100, 200, false, true));
		if(this.getColor() == "Rojo") {
			for(int i = 0; i<200; i++) {
        		sprite.setTranslateX(sprite.getTranslateX()+2);;
    		}
		}	
		else if(this.getColor() == "Azul") {
			for(int i = 0; i<200; i++) {
        		sprite.setTranslateX(sprite.getTranslateX()-2);;
    		}
		}
		//sprite.setImage(new Image("/isw/vista/guerreroQuieto.gif", 100, 200, false, true));
	}
	

}
