package isw.simulador;



public class Capitan extends Soldado{
	
	private static final int puntosAtaque = 40;
	private static final int puntosResistencia = 140;
	private static final int puntosAtaqueEspecial = 80;

	public Capitan() {
		
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
	
	public boolean atacarEspecial() {
		return Ataque.atacar(puntosAtaqueEspecial);
	}

}
