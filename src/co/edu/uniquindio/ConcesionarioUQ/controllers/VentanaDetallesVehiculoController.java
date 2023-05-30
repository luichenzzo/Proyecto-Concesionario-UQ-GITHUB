package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.aplication.Aplicacion;
import co.edu.uniquindio.ConcesionarioUQ.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class VentanaDetallesVehiculoController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imagen;

    @FXML
    private Label labelCantidadCambios;

    @FXML
    private Label labelCilindraje;

    @FXML
    private Label labelMarca;

    @FXML
    private Label labelModelo;

    @FXML
    private Label labelPlaca;

    @FXML
    private Label labelTipoCombustible;

    @FXML
    private Label labelTransmision;

    @FXML
    private Label labelVelocidadMaxima;

    private Vehiculo vehiculo;


	private Aplicacion aplicacion;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public void setAplication(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;

	}





}



