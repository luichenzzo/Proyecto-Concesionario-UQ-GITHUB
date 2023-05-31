package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.aplication.Aplicacion;
import co.edu.uniquindio.ConcesionarioUQ.model.Diesel;
import co.edu.uniquindio.ConcesionarioUQ.model.Electrico;
import co.edu.uniquindio.ConcesionarioUQ.model.Gasolina;
import co.edu.uniquindio.ConcesionarioUQ.model.Hibrido;
import co.edu.uniquindio.ConcesionarioUQ.model.TipoCombustible;
import co.edu.uniquindio.ConcesionarioUQ.model.TipoTransmision;
import co.edu.uniquindio.ConcesionarioUQ.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
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

	private Singleton singleton = Singleton.obtenerInstancia();


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		vehiculo = singleton.getVehiculo();
		labelCantidadCambios.setText(vehiculo.getCantidadCambios()+"");
		labelVelocidadMaxima.setText(vehiculo.getVelocidadMaxima()+"");
		labelCilindraje.setText(vehiculo.getCilindraje()+"");
		labelTipoCombustible.setText(determinarTipoCombustible(vehiculo.getTipoCombustible()));
		labelTransmision.setText(vehiculo.getTipoTransmision().name());
		labelPlaca.setText(vehiculo.getPlaca());
		labelMarca.setText(vehiculo.getMarca());
		labelModelo.setText(vehiculo.getModelo()+"");

//		Image imagen2= new Image(vehiculo.getRutaImagen());
//		this.imagen.setImage(imagen2);


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

	public String determinarTipoCombustible(TipoCombustible tipoCombustible){
		String respuesta = "";
		if(tipoCombustible instanceof Diesel){
			respuesta = "Diesel";
		}else{
			if(tipoCombustible instanceof Gasolina ){
				respuesta = "Gasolina";
			}else{
				if(tipoCombustible instanceof Hibrido){
					respuesta = "Híbrido";
				}else{
					if(tipoCombustible instanceof Electrico){
						respuesta = "Eléctrico";
					}
				}
			}
		}
		return respuesta;
	}

}



