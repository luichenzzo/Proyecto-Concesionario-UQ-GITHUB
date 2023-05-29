package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

	private List<OperacionVenta>listaOperacionesVenta;
	private List<OperacionAlquiler>listaOperacionesAlquiler;


	public Cliente(String nombre, Integer edad, String identificacion, String email, String telefono,
			List<OperacionVenta> listaOperacionesVenta, List<OperacionAlquiler> listaOperacionesAlquiler) {
		super(nombre, edad, identificacion, email, telefono);
		this.listaOperacionesVenta = new ArrayList<>();
		this.listaOperacionesAlquiler = new ArrayList<>();
	}


	public Cliente(String nombre, Integer edad, String identificacion, String email, String telefono) {
		super(nombre, edad, identificacion, email, telefono);
	}



	public List<OperacionVenta> getListaOperacionesVenta() {
		return listaOperacionesVenta;
	}

	public void setListaOperacionesVenta(List<OperacionVenta> listaOperacionesVenta) {
		this.listaOperacionesVenta = listaOperacionesVenta;
	}

	public List<OperacionAlquiler> getListaOperacionesAlquiler() {
		return listaOperacionesAlquiler;
	}

	public void setListaOperacionesAlquiler(List<OperacionAlquiler> listaOperacionesAlquiler) {
		this.listaOperacionesAlquiler = listaOperacionesAlquiler;
	}

}
