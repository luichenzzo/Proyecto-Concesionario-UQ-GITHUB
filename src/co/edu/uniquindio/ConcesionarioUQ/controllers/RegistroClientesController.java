package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class RegistroClientesController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnVaciarCampos;

    @FXML
    private TableColumn<?, ?> columnEmail;

    @FXML
    private TableColumn<?, ?> columnIdentificacion;

    @FXML
    private TableColumn<?, ?> columnNombre;

    @FXML
    private TableView<Cliente> tablaClientes;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    private Singleton singleton = Singleton.obtenerInstancia();

    /**
     * Metodo que revisa si el cliente que fue digitado ya existe, para registrarlo o para advertir al usuario que
     * el cliente digitado ya existe
     * @param event
     */
    @FXML
    void actualizar(ActionEvent event) {
		Cliente cliente = this.tablaClientes.getSelectionModel().getSelectedItem();

		if (cliente == null) {
			singleton.crearAlerta("Error", "Selección item", "seleccione un cliente", AlertType.ERROR);
		} else {
			String nombre = txtNombre.getText();
			int edad = Integer.parseInt(txtEdad.getText());
			String identificacion = txtIdentificacion.getText();
			String email = txtEmail.getText();
			String telefono = txtTelefono.getText();
			if (singleton.verificarCamposLlenos(txtNombre,txtEdad,txtIdentificacion, txtEmail, txtTelefono)) {
				try {

					Cliente clienteaux = new Cliente(nombre, edad, identificacion, email, telefono,null,null);
					if (singleton.contarClientesIdentificacionIgual(cliente) == 1) {

						cliente.setNombre(clienteaux.getNombre());
						cliente.setEdad(clienteaux.getEdad());
						cliente.setIdentificacion(clienteaux.getIdentificacion());
						cliente.setEmail(clienteaux.getEmail());
						cliente.setTelefono(clienteaux.getTelefono());

						refrescarTabla();
					} else {
						singleton.crearAlerta("Error empleado", null, "cliente ya registrado", AlertType.ERROR);

					}
				} catch (NumberFormatException e) {
					singleton.crearAlerta("Error Formato", null, "verifique que la edad sea un número",
							AlertType.ERROR);
				}
			}else{
				singleton.crearAlerta("Error Formato","Campos en blanco","ingrese toda la información solicitada",AlertType.ERROR);
			}
    	}

    }

    /**
     * Metodo que agrega el cliente digitado a la base de datos
     * @param event
     */
    @FXML
    void agregar(ActionEvent event) {
    	String nombre = txtNombre.getText();
		Integer edad = Integer.parseInt(txtEdad.getText());
		String identificacion = txtIdentificacion.getText();
		String email = txtEmail.getText();
		String telefono = txtTelefono.getText();

		if (singleton.verificarCamposLlenos(txtNombre,txtEdad,txtIdentificacion, txtEmail, txtTelefono)) {

			try {

				Cliente cliente = new Cliente(nombre, edad, identificacion, email, telefono,null,null);

				if (!singleton.getConcesionario().getListaClientes().contains(cliente)) {
					singleton.agregarCliente(cliente);
					this.tablaClientes.setItems(singleton.obtenerListaClientes());
				} else {
					singleton.crearAlerta("Error cliente", null, "cliente ya registrado", AlertType.ERROR);

				}
			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que la edad sea un número", AlertType.ERROR);
			}
		}else{
			singleton.crearAlerta("Error Formato","Campos en blanco","ingrese toda la información solicitada",AlertType.ERROR);
		}

    }

    /**
     * Metodo que elimina al cliente seleccionado
     * @param event
     */
    @FXML
    void eliminar(ActionEvent event) {
    	Cliente cliente = this.tablaClientes.getSelectionModel().getSelectedItem();

    	if (cliente == null){
    		singleton.crearAlerta("Error","Selección item","seleccione un cliente", AlertType.ERROR);
    	}else{
    		singleton.getConcesionario().getListaClientes().remove(cliente);
    		refrescarTabla();
    	}

    }

    /**
     * Metodo que muestra la informacion del cliente que fue seleccionado
     * @param event
     */
    @FXML
    void seleccionar(MouseEvent event) {
    	Cliente cliente = this.tablaClientes.getSelectionModel().getSelectedItem();

    	if(cliente != null){
    		txtNombre.setText(cliente.getNombre());
    		txtEdad.setText(cliente.getEdad()+"");
    		txtIdentificacion.setText(cliente.getIdentificacion());
    		txtEmail.setText(cliente.getEmail());
    		txtTelefono.setText(cliente.getTelefono());
    	}

    }

    @FXML
    void vaciarCampos(ActionEvent event) {
    	txtNombre.setText("");
    	txtEdad.setText("");
    	txtIdentificacion.setText("");
    	txtEmail.setText("");
    	txtTelefono.setText("");

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.columnNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
		this.columnIdentificacion.setCellValueFactory(new PropertyValueFactory("identificacion"));
		this.columnEmail.setCellValueFactory(new PropertyValueFactory("email"));
		refrescarTabla();

	}
	private void refrescarTabla() {
    	this.tablaClientes.getItems().clear();
		this.tablaClientes.setItems(singleton.obtenerListaClientes());
	}



}
