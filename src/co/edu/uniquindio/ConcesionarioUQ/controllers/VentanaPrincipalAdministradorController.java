package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.aplication.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class VentanaPrincipalAdministradorController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRegistrarEmpleado;

    @FXML
    private Button btnReport;

    @FXML
    private Button btnVolverVentanaPrincipal;

    @FXML
    private Pane panelVariable;

	private Aplicacion aplicacion;

	@FXML
	void volverVentanaPrincipal(ActionEvent event) {
		aplicacion.volverVentanaPrincipal();
	}

    @FXML
    void abrirVentanaRegistroEmpleado(ActionEvent event) {

    	aplicacion.abrirVentanaRegistroEmpleado(panelVariable);
    }

    @FXML
    void handleReport(ActionEvent event){
    	aplicacion.abrirVentanaReporte(panelVariable);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	public void setAplication(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;

	}


}

