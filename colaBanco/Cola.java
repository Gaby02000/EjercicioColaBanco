package colaBanco;
 
import java.util.ArrayList;
import java.util.Random;
public abstract class Cola {
	private Caja caja;

	
	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}
	
	public void registroCliente (Item r) throws ColaEquivocadaException,OperacionInvalidaException {
			for (Operacion o : r.getOperaciones()) {}
				this.caja.getRegistros().add(r);
			}
	
	
	
	public double numRandom() {
		Random rnd = new Random();
		
		int random = rnd.nextInt(10);
		
		return random;
	}
	
	public ArrayList<Operacion> hacerOperaciones (ArrayList<Operacion> operacionesARealizar) {
		ArrayList<Operacion> o1= new ArrayList<Operacion>();
		for (Operacion operacion : operacionesARealizar) {
		
			if(this.numRandom()>5){
				o1.add(operacion);
			}
		}return o1;
	}
	
	public void atender() {
		if (this.caja.getRegistros().size() == 0) {
			return;
		} else {
			Item r1 = new Item();
			Item aux = caja.getRegistros().poll();
			r1.setFecha("hoy");
			r1.setOperaciones(hacerOperaciones(aux.getOperaciones()));
			r1.setHora("5:00");
			r1.setCliente(aux.getCliente());
			this.caja.getAtendidos().add(r1);
		}
	}
	
	
	

}
