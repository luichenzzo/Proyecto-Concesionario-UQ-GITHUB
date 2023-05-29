package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Empleado {

	private ArrayList <Empleado> listaEmpleadosCargo;

	public Administrador(String nombre, Integer edad, String identificacion, String email, String telefono,
			List<Operacion> listaOperaciones, String contraseņa, ArrayList<Empleado> listaEmpleadosCargo) {
		super(nombre, edad, identificacion, email, telefono, listaOperaciones, contraseņa);
		this.listaEmpleadosCargo = listaEmpleadosCargo;
	}

	public Administrador(String nombre, Integer edad, String identificacion, String email, String telefono,
			List<Operacion> listaOperaciones, String contraseņa) {
		super(nombre, edad, identificacion, email, telefono, listaOperaciones, contraseņa);
	}



	public ArrayList<Empleado> getListaEmpleadosCargo() {
		return listaEmpleadosCargo;
	}

	public void setListaEmpleadosCargo(ArrayList<Empleado> listaEmpleadosCargo) {
		this.listaEmpleadosCargo = listaEmpleadosCargo;
	}
}

