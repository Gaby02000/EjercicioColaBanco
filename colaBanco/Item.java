package colaBanco;
import java.util.ArrayList;

public class Item{
	private Persona cliente;
	private ArrayList<Operacion> operaciones = new ArrayList<Operacion>();
	private String fecha;
	private String hora;
	
	public Item(Persona cliente, ArrayList<Operacion> operaciones, String fecha) {
		super();
		this.cliente = cliente;
		this.operaciones = operaciones;
		this.fecha = fecha;
	}
	
	public Item() {
		super();
	}

	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Operacion> getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(ArrayList<Operacion> operaciones) {
		this.operaciones = operaciones;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}


	
	
}
