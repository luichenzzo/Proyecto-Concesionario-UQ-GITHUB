package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona{

	private List<Operacion>listaOperaciones;
	private String contraseña;


	public Empleado() {
		super();
	}

	public Empleado(String nombre, Integer edad, String identificacion, String email, String telefono,
			List<Operacion> listaOperaciones, String contraseña) {
		super(nombre, edad, identificacion, email, telefono);
		this.listaOperaciones = new ArrayList<>();
		this.contraseña = contraseña;
	}

	public List<Operacion> getListaOperaciones() {
		return listaOperaciones;
	}

	public void setListaOperaciones(List<Operacion> listaOperaciones) {
		this.listaOperaciones = listaOperaciones;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


}
