package isw.simulador;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Ejercito {

	private String color;
	private ArrayList<Soldado> soldados;
	private Capitan capitan;
	
	public Ejercito() {
		
	}
	
	public Ejercito(String color, ArrayList<Soldado> soldados, Capitan capitan) {
		this.color = color;
		this.soldados = soldados;
		this.capitan = capitan;
	}
	
	public Soldado seleccionarSoldado() {
		int tamaño = soldados.size();
		int soldado = new Random().nextInt(tamaño);
		soldados.get(soldado).mover();
		return soldados.get(soldado);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ArrayList<Soldado> getSoldados() {
		return soldados;
	}

	public void setSoldados(ArrayList<Soldado> soldados) {
		this.soldados = soldados;
	}

	public Soldado getCapitan() {
		return capitan;
	}

	public void setCapitan(Capitan capitan) {
		this.capitan = capitan;
	}
	
}
