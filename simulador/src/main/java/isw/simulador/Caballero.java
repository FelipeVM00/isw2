package isw.simulador;



public class Caballero extends Soldado{
	
	private static final int puntosAtaque = 25;
	private static final int puntosResistencia = 110;

	public Caballero() {
		
	}
	
	public static int getPuntosataque() {
		return puntosAtaque;
	}

	public static int getPuntosresistencia() {
		return puntosResistencia;
	}

}
