package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.aplication.Aplicacion;
import co.edu.uniquindio.ConcesionarioUQ.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class VenderVehiculoController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDetalles;

    @FXML
    private TableColumn<?, ?> columnCilindraje;

    @FXML
    private TableColumn<?, ?> columnMarca;

    @FXML
    private TableColumn<?, ?> columnModelo;

    @FXML
    private TableColumn<?, ?> columnPrecio;

    @FXML
    private TableView<Vehiculo> tablaVehiculos;

    private Singleton singleton = Singleton.obtenerInstancia();

    private Aplicacion aplicacion;
    @FXML
    void detalles(ActionEvent event) {

    	Vehiculo vehiculo = this.tablaVehiculos.getSelectionModel().getSelectedItem();
    	aplicacion.abrirVentanaDetallesVehiculo(vehiculo);

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.columnCilindraje.setCellValueFactory(new PropertyValueFactory("cilindraje"));
		this.columnMarca.setCellValueFactory(new PropertyValueFactory("marca"));
		this.columnPrecio.setCellValueFactory(new PropertyValueFactory("precio"));
		this.columnModelo.setCellValueFactory(new PropertyValueFactory("modelo"));
		refrescarTabla();


	}

	private void refrescarTabla() {
		this.tablaVehiculos.getItems().clear();
		this.tablaVehiculos.setItems(singleton.obtenerListaVehiculos());

	}


}

