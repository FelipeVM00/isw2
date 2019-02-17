package isw.simulador;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public interface Ataque {
	
	public static boolean atacar(int puntos, Soldado soldado) {		
		soldado.setPuntosResistencia(soldado.getPuntosResistencia() - puntos);
		return true;
	}
	
}
