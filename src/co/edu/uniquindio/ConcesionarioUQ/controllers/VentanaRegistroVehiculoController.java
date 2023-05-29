package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import co.edu.uniquindio.ConcesionarioUQ.application.Aplicacion_2;
import co.edu.uniquindio.ConcesionarioUQ.model.TipoCombustible;
import co.edu.uniquindio.ConcesionarioUQ.model.TipoTransmision;
import co.edu.uniquindio.ConcesionarioUQ.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VentanaRegistroVehiculoController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAtras;

    @FXML
    private Button guardarBoton;

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
    private TextField txtPlaca;

    @FXML
    private TextField txtTransmision;

    @FXML
    private TextField txtRutaImagen;

	private Singleton singleton;

	private Vehiculo carro;

	private Aplicacion_2 aplicacion;

    @FXML
    void handleAtras(ActionEvent event) {
    	Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    void handleBoton(ActionEvent event) {
    	generarVehiculo();
    	///CerrarVentana
    }

    private void generarVehiculo() {
		if(inputValidos()){
			carro = new Vehiculo(txtMarca.getText(),isNew(),Integer.parseInt(txtModel.getText()),Integer.parseInt(txtChanges.getText()),
					Integer.parseInt(txtMaxSpeed.getText()),Integer.parseInt(txtCilindraje.getText()),txtPlaca.getText(),
					txtRutaImagen.getText(),obtenerTransmision(), obtenerCombustible());
			singleton.agregarVehiculo(carro);
		}
		else{
			JOptionPane.showMessageDialog(null, "ERROR. ERROR. ERROR.");
			//////IMPLEMENTAR CARTEL DE ERROR AL NO INGRESAR BIEN LOS DATOS
		}

	}

	private TipoCombustible obtenerCombustible() {
		/////Hace falta descifrar el tipo de combustible
		////Ya sea por decisiones U otras

		return null;
	}

	private TipoTransmision obtenerTransmision() {
		if(txtTransmision.getText().equals(TipoTransmision.AUTOMATICA)){
			return TipoTransmision.AUTOMATICA;
		}
		if(txtTransmision.getText().equals(TipoTransmision.MANUAL)){
			return TipoTransmision.MANUAL;
		}
		return null;
	}

	private boolean inputValidos() {
		if(txtMarca.getText().length()== 0){
			return false;
		}
		if (txtNew.getText().length() == 0){
			return false;
		}
		if (txtModel.getText().length() == 0){
			return false;
		}
		if(txtChanges.getText().length() == 0){
			return false;
		}
		if(txtMaxSpeed.getText().length() == 0){
			return false;
		}
		if(txtPlaca.getText().length() == 0){
			return false;
		}
		if(txtCilindraje.getText().length() == 0){
			return false;
		}
		if(txtCombustible.getText().length() == 0){
			return false;
		}
		if(txtTransmision.getText().length() == 0){
			return false;
		}
		if(txtRutaImagen.getText().length() == 0){
			return false;
		}

		return true;
	}

	private boolean isNew() {
		if(txtNew.equals("Si")){
			return true;
		}
		if(txtNew.equals("No")){
			return false;
		}
		return false;
	}



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		singleton = singleton.obtenerInstancia();
	}

	public void setAplication(Aplicacion_2 aplicacion_2) {
		this.aplicacion = aplicacion_2;

	}

}
