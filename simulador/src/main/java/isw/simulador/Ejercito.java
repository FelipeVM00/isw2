package isw.simulador;

import java.util.Set;

public class Ejercito {

	private String color;
	private Set<Soldado> soldados;
	private Soldado capitan;
	
	public Ejercito() {
		
	}
	
	public Soldado seleccionarSoldado() {
		return null;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Set<Soldado> getSoldados() {
		return soldados;
	}

	public void setSoldados(Set<Soldado> soldados) {
		this.soldados = soldados;
	}

	public Soldado getCapitan() {
		return capitan;
	}

	public void setCapitan(Soldado capitan) {
		this.capitan = capitan;
	}
	
	
}
