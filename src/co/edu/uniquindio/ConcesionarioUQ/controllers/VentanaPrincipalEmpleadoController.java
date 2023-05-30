package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.aplication.Aplicacion;
import co.edu.uniquindio.ConcesionarioUQ.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class VentanaPrincipalEmpleadoController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAlquilerVehiculo;

    @FXML
    private Button btnComprarVehiculo;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnRegistrarCliente;

    @FXML
    private Button btnVenderVehiculo;

    @FXML
    private Button btnVisualizarOperaciones;

	private Aplicacion aplicacion;

	private Empleado empleadoEnSesion;

	@FXML
	private Pane panelVariable;

	@FXML
    private Button btnInfoUsuario;

	@FXML
    private Button btnRegistrarProveedor;



    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

    public Empleado getEmpleadoEnSesion() {
		return empleadoEnSesion;
	}



	public static void setEmpleadoEnSesion(Empleado empleadoEnSesion) {
		empleadoEnSesion = empleadoEnSesion;
	}

	@FXML
    void infoUsuario(ActionEvent event) {

    }


    @FXML
    void registrarProveedor(ActionEvent event) {
    	aplicacion.abrirVentanaRegistroProveedor(panelVariable);
    }

	@FXML
    void alquilerVehiculo(ActionEvent event) {

    }

    @FXML
    void comprarVehiculo(ActionEvent event) {
    	aplicacion.abrirVentanaCompraVehiculo(panelVariable);

    }

    @FXML
    void cerrarSesion(ActionEvent event) {
    	aplicacion.volverVentanaPrincipal();

    }

    @FXML
    void registrarCliente(ActionEvent event) {
    	aplicacion.abrirVentanaRegistroCliente(panelVariable);
    }

    @FXML
    void venderVehiculo(ActionEvent event) {
    	aplicacion.abrirVentanaVenderVehiculo(panelVariable);
    }

    @FXML
    void visualizarOperaciones(ActionEvent event) {

    }

	public void setAplication(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;

	}


}

