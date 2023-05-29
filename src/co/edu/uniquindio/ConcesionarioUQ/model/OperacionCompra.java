package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OperacionCompra extends Operacion implements Serializable{

	private Proveedor proveedor;

	public OperacionCompra(String fecha, String codigoOperacion, Double total, ArrayList<DetalleOperacion> listaDetalles,
			Empleado empleado, Proveedor proveedor) {
		super(fecha, codigoOperacion, total, listaDetalles, empleado);
		this.proveedor = proveedor;
	}

	public OperacionCompra(String fecha, String codigoOperacion, Double total, ArrayList<DetalleOperacion> listaDetalles,
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
