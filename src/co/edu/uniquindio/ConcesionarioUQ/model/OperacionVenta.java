package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;

public class OperacionVenta extends Operacion{

	private Cliente cliente;

	public OperacionVenta(String fecha, String codigoOperacion, Double total, ArrayList<DetalleOperaion> listaDetalles,
			Empleado empleado, Cliente cliente) {
		super(fecha, codigoOperacion, total, listaDetalles, empleado);
		this.cliente = cliente;
	}

	public OperacionVenta(String fecha, String codigoOperacion, Double total, ArrayList<DetalleOperaion> listaDetalles,
			Empleado empleado) {
		super(fecha, codigoOperacion, total, listaDetalles, empleado);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
