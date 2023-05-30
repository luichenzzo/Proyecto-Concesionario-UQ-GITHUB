package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.aplication.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class VentanaReporteOperacionesController implements Initializable{

	private Singleton singleton = Singleton.obtenerInstancia();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnPdf;

    @FXML
    private Button btnReport;

    @FXML
    private TextArea txtReporte;
	private Aplicacion aplicacion;

    @FXML
    void HandlePDF(ActionEvent event) {
    	singleton.generarPdf();
    }

    @FXML
    void HandleReport(ActionEvent event) {
    	txtReporte.setText(singleton.generarReporte());
    }

    @FXML
    void initialize() {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	public void setAplication(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;

	}

}
