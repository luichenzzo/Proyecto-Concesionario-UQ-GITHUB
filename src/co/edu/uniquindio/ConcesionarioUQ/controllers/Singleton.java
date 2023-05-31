package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.util.ArrayList;

import co.edu.uniquindio.ConcesionarioUQ.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Singleton {

	/**
	 * se crea una referencia a ella misma, con la finalidad de poder ser utilizada sin necesidad
	 * de tener un objeto de esta clase.
	 */
	private static Singleton instancia = null;
	private Concesionario concesionario;

	/**
	 * El constructor se defien como privado para que ninguna otra clase pueda crear un obejto del Singleton
	 * ademas, se crea la instancia del modelo, es asi como el Singleton es la conexion directa con la clase
	 * Concesionario, y es la encargada de conectar los controladores con los metodos o servicios que se
	 * soliciten del modelo.
	 */
	private Singleton(){
		this.concesionario = new Concesionario();
		Empleado empleado = new Empleado("Sexito", 23, "123", "katrinad.tellezs@uqvirtual.edu.co", "luichenzzo@gmail.com", null, "123");
		concesionario.getListaEmpleado().add(empleado);

	}

	public Concesionario getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}
	/**
	 * el metodo obtenerInstancia se define como estatico, con la finalidad de obtener la instancia del
	 * Singleton sin la necesidad de tener un objeto de la misma.
	 * @return
	 */
	public static Singleton obtenerInstancia(){
		if (instancia == null){
			instancia = new Singleton();
		}
		return instancia;
	}


	public ObservableList<Empleado> obtenerListaEmpleados (){
		return FXCollections.observableArrayList(concesionario.getListaEmpleado());
	}

	public void agregarEmpleado(Empleado empleado) {
		concesionario.agregarEmpleado(empleado);

	}

	public void crearAlerta (String titulo, String encabezado, String contenido, AlertType tipoAlerta){
		Alert alerta = new Alert(tipoAlerta);
		alerta.setTitle(titulo);
		alerta.setHeaderText(encabezado);
		alerta.setContentText(contenido);
		alerta.showAndWait();
	}

	public int contarEmpleadoIdentificacionIgual(Empleado empleado) {
		return concesionario.contarEmpleadoIdentificacionIgual(empleado);
	}


    public boolean verificarCamposLlenos(TextField... camposTexto) {
		boolean todosLlenos = true;
		for (TextField campoTexto : camposTexto) {
            if (campoTexto.getText().isEmpty()) {
                todosLlenos = false;
            }
        }
		return todosLlenos;

	}

	public boolean verificarCredenciales(String identificacion, String contrase�a) {
		return concesionario.verificarCredenciales(identificacion, contrase�a);
	}

	public Empleado obtenerEmpleadoIngreso(String identificacion) {
		return concesionario.obtenerEmpleadoDeIngreso(identificacion);
	}

	public boolean verificarCredencialesAdminidtrador(String identificacion, String contrase�a) {
		return concesionario.verificarCredencialesAdministrador(identificacion, contrase�a);
	}

	public boolean EmpleadoExistente(String identificacion) {
		return concesionario.empleadoExistente(identificacion);

	}

	public ObservableList<Cliente> obtenerListaClientes() {
		return FXCollections.observableArrayList(concesionario.getListaClientes());
	}

	public int contarClientesIdentificacionIgual(Cliente cliente) {
		return concesionario.contarEmpleadoIdentificacionIgual(cliente);
	}

	public void agregarCliente(Cliente cliente) {
		concesionario.agregarCliente(cliente);
	}

	public int contarProveedoresIdentificacionIgual(Proveedor proveedor) {
		return concesionario.contarProveedoresIdentificacionIgual(proveedor);
	}

	public ObservableList<Proveedor> obtenerListaProveedores() {
		return FXCollections.observableArrayList(concesionario.getListaProveedores());
	}

	public void agregarProveedor(Proveedor proveedor) {
		concesionario.agregarProveedor(proveedor);
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		concesionario.agregarVehiculo(vehiculo);
	}

	public ObservableList<Vehiculo> obtenerListaVehiculos() {
		return FXCollections.observableArrayList(concesionario.getListaVehiculos());
	}


	public void generarPdf(){
		/*
		 * temp testing method
		 */
		ArrayList<DetalleOperaion> detallesOperaciones = new ArrayList<>();
		Hibrido hibrido = new Hibrido(false, true);
    	Vehiculo vehiculo = new Vehiculo ("mazda", false, 2015, 7, 315, 990, "jhiu12", "rutaImagen", TipoTransmision.MANUAL, hibrido,25000);
    	detallesOperaciones.add(new DetalleOperaion(227.0,vehiculo));
		ArrayList<Operacion> arrayOperaciones = new ArrayList<>();
		Empleado empleado = new Empleado();
		arrayOperaciones.add(new OperacionCompra("19", "109203901", 100000.0, detallesOperaciones, empleado ));
		GenerarReporte.generarPDFConOperaciones(arrayOperaciones);
	}
	public String generarReporte(){
		ArrayList<DetalleOperaion> detallesOperaciones = new ArrayList<>();
		Hibrido hibrido = new Hibrido(false, true);
    	Vehiculo vehiculo = new Vehiculo ("mazda", false, 2015, 7, 315, 990, "jhiu12", "rutaImagen", TipoTransmision.MANUAL, hibrido,25000);
    	detallesOperaciones.add(new DetalleOperaion(227.0,vehiculo));
		ArrayList<Operacion> arrayOperaciones = new ArrayList<>();
		Empleado empleado = new Empleado();
		arrayOperaciones.add(new OperacionCompra("19", "109203901", 100000.0, detallesOperaciones, empleado ));
		return GenerarReporte.GenerarReporteString(arrayOperaciones);
	}
	public String forgotPassword(String email) {
		return concesionario.forgotPassword(email);
	}
	public void cambiarContrase�a(Empleado empleado, String newPassword) {
		concesionario.cambiarContrase�a(empleado, newPassword);

	}



}

