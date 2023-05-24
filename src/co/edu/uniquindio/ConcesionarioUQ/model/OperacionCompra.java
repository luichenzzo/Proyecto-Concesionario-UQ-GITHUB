package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;

public class OperacionCompra extends Operacion{

	private Proveedor proveedor;

	public OperacionCompra(String fecha, String codigoOperacion, Double total, ArrayList<DetalleOperaion> listaDetalles,
			Empleado empleado, Proveedor proveedor) {
		super(fecha, codigoOperacion, total, listaDetalles, empleado);
		this.proveedor = proveedor;
	}

	public OperacionCompra(String fecha, String codigoOperacion, Double total, ArrayList<DetalleOperaion> listaDetalles,
			Empleado empleado) {
		super(fecha, codigoOperacion, total, listaDetalles, empleado);
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
}
