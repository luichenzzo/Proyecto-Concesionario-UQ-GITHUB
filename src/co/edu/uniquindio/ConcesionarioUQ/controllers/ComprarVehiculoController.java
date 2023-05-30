package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.model.Bus;
import co.edu.uniquindio.ConcesionarioUQ.model.Camion;
import co.edu.uniquindio.ConcesionarioUQ.model.Camioneta;
import co.edu.uniquindio.ConcesionarioUQ.model.Deportivo;
import co.edu.uniquindio.ConcesionarioUQ.model.Diesel;
import co.edu.uniquindio.ConcesionarioUQ.model.Electrico;
import co.edu.uniquindio.ConcesionarioUQ.model.Gasolina;
import co.edu.uniquindio.ConcesionarioUQ.model.Hibrido;
import co.edu.uniquindio.ConcesionarioUQ.model.Moto;
import co.edu.uniquindio.ConcesionarioUQ.model.PickUp;
import co.edu.uniquindio.ConcesionarioUQ.model.Sedan;
import co.edu.uniquindio.ConcesionarioUQ.model.TipoCombustible;
import co.edu.uniquindio.ConcesionarioUQ.model.TipoTransmision;
import co.edu.uniquindio.ConcesionarioUQ.model.Van;
import co.edu.uniquindio.ConcesionarioUQ.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPaneBuilder;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ComprarVehiculoController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Tab automovil;

    @FXML
    private Button btnContinuarAutomovil;

    @FXML
    private Button btnContinuarElectrico;

    @FXML
    private Button btnContinuarGeneralidades;

    @FXML
    private Button btnContinuarSafeFamily;

    @FXML
    private Button btnContinuarSedaneta;

    @FXML
    private Button btnContinuarVan;

    @FXML
    private Button btnContinuarhibrido;

    @FXML
    private Button btnGuadarPickUp;

    @FXML
    private Button btnGuardarBus;

    @FXML
    private Button btnGuardarCamion;

    @FXML
    private Button btnGuardarCamioneta;

    @FXML
    private Button btnGuardarDeportivo;

    @FXML
    private Tab bus;

    @FXML
    private Tab camion;

    @FXML
    private Tab camioneta;

    @FXML
    private ChoiceBox<String> choiceBox4X4PickUp;

    @FXML
    private ChoiceBox<String> choiceBox4x4Camioneta;

    @FXML
    private ChoiceBox<String> choiceBoxAireAcondicionadoCamion;

    @FXML
    private ChoiceBox<String> choiceBoxAireAcondicionadoSafeFamily;

    @FXML
    private ChoiceBox<String> choiceBoxCamaraReversaSafeFamily;

    @FXML
    private ChoiceBox<String> choiceBoxEnchufable;

    @FXML
    private ChoiceBox<String> choiceBoxFrenoABSCamion;

    @FXML
    private ChoiceBox<String> choiceBoxFrenoABSSafeFamily;

    @FXML
    private ChoiceBox<String> choiceBoxFrenoAireCamion;

    @FXML
    private ChoiceBox<String> choiceBoxLigero;

    @FXML
    private ChoiceBox<String> choiceBoxNuevo;

    @FXML
    private ChoiceBox<String> choiceBoxPermanenciaCarrirl;

    @FXML
    private ChoiceBox<String> choiceBoxSensorColision;

    @FXML
    private ChoiceBox<String> choiceBoxSensorTraficoCruzado;

    @FXML
    private ChoiceBox<String> choiceBoxTipoAutomovil;

    @FXML
    private ChoiceBox<String> choiceBoxTipoCombustible;

    @FXML
    private ChoiceBox<String> choiceBoxTipoSafeFamily;

    @FXML
    private ChoiceBox<String> choiceBoxTipoSedan;

    @FXML
    private ChoiceBox<String> choiceBoxTipoTransmision;

    @FXML
    private ChoiceBox<String> choiceBoxTipoVan;

    @FXML
    private ChoiceBox<String> choiceBoxTipoVehiculo;

    @FXML
    private ChoiceBox<String> choiceBoxVelocidadCrecuero;

    @FXML
    private Tab deportivo;

    @FXML
    private Tab electrico;

    @FXML
    private Tab generalidades;

    @FXML
    private Tab hibrido;

    @FXML
    private Tab pickup;

    @FXML
    private Tab safeFamily;

    @FXML
    private Tab sedaneta;

    @FXML
    private TextField txtAutonomia;

    @FXML
    private TextField txtBolsasAire;

    @FXML
    private TextField txtCaballosFuerza;

    @FXML
    private TextField txtCambios;

    @FXML
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtCapacidadMaletero;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TextField txtIdentificacionProveedor;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtNumeroEjesCamion;

    @FXML
    private TextField txtNumeroPasajeros;

    @FXML
    private TextField txtNumeroPuertas;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtPrecioCompra;

    @FXML
    private TextField txtRutaImagen;

    @FXML
    private TextField txtSalidasEmergencia;

    @FXML
    private TextField txtTiempo100km;

    @FXML
    private TextField txtTiempoCarga;

    @FXML
    private TextField txtTipoCamion;

    @FXML
    private TextField txtVelocidadMaxima;

    @FXML
    private Tab van;

    private Singleton singleton = Singleton.obtenerInstancia();

    @FXML
    private TabPane tabPane;

    private Vehiculo vehiculo;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		llenarChoiceBox();

	}

    private void llenarChoiceBox() {
		List<String>listatipoVehiculo = Arrays.asList("Moto","Camión","Deportivo","Pick Up","Van","Sedán","Camioneta","Bus");
		choiceBoxTipoVehiculo.setItems(FXCollections.observableArrayList(listatipoVehiculo));

		List<String>listaTipoTransmision = Arrays.asList("Automática","Manual");
		choiceBoxTipoTransmision.setItems(FXCollections.observableArrayList(listaTipoTransmision));

		List<String>listaTipoCombustible = Arrays.asList("Gasolina","Diesel","Híbrido","Eléctrico");
		choiceBoxTipoCombustible.setItems(FXCollections.observableArrayList(listaTipoCombustible));

		List<String>listaTipoAutomovil = Arrays.asList("Deportivo","Safe Family");
		choiceBoxTipoAutomovil.setItems(FXCollections.observableArrayList(listaTipoAutomovil));

		List<String>listaTipoSafeFamily= Arrays.asList("Pick Up","Van");
		choiceBoxTipoSafeFamily.setItems(FXCollections.observableArrayList(listaTipoSafeFamily));

		List<String>listaTipoVan= Arrays.asList("Sedaneta","Bus","Van");
		choiceBoxTipoVan.setItems(FXCollections.observableArrayList(listaTipoVan));

		List<String>listaTipoSedaneta= Arrays.asList("Sedán","Camioneta");
		choiceBoxTipoSedan.setItems(FXCollections.observableArrayList(listaTipoSedaneta));

		List<String>listaBooleanos= Arrays.asList("SI","NO");
		choiceBoxNuevo.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxEnchufable.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxLigero.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxAireAcondicionadoCamion.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxFrenoABSCamion.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxFrenoAireCamion.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxAireAcondicionadoSafeFamily.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxCamaraReversaSafeFamily.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxFrenoABSSafeFamily.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBox4X4PickUp.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxVelocidadCrecuero.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxSensorColision.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxSensorTraficoCruzado.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBoxPermanenciaCarrirl.setItems(FXCollections.observableArrayList(listaBooleanos));
		choiceBox4x4Camioneta.setItems(FXCollections.observableArrayList(listaBooleanos));

	}




    //falta un metodo para cada ventana que verifique que los textFields este llenos
    @FXML
    void continuarGeneralidades(ActionEvent event) {
    	if(choiceBoxTipoCombustible.getValue()!= null && choiceBoxTipoCombustible.getValue().equals("Híbrido")){
    		cambiarDeTab(hibrido);
    	}else{
    		if(choiceBoxTipoCombustible.getValue().equals("Eléctrico")){
    			cambiarDeTab(electrico);
    		}else{
    			if(choiceBoxTipoVehiculo.getValue().equals("Moto")){
    				GuardarMoto();
    			}else{
    				if(choiceBoxTipoVehiculo.getValue().equals("Camión")){
    					cambiarDeTab(camion);
    				}else{
    					cambiarDeTab(automovil);
    				}
    			}
    		}
    	}
    }

	private void GuardarMoto() {

		String marca = txtMarca.getText();
		boolean nuevo = determinarBooleano(choiceBoxNuevo.getValue());
		int modelo = Integer.parseInt(txtModelo.getText());
		System.out.println(modelo);
		String a = txtCambios.getText();


		int cantidadCambios = Integer.parseInt(a);
		System.out.println(cantidadCambios);
		int velocidadMaxima = Integer.parseInt(txtVelocidadMaxima.getText());
		int cilindraje = Integer.parseInt(txtCilindraje.getText());
		String placa = txtPlaca.getText();
		String rutaImagen = txtRutaImagen.getText();
		TipoTransmision tipoTransmision = determinarTipoTransmision(choiceBoxTipoTransmision.getValue());
		TipoCombustible tipoCombustible= determinarTipoCombustible(choiceBoxTipoCombustible.getValue());
		Double precio = Double.valueOf(txtPrecioCompra.getText());

		if(validarDatosGeneralidades()){
			try {
				Vehiculo x = new Moto(marca, nuevo, modelo, cantidadCambios, velocidadMaxima, cilindraje, placa, rutaImagen, tipoTransmision, tipoCombustible, precio);

			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que el formato sea correcto",
						AlertType.ERROR);
			}

		}
	}

	private boolean validarDatosGeneralidades() {
		String marca = txtMarca.getText();
		String nuevo = choiceBoxNuevo.getValue();
		String modelo = txtModelo.getText();
		String cantidadCambios = txtCambios.getText();
		String velocidadMaxima = txtVelocidadMaxima.getText();
		String cilindraje = txtCilindraje.getText();
		String placa = txtPlaca.getText();
		String rutaImagen = txtRutaImagen.getText();
		String tipoTransmision = choiceBoxTipoTransmision.getValue();
		String tipoCombustible= choiceBoxTipoCombustible.getValue();

		String notificacion = "";
		if(marca.equals("")|| marca == null){
			notificacion = "Campo Vacio";
		}
		if(nuevo.equals("")|| nuevo == null){
			notificacion = "Campo Vacio";
		}
		if(modelo.equals("")||  modelo == null){
			notificacion = "Campo Vacio";
		}
		if(cantidadCambios.equals("")|| cantidadCambios == null){
			notificacion = "Campo Vacio";
		}
		if(velocidadMaxima.equals("")|| velocidadMaxima == null){
			notificacion = "Campo Vacio";
		}
		if(cilindraje.equals("")|| cilindraje == null){
			notificacion = "Campo Vacio";
		}
		if(placa.equals("")|| placa == null){
			notificacion = "Campo Vacio";
		}
		if(rutaImagen.equals("")|| rutaImagen == null){
			notificacion = "Campo Vacio";
		}
		if(tipoTransmision.equals("")|| tipoTransmision == null){
			notificacion = "Campo Vacio";
		}
		if(tipoCombustible.equals("")|| tipoCombustible == null){
			notificacion = "Campo Vacio";
		}
		if(notificacion.equals("")){
			return true;
		}

		return false;
	}

	private void cambiarDeTab(Tab tab) {
        tabPane.getSelectionModel().select(tab);
    }



	private TipoCombustible determinarTipoCombustible(String tipoCombustible) {
    	TipoCombustible x = null;
		if(tipoCombustible.equalsIgnoreCase("Diesel")){
			x = new Diesel();
		}else{
			if(tipoCombustible.equalsIgnoreCase("Gasolina")){
				x = new Gasolina();
			}else{
				if(tipoCombustible.equalsIgnoreCase("Híbrido")){
					Hibrido hibrido = new Hibrido();
					hibrido.setEnchufable(determinarBooleano(choiceBoxEnchufable.getValue()));
					hibrido.setLigero(determinarBooleano(choiceBoxLigero.getValue()));
					x = hibrido;
				}else{
					if(tipoCombustible.equalsIgnoreCase("Eléctrico")){
						Electrico electrico = new Electrico();
						electrico.setAutonomia(Integer.parseInt(txtAutonomia.getText()));
						electrico.setTiempoCarga(Integer.parseInt(txtTiempoCarga.getText()));
						x = electrico;
					}
				}
			}
		}
		return x;
	}


	private TipoTransmision determinarTipoTransmision(String tipoTransmision) {
		if (tipoTransmision.equalsIgnoreCase("Automatica")){
			return TipoTransmision.AUTOMATICA;
		}
		return TipoTransmision.MANUAL;
	}

	@FXML
    void continuarAutomovil(ActionEvent event) {
		if(choiceBoxTipoAutomovil.getValue().equals("Deportivo")){
			cambiarDeTab(deportivo);
		}else{
			if(choiceBoxTipoAutomovil.getValue().equals("Safe Family")){
				cambiarDeTab(safeFamily);
			}
		}
    }

    @FXML
    void continuarElectrico(ActionEvent event) {
    	if(choiceBoxTipoVehiculo.getValue().equals("Moto")){
    		//guardar Moto
    	}else{
    		if(choiceBoxTipoVehiculo.getValue().equals("Camión")){
    			cambiarDeTab(camion);
    		}else{
    			cambiarDeTab(automovil);
    		}
    	}
    }



	private boolean determinarBooleano(String value) {
		if (value.equals("SI")){
			return true;
		}
		return false;
	}

	@FXML
    void continuarHibrido(ActionEvent event) {
		if(choiceBoxTipoVehiculo.getValue().equals("Moto")){
    		//guardar Moto
    	}else{
    		if(choiceBoxTipoVehiculo.getValue().equals("Camión")){
    			cambiarDeTab(camion);
    		}else{
    			cambiarDeTab(automovil);
    		}
    	}
	}

    @FXML
    void continuarSafeFamily(ActionEvent event) {
    	if(choiceBoxTipoSafeFamily.getValue().equals("Pick Up")){
    		cambiarDeTab(pickup);
    	}else{
    		if(choiceBoxTipoSafeFamily.getValue().equals("Van")){
    			cambiarDeTab(van);
    		}
    	}
    }

    @FXML
    void continuarSedaneta(ActionEvent event) {
    	if(choiceBoxTipoSedan.getValue().equals("Sedán")){
    		//guardarSedan
    	}else{
    		if(choiceBoxTipoSedan.getValue().equals("Camioneta")){
    			cambiarDeTab(camioneta);
    		}
    	}
    }

    @FXML
    void continuarVan(ActionEvent event) {
    	if(choiceBoxTipoVan.getValue().equals("Van")){
    		//guardar Van
    	}else{
    		if(choiceBoxTipoVan.getValue().equals("Bus")){
    			cambiarDeTab(bus);
    		}else{
    			if(choiceBoxTipoVan.getValue().equals("Sedaneta")){
    				cambiarDeTab(sedaneta);
    			}
    		}
    	}
    }

    @FXML
    void guardarBus(ActionEvent event) {

    }

    @FXML
    void guardarCamion(ActionEvent event) {
    	String marca = txtMarca.getText();
		boolean nuevo = determinarBooleano(choiceBoxNuevo.getValue());
		int modelo = Integer.parseInt(txtModelo.getText());
		int cantidadCambios = Integer.parseInt(txtCambios.getText());
		int velocidadMaxima = Integer.parseInt(txtVelocidadMaxima.getText());
		int cilindraje = Integer.parseInt(txtCilindraje.getText());
		String placa = txtPlaca.getText();
		String rutaImagen = txtRutaImagen.getText();
		TipoTransmision tipoTransmision = determinarTipoTransmision(choiceBoxTipoTransmision.getValue());
		TipoCombustible tipoCombustible= determinarTipoCombustible(choiceBoxTipoCombustible.getValue());

    }

    @FXML
    void guardarCamioneta(ActionEvent event) {

    }

    @FXML
    void guardarDeportivo(ActionEvent event) {

    }

    @FXML
    void guardarPickUp(ActionEvent event) {

    }

}
