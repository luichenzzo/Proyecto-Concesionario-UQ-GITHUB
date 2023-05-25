package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona{

	private List<Operacion>listaOperaciones;

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, String edad, String identificacion, String email, String telefono) {
		super(nombre, edad, identificacion, email, telefono);
		this.listaOperaciones = new ArrayList<>();
	}

	public List<Operacion> getListaOperaciones() {
		return listaOperaciones;
	}

	public void setListaOperaciones(List<Operacion> listaOperaciones) {
		this.listaOperaciones = listaOperaciones;
	}


}
