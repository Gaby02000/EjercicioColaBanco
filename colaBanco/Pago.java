package colaBanco;

public class Pago extends OperacionCaja {


	private String descripcionServicioPagado;
	
	public Pago (int numeroCuenta,double importe)
	{
		super(numeroCuenta,importe);
	}

	public String getDescripcionServicioPagado() {
		return descripcionServicioPagado;
	}

	public void setDescripcionServicio(String descripcionServicio) {
		this.descripcionServicioPagado = descripcionServicio;
	}


	
}
