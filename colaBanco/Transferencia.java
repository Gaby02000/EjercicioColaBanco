package colaBanco;

public class Transferencia extends OperacionCaja{
	private Persona cuentaOrigen;
	private String CuentaDestinatario;
	public Transferencia(int numeroCuenta, double importe) {
		super(numeroCuenta, importe);
		// TODO Auto-generated constructor stub
	}
	public Persona getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(Persona cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public String getCuentaDestinatario() {
		return CuentaDestinatario;
	}
	public void setCuentaDestinatario(String cuentaDestinatario) {
		CuentaDestinatario = cuentaDestinatario;
	}

}
