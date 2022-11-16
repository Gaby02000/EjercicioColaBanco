package colaBanco;

import java.util.ArrayList;

public class Banco {
	private static Banco instance;

    private Banco() {

    }
    public static Banco getInstace() {
        if (instance == null) {
        	System.out.println("Se creo la instancia");
            instance = new Banco();
        }
        return instance;
    }
private ArrayList<Cola> colas = new ArrayList<Cola>();

public ArrayList<Cola> getColas() {
	return colas;
}
public void setColas(ArrayList<Cola> colas) {
	this.colas = colas;
}
public void listarOperaciones() {
	for (Cola c : colas) {
		System.out.println("la caja "+ c.getCaja());
		for (Item r : c.getCaja().getAtendidos()) {
			
			for (Operacion o : r.getOperaciones()) {
				System.out.println(String.format("El cliente atendido : %s", r.getCliente()));
				System.out.println(String.format("La fecha : %s", r.getFecha()));
				System.out.println(String.format("La hora : %s", r.getHora()));
				System.out.println("el codigo de las operacion es "+o.getNumero());
			}
			
		}
		System.out.println("---------------------------");
	}
}
}
