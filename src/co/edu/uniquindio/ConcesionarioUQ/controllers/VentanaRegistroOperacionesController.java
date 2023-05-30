package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.application.Aplicacion_2;
import co.edu.uniquindio.ConcesionarioUQ.application.Aplicacion_3;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class VentanaRegistroOperacionesController implements Initializable {

	private Singleton singleton = Singleton.obtenerInstancia();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TextoReporte;

    @FXML
    private Button btnPdf;

    @FXML
    private Button btnReporte;

    @FXML
    private Label lblDescripcion1;

    @FXML
    private Label lblTitulo;
	private Aplicacion_3 aplicacion;

	@FXML
    void GenerarPDF(ActionEvent event) {
    	singleton.generarPdf();
    }
    @FXML
    void GenerarReporte(ActionEvent event) {
    	TextoReporte.setText(singleton.generarReporte());
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
    	TextoReporte.setStyle("-fx-alignment: top-left;");

	}

	public void setAplication(Aplicacion_3 aplicacion_3) {
		this.aplicacion = aplicacion_3;

	}
}
