package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.aplication.Aplicacion;
import co.edu.uniquindio.ConcesionarioUQ.model.Cliente;
import co.edu.uniquindio.ConcesionarioUQ.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class VenderVehiculoController implements Initializable {

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

    @FXML
    private Button btnComprar;

    private Singleton singleton = Singleton.obtenerInstancia();

    private Aplicacion aplicacion;

    private Vehiculo vehiculo;



    public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@FXML
    void detalles(ActionEvent event) {
    	aplicacion.abrirVentanaDetallesVehiculo(this.tablaVehiculos.getSelectionModel().getSelectedItem());
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.columnCilindraje.setCellValueFactory(new PropertyValueFactory("cilindraje"));
		this.columnMarca.setCellValueFactory(new PropertyValueFactory("marca"));
		this.columnModelo.setCellValueFactory(new PropertyValueFactory("modelo"));
		this.columnPrecio.setCellValueFactory(new PropertyValueFactory("precio"));
		refrescarTabla();

	}

	private void refrescarTabla() {
		this.tablaVehiculos.getItems().clear();
		this.tablaVehiculos.setItems(singleton.obtenerListaVehiculos());

	}

	@FXML
    void comprar(ActionEvent event) {

    }

}
