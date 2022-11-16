package colaBanco;

public class ColaEmpresa extends Cola {

	@Override
	public void registroCliente(Item r) throws ColaEquivocadaException, OperacionInvalidaException {
		if(!(r.getCliente() instanceof ClienteEmpresa)) {
			throw new ColaEquivocadaException();
		}else {
			super.registroCliente(r);
		}
	}
}
