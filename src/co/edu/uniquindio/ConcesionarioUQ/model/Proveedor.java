package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Proveedor extends Persona implements Serializable{

	private List<OperacionCompra>listaOperacionesCompra;

	public Proveedor(String nombre, String edad, String identificacion, String email, String telefono,
			List<OperacionCompra> listaOperacionesCompra) {
		super(nombre, edad, identificacion, email, telefono);
		this.listaOperacionesCompra = new ArrayList<>();
	}

	public Proveedor(String nombre, String edad, String identificacion, String email, String telefono) {
		super(nombre, edad, identificacion, email, telefono);
	}

	public List<OperacionCompra> getListaOperacionesCompra() {
		return listaOperacionesCompra;
	}

	public void setListaOperacionesCompra(List<OperacionCompra> listaOperacionesCompra) {
		this.listaOperacionesCompra = listaOperacionesCompra;
	}

}
