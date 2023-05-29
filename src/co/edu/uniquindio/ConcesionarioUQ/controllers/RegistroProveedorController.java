package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.model.Empleado;
import co.edu.uniquindio.ConcesionarioUQ.model.Proveedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class RegistroProveedorController implements Initializable{

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
    private TableView<Proveedor> tablaProveedores;

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


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.columnNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
		this.columnIdentificacion.setCellValueFactory(new PropertyValueFactory("identificacion"));
		this.columnEmail.setCellValueFactory(new PropertyValueFactory("email"));
		refrescarTabla();

	}

    @FXML
    void actualizar(ActionEvent event) {
		Proveedor proveedor = this.tablaProveedores.getSelectionModel().getSelectedItem();

		if (proveedor == null) {
			singleton.crearAlerta("Error", "Selección item", "seleccione un proveedor", AlertType.ERROR);
		} else {
			String nombre = txtNombre.getText();
			int edad = Integer.parseInt(txtEdad.getText());
			String identificacion = txtIdentificacion.getText();
			String email = txtEmail.getText();
			String telefono = txtTelefono.getText();
			if (singleton.verificarCamposLlenos(txtNombre,txtEdad,txtIdentificacion, txtEmail, txtTelefono)) {
				try {

					Proveedor proveedorAux = new Proveedor(nombre, edad, identificacion, email, telefono,null);
					if (singleton.contarProveedoresIdentificacionIgual(proveedor) == 1) {

						proveedor.setNombre(proveedorAux.getNombre());
						proveedor.setEdad(proveedorAux.getEdad());
						proveedor.setIdentificacion(proveedorAux.getIdentificacion());
						proveedor.setEmail(proveedorAux.getEmail());
						proveedor.setTelefono(proveedorAux.getTelefono());

						refrescarTabla();
					} else {
						singleton.crearAlerta("Error empleado", null, "proveedor ya registrado", AlertType.ERROR);

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

    private void refrescarTabla() {
    	this.tablaProveedores.getItems().clear();
		this.tablaProveedores.setItems(singleton.obtenerListaProveedores());
	}

	@FXML
    void agregar(ActionEvent event) {

		String nombre = txtNombre.getText();
		Integer edad = Integer.parseInt(txtEdad.getText());
		String identificacion = txtIdentificacion.getText();
		String email = txtEmail.getText();
		String telefono = txtTelefono.getText();

		if (singleton.verificarCamposLlenos(txtNombre,txtEdad,txtIdentificacion, txtEmail, txtTelefono)) {

			try {

				Proveedor proveedor = new Proveedor(nombre, edad, identificacion, email, telefono, null);

				if (!singleton.getConcesionario().getListaProveedores().contains(proveedor)) {
					singleton.agregarProveedor(proveedor);
					System.out.println("proveedor cargado");
					this.tablaProveedores.setItems(singleton.obtenerListaProveedores());
				} else {
					singleton.crearAlerta("Error proveedor", null, "proveedor ya registrado", AlertType.ERROR);

				}
			} catch (NumberFormatException e) {
				singleton.crearAlerta("Error Formato", null, "verifique que la edad sea un número", AlertType.ERROR);
			}
		}else{
			singleton.crearAlerta("Error Formato","Campos en blanco","ingrese toda la información solicitada",AlertType.ERROR);
		}

    }

    @FXML
    void eliminar(ActionEvent event) {

    	Proveedor proveedor = this.tablaProveedores.getSelectionModel().getSelectedItem();

    	if (proveedor == null){
    		singleton.crearAlerta("Error","Selección item","seleccione un proveedor", AlertType.ERROR);
    	}else{
    		singleton.getConcesionario().getListaProveedores().remove(proveedor);
    		refrescarTabla();
    	}

    }

    @FXML
    void seleccionar(MouseEvent event) {
    	Proveedor proveedor = this.tablaProveedores.getSelectionModel().getSelectedItem();

    	if(proveedor != null){
    		txtNombre.setText(proveedor.getNombre());
    		txtEdad.setText(proveedor.getEdad()+"");
    		txtIdentificacion.setText(proveedor.getIdentificacion());
    		txtEmail.setText(proveedor.getEmail());
    		txtTelefono.setText(proveedor.getTelefono());
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

}
