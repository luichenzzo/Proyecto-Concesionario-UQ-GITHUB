package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;


import co.uniquindio.ConcesionarioUQ.application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VentanaInformacionVehiculoController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAtras;

    @FXML
    private TextField txtChanges;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TextField txtCombustible;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtMaxSpeed;

    @FXML
    private TextField txtModel;

    @FXML
    private TextField txtNew;

    @FXML
    private TextField txtTransmision;
    private Singleton singleton;

    private Aplicacion aplicacion;

    @FXML
    void handleAtras(ActionEvent event) {

    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		singleton = singleton.obtenerInstancia();
	}

	public void setAplication(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;

	}


}