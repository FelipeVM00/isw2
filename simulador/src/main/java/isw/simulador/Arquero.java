package isw.simulador;



public class Arquero extends Soldado{
	
	private static final int puntosAtaque = 20;
	private static final int puntosResistencia = 90;

	public Arquero() {
		
	}
	
	public static int getPuntosataque() {
		return puntosAtaque;
	}

	public static int getPuntosresistencia() {
		return puntosResistencia;
	}

}
