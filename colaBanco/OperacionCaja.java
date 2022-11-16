package colaBanco;


public class OperacionCaja extends Operacion {
	private Persona cliente;
	private int numCuenta;
	private double importe;
	public OperacionCaja(int numCuenta, double importe) {
		super();
		this.numCuenta = numCuenta;
		this.importe = importe;
	}
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	public int getNumeroCuenta() {
		return numCuenta;
	}
	public void setNumeroCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
}
