package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.application.Aplicacion;
import co.edu.uniquindio.ConcesionarioUQ.model.Diesel;
import co.edu.uniquindio.ConcesionarioUQ.model.TipoCombustible;
import co.edu.uniquindio.ConcesionarioUQ.model.TipoTransmision;
import co.edu.uniquindio.ConcesionarioUQ.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

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
    private TextField txtPlaca;

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
    private ImageView imgViewFoto;

    @FXML
    private TextField txtTransmision;
    private Singleton singleton;
    private Vehiculo carro;

    private Aplicacion aplicacion;

    @FXML
    void handleAtras(ActionEvent event) {
    	Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
		singleton = singleton.obtenerInstancia();
		TipoCombustible tipoCombustible = new Diesel();
		carro = new Vehiculo("Sexo Carro",false, 2021, 5, 160, 200, "VLJ34C","/co/edu/uniquindio/ConcesionarioUQ/recursos/mcqueen.png", TipoTransmision.MANUAL,tipoCombustible  );
		llenarVentana();

	}

	private void llenarVentana() {
		txtMarca.setText(carro.getMarca());
		txtModel.setText(carro.getModelo()+"");
		txtCilindraje.setText(carro.getCilindraje()+" CC");
		txtNew.setText(carro.isNew());
		txtChanges.setText(carro.getCantidadCambios()+" Cambios");
		txtMaxSpeed.setText(carro.getVelocidadMáxima()+" Km/h");
		txtPlaca.setText(carro.getPlaca());
		txtCilindraje.setText(carro.getCilindraje()+"");
		txtCombustible.setText(carro.obtenerTipoCombustible());
		txtTransmision.setText(carro.getTipoTransmision()+"");
		Image image1 = new Image(getClass().getResourceAsStream(carro.getRutaImagen()));
		imgViewFoto.setImage(image1);

	}

	public void setAplication(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;

	}

	public void setCarro (Vehiculo vehiculo){
		this.carro = vehiculo;
	}



}