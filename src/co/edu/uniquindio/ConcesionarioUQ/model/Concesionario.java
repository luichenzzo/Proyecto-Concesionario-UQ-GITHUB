package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Concesionario {
	private String nombre;
	private String NIT;
	private ArrayList <Cliente> listaClientes = new ArrayList<>();
	private ArrayList <Empleado> listaEmpleado = new ArrayList<>();
	private ArrayList<Proveedor>listaProveedores = new ArrayList<>();
	private Administrador administrador = new Administrador("Diego",18,"1096032234","diegolopez3277@gmail.com","3042214330",null,"diego123");
	private ArrayList <Vehiculo> listaVehiculos = new ArrayList<>();
	private ArrayList <Operacion> listaOperaciones = new ArrayList<>();


	public Concesionario(String nombre, String nIT, ArrayList<Cliente> listaClientes, ArrayList<Empleado> listaEmpleado,
			ArrayList<Proveedor> listaProveedores, Administrador administrador, ArrayList<Vehiculo> listaVehiculos,
			ArrayList<Operacion> listaOperaciones) {
		super();
		this.nombre = nombre;
		NIT = nIT;
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

	public boolean empleadoExistente(Empleado empleado) {
		return listaEmpleado.stream().anyMatch(x->x.equals(empleado));
	}

	public void agregarEmpleado(Empleado empleado) {
		listaEmpleado.add(empleado);

	}

	public boolean verificarCredenciales(String identificacion, String contraseña) {
		Optional<Empleado> empleadoOptional = buscarEmpleado(identificacion);
		Empleado empleado = empleadoOptional.orElse(null);
		if (empleado.getContraseña().equals(contraseña)){
			return true;
		}
		return false;
	}

	public Optional<Empleado> buscarEmpleado (String identificacion){
		return this.listaEmpleado.stream().filter(x->x.getIdentificacion().equals(identificacion)).findFirst();
	}

	public Empleado obtenerEmpleadoDeIngreso(String identificacion) {
		Optional<Empleado> empleadoOptional = buscarEmpleado(identificacion);
		Empleado empleado = empleadoOptional.orElse(null);
		return empleado;
	}

	public boolean verificarCredencialesAdministrador(String identificacion, String contraseña) {
		if(this.administrador.getIdentificacion().equals(identificacion) && this.administrador.getContraseña().equals(contraseña)){
			return true;
		}
		return false;
	}

	public int contarEmpleadoIdentificacionIgual(Empleado empleado) {
		return (int) listaEmpleado.stream().filter(x->x.getIdentificacion().equals(empleado.getIdentificacion())).count();
	}

	public boolean empleadoExistente(String identificacion) {
		return this.listaEmpleado.stream().anyMatch(x->x.getIdentificacion().equals(identificacion));
	}

	public int contarEmpleadoIdentificacionIgual(Cliente cliente) {
		return (int) listaClientes.stream().filter(x->x.getIdentificacion().equals(cliente.getIdentificacion())).count();
	}

	public void agregarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}

	public int contarProveedoresIdentificacionIgual(Proveedor proveedor) {
		return (int) listaProveedores.stream().filter(x->x.getIdentificacion().equals(proveedor.getIdentificacion())).count();
	}

	public void agregarProveedor(Proveedor proveedor) {
		listaProveedores.add(proveedor);

	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		listaVehiculos.add(vehiculo);
	}
}
