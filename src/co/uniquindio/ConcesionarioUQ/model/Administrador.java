package co.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;

public class Administrador extends Empleado {

	private ArrayList <Empleado> listaEmpleadosCargo;

	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(String nombre, String edad, String identificacion, String email, String telefono) {
		super(nombre, edad, identificacion, email, telefono);
		// TODO Auto-generated constructor stub
	}

	public Administrador(ArrayList<Empleado> listaEmpleadosCargo) {
		super();
		this.listaEmpleadosCargo = listaEmpleadosCargo;
	}


}
