package colaBanco;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public abstract class Caja {
	private ArrayList<Item> atendidos = new ArrayList<Item>();
	private Queue<Item> registros = new LinkedList<Item>();
	private static int generadorCodigo;
	private int numeroCaja;
	public Caja() {
		super();
		this.numeroCaja=generadorCodigo;
		generadorCodigo++;
	}
	public ArrayList<Item> getAtendidos() {
		return atendidos;
	}
	public void setAtendidos(ArrayList<Item> atendidos) {
		this.atendidos = atendidos;
	}
	public Queue<Item> getRegistros() {
		return registros;
	}

	public void setRegistros(Queue<Item> registros) {
		this.registros = registros;
	}
	public int getNumeroCaja() {
		return numeroCaja;
	}
	public void setNumeroCaja(int numeroCaja) {
		this.numeroCaja = numeroCaja;
	}
	
}
