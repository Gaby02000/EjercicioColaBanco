package colaBanco;

public class ClienteEmpresa extends Persona {
	private String razonSocial;
	private int telefono;
	private String direccion;
	
	
	public ClienteEmpresa( int telefono, String direccion) {
		super();
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
}
	}
