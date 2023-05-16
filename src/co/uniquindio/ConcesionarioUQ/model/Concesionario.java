package co.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;

public class Concesionario {
	private String nombre;
	private String NIT;
	private ArrayList <Cliente> listaClientes;
	private ArrayList <Empleado> listaEmpleado;
	private ArrayList <Vehiculo> listaVehiculos;
	private ArrayList <Operacion> listaOperaciones;

	public Concesionario(String nombre, String nIT, ArrayList<Cliente> listaClientes, ArrayList<Empleado> listaEmpleado,
			ArrayList<Vehiculo> listaVehiculos, ArrayList<Operacion> listaOperaciones) {
		super();
		this.nombre = nombre;
		this.NIT = nIT;
		this.listaClientes = listaClientes;
		this.listaEmpleado = listaEmpleado;
		this.listaVehiculos = listaVehiculos;
		this.listaOperaciones = listaOperaciones;
	}

	public Concesionario() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Empleado> getListaEmpleado() {
		return listaEmpleado;
	}

	public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public ArrayList<Operacion> getListaOperaciones() {
		return listaOperaciones;
	}

	public void setListaOperaciones(ArrayList<Operacion> listaOperaciones) {
		this.listaOperaciones = listaOperaciones;
	}



}
