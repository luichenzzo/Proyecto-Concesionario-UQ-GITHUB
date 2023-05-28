package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Concesionario implements Serializable{
	private String nombre;
	private String NIT;
	private ArrayList <Cliente> listaClientes;
	private ArrayList <Empleado> listaEmpleado;
	private ArrayList<Proveedor>listaProveedores;
	private Administrador administrador;
	private ArrayList <Vehiculo> listaVehiculos;
	private ArrayList <Operacion> listaOperaciones;

	public Concesionario(String nombre, String nIT, ArrayList<Cliente> listaClientes, ArrayList<Empleado> listaEmpleado,
			ArrayList<Proveedor> listaProveedores, Administrador administrador, ArrayList<Vehiculo> listaVehiculos,
			ArrayList<Operacion> listaOperaciones) {
		super();
		this.nombre = nombre;
		NIT = nIT;
		this.listaClientes = new ArrayList<>();
		this.listaEmpleado = new ArrayList<>();
		this.listaProveedores = new ArrayList<>();
		this.administrador = administrador;
		this.listaVehiculos = new ArrayList<>();
		this.listaOperaciones = new ArrayList<>();
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

	public ArrayList<Proveedor> getListaProveedores() {
		return listaProveedores;
	}

	public void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
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
