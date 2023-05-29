package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona{

	private List<Operacion>listaOperaciones;
	private String contrase�a;


	public Empleado() {
		super();
	}

	public Empleado(String nombre, Integer edad, String identificacion, String email, String telefono,
			List<Operacion> listaOperaciones, String contrase�a) {
		super(nombre, edad, identificacion, email, telefono);
		this.listaOperaciones = new ArrayList<>();
		this.contrase�a = contrase�a;
	}

	public List<Operacion> getListaOperaciones() {
		return listaOperaciones;
	}

	public void setListaOperaciones(List<Operacion> listaOperaciones) {
		this.listaOperaciones = listaOperaciones;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}


}
