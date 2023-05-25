package co.edu.uniquindio.ConcesionarioUQ.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class VentanaInformacionVehiculoController {

	@FXML
	private Label marcaLabel;
	@FXML
	private Label newLabel;
	@FXML
	private Label modelLabel;
	@FXML
	private Label cambiosLabel;
	@FXML
	private Label maxSpeedLabel;
	@FXML
	private Label placaLabel;
	@FXML
	private Label cilindrajeLabel;
	@FXML
	private Label especificLabel;

	private Singleton singleton;

	public void initialize (){
		singleton = Singleton.obtenerInstancia();
	}



}
