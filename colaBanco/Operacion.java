package colaBanco;

public abstract class Operacion {
	private static int generadorCodigo;
	private int numero;
	private String nombre;

	public Operacion() {
		this.numero=generadorCodigo;
		generadorCodigo++;
	}
	
	public Operacion(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
