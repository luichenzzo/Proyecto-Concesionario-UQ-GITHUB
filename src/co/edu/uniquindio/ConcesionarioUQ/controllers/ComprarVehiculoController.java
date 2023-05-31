package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

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
    private TextField txtCantidadEjes;


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

	/**
	 * Metodo que rellena los choiceBox con las posible opciones
	 */
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





    /**
	 * Metodo que se ejecuta cuando se desea continuar registrando un carro
	 * el metodo revisa la opcion de combustible y la opcion de tipovehiculo
	 */
    @FXML
    void continuarGeneralidades(ActionEvent event) {
    	if(choiceBoxTipoCombustible.getValue()!= null && choiceBoxTipoCombustible.getValue().equals("Híbrido")){
    		cambiarDeTab(hibrido);
    	}else{
    		if(choiceBoxTipoCombustible.getValue()!= null &&choiceBoxTipoCombustible.getValue().equals("Eléctrico")){
    			cambiarDeTab(electrico);
    		}else{
    			if(choiceBoxTipoVehiculo.getValue()!= null && choiceBoxTipoVehiculo.getValue().equals("Moto")){
    				GuardarMoto();
    			}else{
    				if(choiceBoxTipoVehiculo.getValue()!= null && choiceBoxTipoVehiculo.getValue().equals("Camión")){
    					cambiarDeTab(camion);
    				}else{
    					if(choiceBoxTipoVehiculo.getValue()!=null){
    						cambiarDeTab(automovil);
    					}
    				}
    			}
    		}
    	}
    }

    /**
     * Metodo que se ejecuta en caso de que se está registrando sea un vehiculo de tipo Moto
     */
	private void GuardarMoto() {

		String marca = txtMarca.getText();
		boolean nuevo = determinarBooleano(choiceBoxNuevo.getValue());
		int modelo = Integer.parseInt(txtModelo.getText());
		String a = txtCambios.getText();
		int cantidadCambios = Integer.parseInt(a);
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
				singleton.agregarVehiculo(x);
				System.out.println("guardado");
				singleton.crearAlerta("Vehiculo Registrado",null,"ha registrado un vehiculo con exito", AlertType.INFORMATION);

			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que el formato sea correcto",
						AlertType.ERROR);
			}

		}
	}

	/**
	 * Metodo que revisa si los campos de textos fueron rellenos de manera correcto
	 * @return true si todo se relleno de manera correcta y false en caso de que no
	 */
	private boolean validarDatosGeneralidades() {
		System.out.println("verificando");
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

	/*
	 * Metodo que cambia el Tab del pane para que el usuario pueda seguir llenando la informacion del
	 * vehiculo
	 */
	private void cambiarDeTab(Tab tab) {
        tabPane.getSelectionModel().select(tab);
    }



	/**
	 * Metodo que recorre las diferentes instancias de tipoCombustible para determinar cual opcion es la
	 * seleccionada
	 * @param tipoCombustible el tipo combustible del ComboBox que seleccionó el usuario
	 * @return la clase herencia de tipo combustible
	 */
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

	/**
	 * metodo que recorre las instancias de TipoTransmision para descifrar cual fue la seleccionada por el usuario
	 * @param tipoTransmision seleccionada en el comboBox
	 * @return la herencia de TipoTransmision
	 */
	private TipoTransmision determinarTipoTransmision(String tipoTransmision) {
		if (tipoTransmision.equalsIgnoreCase("Automatica")){
			return TipoTransmision.AUTOMATICA;
		}
		return TipoTransmision.MANUAL;
	}

	/*
	 * Metodo que permite continuar con el registro de vehiculo
	 */
	@FXML
    void continuarAutomovil(ActionEvent event) {
		if(choiceBoxTipoAutomovil.getValue()!= null && choiceBoxTipoAutomovil.getValue().equals("Deportivo")){
			cambiarDeTab(deportivo);
		}else{
			if(choiceBoxTipoAutomovil.getValue()!= null && choiceBoxTipoAutomovil.getValue().equals("Safe Family")){
				cambiarDeTab(safeFamily);
			}
		}
    }

	/*
	 * Metodo que permite continuar con el registro de vehiculo despues de ingresar los datos de electrico
	 */
    @FXML
    void continuarElectrico(ActionEvent event) {
    	if(choiceBoxTipoVehiculo.getValue()!= null && choiceBoxTipoVehiculo.getValue().equals("Moto")){
    		GuardarMoto();
    	}else{
    		if(choiceBoxTipoVehiculo.getValue()!= null && choiceBoxTipoVehiculo.getValue().equals("Camión")){
    			cambiarDeTab(camion);
    		}else{
    			if(choiceBoxTipoVehiculo.getValue()!=null){
    				cambiarDeTab(automovil);
    			}
    		}
    	}
    }

    /*
	 * Metodo que permite continuar con el registro de vehiculo despues de ingresar los datos de hibrido
	 */
    @FXML
    void continuarHibrido(ActionEvent event) {
		if(choiceBoxTipoVehiculo.getValue()!= null && choiceBoxTipoVehiculo.getValue().equals("Moto")){
			GuardarMoto();
    	}else{
    		if(choiceBoxTipoVehiculo.getValue()!= null && choiceBoxTipoVehiculo.getValue().equals("Camión")){
    			cambiarDeTab(camion);
    		}else{
    			if(choiceBoxTipoVehiculo.getValue()!= null){
    				cambiarDeTab(automovil);
    			}
    		}
    	}
	}

    /*
	 * Metodo que permite determinar si la opcion elegida por el usuario en combobox es True o False
	 */
	private boolean determinarBooleano(String value) {
		if (value.equals("SI")){
			return true;
		}
		return false;
	}

	/*
	 * Metodo que permite continuar con el registro de vehiculo despues de ingresar los datos de SafeFamily
	 */
    @FXML
    void continuarSafeFamily(ActionEvent event) {
    	if(choiceBoxTipoSafeFamily.getValue()!=null && choiceBoxTipoSafeFamily.getValue().equals("Pick Up")){
    		cambiarDeTab(pickup);
    	}else{
    		if(choiceBoxTipoSafeFamily.getValue()!= null && choiceBoxTipoSafeFamily.getValue().equals("Van")){
    			cambiarDeTab(van);
    		}
    	}
    }

    /*
	 * Metodo que permite continuar con el registro de vehiculo despues de ingresar los datos de Van
	 */
    @FXML
    void continuarVan(ActionEvent event) {
    	if(choiceBoxTipoVan.getValue()!= null && choiceBoxTipoVan.getValue().equals("Van")){
    		agregarVan();
    	}else{
    		if(choiceBoxTipoVan.getValue()!= null && choiceBoxTipoVan.getValue().equals("Bus")){
    			cambiarDeTab(bus);
    		}else{
    			if(choiceBoxTipoVan.getValue()!= null && choiceBoxTipoVan.getValue().equals("Sedaneta")){
    				cambiarDeTab(sedaneta);
    			}
    		}
    	}
    }

    /*
	 * Metodo que permite continuar con el registro de vehiculo despues de ingresar los datos de Sedan
	 */
    @FXML
    void continuarSedaneta(ActionEvent event) {
    	if(choiceBoxTipoSedan.getValue()!=null && choiceBoxTipoSedan.getValue().equals("Sedán")){
    		agregarSedan();
    	}else{
    		if(choiceBoxTipoSedan.getValue()!= null && choiceBoxTipoSedan.getValue().equals("Camioneta")){
    			cambiarDeTab(camioneta);
    		}
    	}
    }



    /**
     * Metodo que guarda el vehiculo de tipo bus una vez todos los parametros han sido llenados
     * @param event el boton de guardar
     */
    @FXML
    void guardarBus(ActionEvent event) {
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
		Double precio = Double.valueOf(txtPrecioCompra.getText());
		int numeroPasajeros = Integer.parseInt(txtNumeroPasajeros.getText());
		int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
		int bolsasAire = Integer.parseInt(txtBolsasAire.getText());
		boolean aireAcondicionado = determinarBooleano(choiceBoxAireAcondicionadoSafeFamily.getValue());
		boolean camaraReversa = determinarBooleano(choiceBoxCamaraReversaSafeFamily.getValue());
		boolean frenoABS = determinarBooleano(choiceBoxFrenoABSSafeFamily.getValue());
		int capacidadMaletero = Integer.parseInt(txtCapacidadMaletero.getText());
		int cantidadEjes = Integer.parseInt(txtCantidadEjes.getText());
		int cantidadSalidasEmergencia = Integer.parseInt(txtSalidasEmergencia.getText());


		if (validarDatosGeneralidades() && validarDatosAutomovil()&& validarDatosSafeFamily()&& validarDatosVan() && validarDatosBus()){
    		try {
				Vehiculo x = new Bus(marca, nuevo, modelo, cantidadCambios, velocidadMaxima, cilindraje, placa, rutaImagen, tipoTransmision, tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS, capacidadMaletero, cantidadEjes,cantidadSalidasEmergencia, precio);
				singleton.agregarVehiculo(x);
				singleton.crearAlerta("Vehiculo Registrado",null,"ha registrado un vehiculo con exito", AlertType.INFORMATION);

			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que el formato sea correcto",
						AlertType.ERROR);
			}
    	}


    }


    /**
     * Metodo que verifica que todos los parametros de bus hayan sido llenados correctamente
     * @return True si fueron llenados correctamente, false si no fueron llenados correctamente
     */
    private boolean validarDatosBus() {
		String notificacion = "";
		if (txtCantidadEjes.getText().equals("")||txtCantidadEjes.getText()==null){
			notificacion = "Campos llenos";
		}
		if (txtSalidasEmergencia.getText().equals("")||txtSalidasEmergencia.getText()==null){
			notificacion = "Campos llenos";
		}
		if(notificacion.equals("")){
			return true;
		}
		return false;
	}

    /**
     * Metodo que guarda el vehiculo de tipo camión una vez todos los parametros han sido llenados
     * @param event el boton de guardar
     */
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
		Double precio = Double.valueOf(txtPrecioCompra.getText());
		boolean aireAcondicionado = determinarBooleano(choiceBoxAireAcondicionadoCamion.getValue());
		boolean frenoABS = determinarBooleano(choiceBoxFrenoABSCamion.getValue());
		int numeroEjes = Integer.parseInt(txtNumeroEjesCamion.getText());
		boolean frenoAire = determinarBooleano(choiceBoxFrenoAireCamion.getValue());
		String tipoCamion = txtTipoCamion.getText();

    	if (validarDatosGeneralidades() && validarDatosCamion()){
    		try {
				Vehiculo x = new Camion(marca, nuevo, modelo, cantidadCambios, velocidadMaxima, cilindraje, placa, rutaImagen, tipoTransmision, tipoCombustible, aireAcondicionado,frenoABS, numeroEjes, frenoAire, tipoCamion, precio);
				singleton.agregarVehiculo(x);
				singleton.crearAlerta("Vehiculo Registrado",null,"ha registrado un vehiculo con exito", AlertType.INFORMATION);

			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que el formato sea correcto",
						AlertType.ERROR);
			}
    	}
    }

	/**
	 * Metodo que valida si los parametros para comprar un camión se llenaron correctamente
	 * @return True si se llenaron correctamente, false si No se llenaron correctamente
	 */
    private boolean validarDatosCamion() {
		String x = "";
		if (choiceBoxAireAcondicionadoCamion.getValue()==null){
			x = "campo Vacio";
		}
		if (choiceBoxFrenoABSCamion.getValue()==null){
			x = "campo Vacio";
		}
		if(txtNumeroEjesCamion.getText().equals("") || txtNumeroEjesCamion.getText()==null){
			x = "campo Vacio";
		}
		if(choiceBoxFrenoAireCamion.getValue()==null){
			x = "campo Vacio";
		}
		if(txtTipoCamion.getText().equals("")||txtTipoCamion.getText()==null){
			x = "campo Vacio";
		}
		if (x.equals("")){
			return true;
		}
		return false;
	}



    /**
     * Metodo que guarda el vehiculo de tipo deportivo una vez todos los parametros han sido llenados
     * @param event el boton de guardar
     */
    @FXML
    void guardarDeportivo(ActionEvent event) {
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
		Double precio = Double.valueOf(txtPrecioCompra.getText());
		int numeroPasajeros = Integer.parseInt(txtNumeroPasajeros.getText());
		int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
		int bolsasAire = Integer.parseInt(txtBolsasAire.getText());
		int caballosFuerza = Integer.parseInt(txtCaballosFuerza.getText());
		int Tiempo100km = Integer.parseInt(txtTiempo100km.getText());

		if (validarDatosGeneralidades() && validarDatosAutomovil()&& validarDatosDeportivo()){
    		try {
				Vehiculo x = new Deportivo(marca, nuevo, modelo, cantidadCambios, velocidadMaxima, cilindraje, placa, rutaImagen, tipoTransmision, tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire,caballosFuerza,Tiempo100km, precio);
				singleton.agregarVehiculo(x);
				System.out.println("agregado");
				singleton.crearAlerta("Vehiculo Registrado",null,"ha registrado un vehiculo con exito", AlertType.INFORMATION);
				System.out.println("agregado");
			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que el formato sea correcto",
						AlertType.ERROR);
			}
    	}


    }

    /**
	 * Metodo que valida si los parametros para comprar un deportivo se llenaron correctamente
	 * @return True si se llenaron correctamente, false si No se llenaron correctamente
	 */
    private boolean validarDatosDeportivo() {
    	String notificacion = "";
    	if (txtCaballosFuerza.getText().equals("")||txtCaballosFuerza.getText()==null){
    		notificacion = "Campos llenos";
    	}
    	if (txtTiempo100km.getText().equals("")||txtTiempo100km.getText()== null){
    		notificacion = "Campos llenos";
    	}
    	if(notificacion.equals("")){
    		return true;
    	}
    	return false;
	}

    /**
	 * Metodo que valida si los parametros para comprar un automovil se llenaron correctamente
	 * @return True si se llenaron correctamente, false si No se llenaron correctamente
	 */
	private boolean validarDatosAutomovil() {
		String notificacion = "";
		if(txtNumeroPasajeros.getText().equals("")||txtNumeroPasajeros.getText()==null){
			notificacion = "Campos llenos";
		}
		if(txtNumeroPuertas.getText().equals("")||txtNumeroPuertas.getText()==null){
			notificacion = "Campos llenos";
		}
		if(txtBolsasAire.getText().equals("")||txtBolsasAire.getText()==null){
			notificacion = "Campos llenos";
		}
		if(notificacion.equals("")){
			return true;
		}
		return false;
	}

	/**
     * Metodo que guarda el vehiculo de tipo Camioneta una vez todos los parametros han sido llenados
     * @param event el boton de guardar
     */
	@FXML
    void guardarCamioneta(ActionEvent event) {
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
		Double precio = Double.valueOf(txtPrecioCompra.getText());
		int numeroPasajeros = Integer.parseInt(txtNumeroPasajeros.getText());
		int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
		int bolsasAire = Integer.parseInt(txtBolsasAire.getText());
		boolean aireAcondicionado = determinarBooleano(choiceBoxAireAcondicionadoSafeFamily.getValue());
		boolean camaraReversa = determinarBooleano(choiceBoxCamaraReversaSafeFamily.getValue());
		boolean frenoABS = determinarBooleano(choiceBoxFrenoABSSafeFamily.getValue());
		int capacidadMaletero = Integer.parseInt(txtCapacidadMaletero.getText());
		boolean velocidadCrucero = determinarBooleano(choiceBoxVelocidadCrecuero.getValue());
		boolean sensorColision = determinarBooleano(choiceBoxSensorColision.getValue());
		boolean sensorTraficoCruzado = determinarBooleano(choiceBoxSensorTraficoCruzado.getValue());
		boolean permanenciaCarril = determinarBooleano(choiceBoxPermanenciaCarrirl.getValue());
		boolean is4x4 = determinarBooleano(choiceBox4x4Camioneta.getValue());

		if (validarDatosGeneralidades() && validarDatosAutomovil()&& validarDatosSafeFamily()&& validarDatosVan() && validarDatosSedan() && validarDatosCamioneta()){
    		try {
				Vehiculo x = new Camioneta(marca, nuevo, modelo, cantidadCambios, velocidadMaxima, cilindraje, placa, rutaImagen, tipoTransmision, tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS, capacidadMaletero, velocidadCrucero,sensorColision, sensorTraficoCruzado, permanenciaCarril, is4x4, precio);
				singleton.agregarVehiculo(x);
				singleton.crearAlerta("Vehiculo Registrado",null,"ha registrado un vehiculo con exito", AlertType.INFORMATION);

			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que el formato sea correcto",
						AlertType.ERROR);
			}
    	}


    }

	/**
	 * Metodo que valida si los parametros para comprar una Camioneta se llenaron correctamente
	 * @return True si se llenaron correctamente, false si No se llenaron correctamente
	 */
	private boolean validarDatosCamioneta() {
		if ( choiceBox4x4Camioneta.getValue()==null){
			return false;
		}return true;
	}

	/**
     * Metodo que guarda el vehiculo de tipo sedan una vez todos los parametros han sido llenados
     * @param event el boton de guardar
     */
	private void agregarSedan(){
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
		Double precio = Double.valueOf(txtPrecioCompra.getText());
		int numeroPasajeros = Integer.parseInt(txtNumeroPasajeros.getText());
		int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
		int bolsasAire = Integer.parseInt(txtBolsasAire.getText());
		boolean aireAcondicionado = determinarBooleano(choiceBoxAireAcondicionadoSafeFamily.getValue());
		boolean camaraReversa = determinarBooleano(choiceBoxCamaraReversaSafeFamily.getValue());
		boolean frenoABS = determinarBooleano(choiceBoxFrenoABSSafeFamily.getValue());
		int capacidadMaletero = Integer.parseInt(txtCapacidadMaletero.getText());
		boolean velocidadCrucero = determinarBooleano(choiceBoxVelocidadCrecuero.getValue());
		boolean sensorColision = determinarBooleano(choiceBoxSensorColision.getValue());
		boolean sensorTraficoCruzado = determinarBooleano(choiceBoxSensorTraficoCruzado.getValue());
		boolean permanenciaCarril = determinarBooleano(choiceBoxPermanenciaCarrirl.getValue());


		if (validarDatosGeneralidades() && validarDatosAutomovil()&& validarDatosSafeFamily()&& validarDatosVan() && validarDatosSedan()){
    		try {
				Vehiculo x = new Sedan(marca, nuevo, modelo, cantidadCambios, velocidadMaxima, cilindraje, placa, rutaImagen, tipoTransmision, tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS, capacidadMaletero, velocidadCrucero,sensorColision, sensorTraficoCruzado, permanenciaCarril, precio);
				singleton.agregarVehiculo(x);
				singleton.crearAlerta("Vehiculo Registrado",null,"ha registrado un vehiculo con exito", AlertType.INFORMATION);

			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que el formato sea correcto",
						AlertType.ERROR);
			}
    	}

	}

	/**
     * Metodo que guarda el vehiculo de tipo sedan una vez todos los parametros han sido llenados
     * @param event el boton de guardar
     */
	private boolean validarDatosSedan() {
		String notificacion = "";
		if ( choiceBoxVelocidadCrecuero.getValue()==null){
			notificacion = "Campos llenos";
		}
		if(choiceBoxSensorColision.getValue()== null){
			notificacion = "Campos llenos";
		}
		if (choiceBoxSensorTraficoCruzado.getValue()==null){
			notificacion = "Campos llenos";
		}
		if(choiceBoxPermanenciaCarrirl.getValue()==null){
			notificacion = "Campos llenos";
		}
		if (notificacion.equals("")){
			return true;
		}
		return false;
	}

	/**
     * Metodo que guarda el vehiculo de tipo van una vez todos los parametros han sido llenados
     * @param event el boton de guardar
     */
	private void agregarVan(){
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
		Double precio = Double.valueOf(txtPrecioCompra.getText());
		int numeroPasajeros = Integer.parseInt(txtNumeroPasajeros.getText());
		int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
		int bolsasAire = Integer.parseInt(txtBolsasAire.getText());
		boolean aireAcondicionado = determinarBooleano(choiceBoxAireAcondicionadoSafeFamily.getValue());
		boolean camaraReversa = determinarBooleano(choiceBoxCamaraReversaSafeFamily.getValue());
		boolean frenoABS = determinarBooleano(choiceBoxFrenoABSSafeFamily.getValue());
		int capacidadMaletero = Integer.parseInt(txtCapacidadMaletero.getText());


		if (validarDatosGeneralidades() && validarDatosAutomovil()&& validarDatosSafeFamily()&& validarDatosVan()){
    		try {
				Vehiculo x = new Van(marca, nuevo, modelo, cantidadCambios, velocidadMaxima, cilindraje, placa, rutaImagen, tipoTransmision, tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS, capacidadMaletero, precio);
				singleton.agregarVehiculo(x);
				singleton.crearAlerta("Vehiculo Registrado",null,"ha registrado un vehiculo con exito", AlertType.INFORMATION);

			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que el formato sea correcto",
						AlertType.ERROR);
			}
    	}

	}

	/**
	 * Metodo que valida si los parametros para comprar un van se llenaron correctamente
	 * @return True si se llenaron correctamente, false si No se llenaron correctamente
	 */
	private boolean validarDatosVan() {
		if(txtCapacidadMaletero.getText().equals("")||txtCapacidadMaletero.getText()==null){
			return true;
		}return false;
	}

	/**
     * Metodo que guarda el vehiculo de tipo PickUp una vez todos los parametros han sido llenados
     * @param event el boton de guardar
     */
	@FXML
    void guardarPickUp(ActionEvent event) {
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
		Double precio = Double.valueOf(txtPrecioCompra.getText());
		int numeroPasajeros = Integer.parseInt(txtNumeroPasajeros.getText());
		int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
		int bolsasAire = Integer.parseInt(txtBolsasAire.getText());
		boolean aireAcondicionado = determinarBooleano(choiceBoxAireAcondicionadoSafeFamily.getValue());
		boolean camaraReversa = determinarBooleano(choiceBoxCamaraReversaSafeFamily.getValue());
		boolean frenoABS = determinarBooleano(choiceBoxFrenoABSSafeFamily.getValue());
		int capacidadCarga = Integer.parseInt(txtCapacidadCarga.getText());
		boolean is4x4 = determinarBooleano(choiceBox4X4PickUp.getValue());

		if (validarDatosGeneralidades() && validarDatosAutomovil()&& validarDatosSafeFamily()&& validarDatosPickUp()){
    		try {
				Vehiculo x = new PickUp(marca, nuevo, modelo, cantidadCambios, velocidadMaxima, cilindraje, placa, rutaImagen, tipoTransmision, tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS, capacidadCarga, is4x4, precio);
				singleton.agregarVehiculo(x);
				singleton.crearAlerta("Vehiculo Registrado",null,"ha registrado un vehiculo con exito", AlertType.INFORMATION);

			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que el formato sea correcto",
						AlertType.ERROR);
			}
    	}
    }

	/**
	 * Metodo que valida si los parametros para comprar un PickUp se llenaron correctamente
	 * @return True si se llenaron correctamente, false si No se llenaron correctamente
	 */
	private boolean validarDatosPickUp() {
		String notificacion = "";
		if(txtCapacidadCarga.getText().equals("")||txtCapacidadCarga.getText()==null){
			notificacion = "Campos llenos";
		}
		if (choiceBox4X4PickUp.getValue()==null){
			notificacion = "Campos llenos";
		}
		if(notificacion.equals("")){
			return true;
		}
		return false;
	}

	/**
	 * Metodo que valida si los parametros para comprar un SafeFamily se llenaron correctamente
	 * @return True si se llenaron correctamente, false si No se llenaron correctamente
	 */
	private boolean validarDatosSafeFamily() {
		String notificacion = "";
		if(choiceBoxAireAcondicionadoSafeFamily.getValue()== null){
			notificacion = "Campos llenos";
		}
		if(choiceBoxCamaraReversaSafeFamily.getValue()== null){
			notificacion = "Campos llenos";
		}
		if(choiceBoxFrenoABSSafeFamily.getValue()==null){
			notificacion = "Campos llenos";
		}
		if(notificacion.equals("")){
			return true;
		}
		return false;
	}

}
