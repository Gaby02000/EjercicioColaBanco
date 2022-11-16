package colaBanco;

import java.util.ArrayList;

public class ColaPagos extends Cola{

	@Override
	public void registroCliente(Item r) throws ColaEquivocadaException, OperacionInvalidaException {
		ArrayList<Operacion> o=new ArrayList<Operacion>();
		o=r.getOperaciones();
		for(Operacion p:o) {
			if(p instanceof OperacionComercial) {
				throw new OperacionInvalidaException();
			}
		}
		super.registroCliente(r);
	}
	
}
