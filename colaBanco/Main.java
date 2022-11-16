package colaBanco;

import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Banco banco = Banco.getInstace();
		CajaComun caja1 = new CajaComun();
		CajaEmpresa caja2 = new CajaEmpresa();
		CajaPagos caja3 = new CajaPagos();
		CajaComercial caja4 = new CajaComercial();
		ColaComun s = new ColaComun();
		s.setCaja(caja1);
		ColaEmpresa s2 = new ColaEmpresa();
		s2.setCaja(caja2);
		ColaPagos s3 = new ColaPagos();
		s3.setCaja(caja3);
		ColaComercial s4=new ColaComercial();
		s4.setCaja(caja4);
		Solicitud solicitud = new Solicitud();
		Reclamo reclamo = new Reclamo();
		BajaProducto baja = new BajaProducto();
		CobroCheque cobro = new CobroCheque(2,1,2);
		Extraccion extraccion = new Extraccion(2,2);
		Deposito deposito = new Deposito(2, 2);
		Pago pago = new Pago(2,100);
		Transferencia transferencia = new Transferencia(2, 3);
		ArrayList<Operacion> operaciones = new ArrayList<Operacion>();
		operaciones.add(reclamo);
		operaciones.add(solicitud);
		operaciones.add(baja);
		ArrayList<Operacion> operaciones2 = new ArrayList<Operacion>();
		operaciones2.add(pago);
		operaciones2.add(cobro);
		operaciones2.add(extraccion);
		operaciones2.add(deposito);
		operaciones2.add(transferencia);
		ClientePersona c1 = new ClientePersona("x", "s", 3);
		ClientePersona c2 = new ClientePersona("Gabriel", "Gimenez", 2);
		ClienteEmpresa c3 = new ClienteEmpresa(2, "San Martin 3");
		ClienteEmpresa c4 = new ClienteEmpresa(2, "San Martin 4");
		Item i = new Item(c1, operaciones, "hoy");
		Item i2 = new Item(c4, operaciones2, "ayer");
		Item i3 = new Item(c3, operaciones, "antesdeayer");
		Item i4 = new Item(c2,operaciones,"el lunes");
		ArrayList<Cola> q = new ArrayList<Cola>();

		try {
			s.registroCliente(i);
		} catch (ColaEquivocadaException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (OperacionInvalidaException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		s.atender();
		q.add(s);
		try {
			s4.registroCliente(i2);
		} catch (colaBanco.ColaEquivocadaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OperacionInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s4.atender();
		q.add(s4);
		try {
			s2.registroCliente(i);
		} catch (colaBanco.ColaEquivocadaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OperacionInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s2.atender();
		q.add(s2);
		try {
			s3.registroCliente(i4);
		} catch (ColaEquivocadaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OperacionInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s3.atender();
		q.add(s4);
		banco.setColas(q);
		banco.listarOperaciones();
		System.out.println("funciono");
	

	}
}


