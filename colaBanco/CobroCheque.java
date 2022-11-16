package colaBanco;

public class CobroCheque extends OperacionCaja {
	private int numCheque;
	public CobroCheque(int numCheque,int numCuenta, double importe) {
		super(numCuenta, importe);
		this.numCheque=numCheque;
		
	}

}
