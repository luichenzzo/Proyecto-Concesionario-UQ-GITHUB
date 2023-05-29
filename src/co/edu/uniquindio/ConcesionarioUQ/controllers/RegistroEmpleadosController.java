package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ConcesionarioUQ.aplication.Aplicacion;
import co.edu.uniquindio.ConcesionarioUQ.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class RegistroEmpleadosController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Empleado> TablaEmpleados;

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
    private TextField txtContraseña;

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

	private Aplicacion aplicacion;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.columnNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
		this.columnIdentificacion.setCellValueFactory(new PropertyValueFactory("identificacion"));
		this.columnEmail.setCellValueFactory(new PropertyValueFactory("email"));
		refrescarTabla();

	}

    @FXML
	void actualizar(ActionEvent event) {

		Empleado empleado = this.TablaEmpleados.getSelectionModel().getSelectedItem();

		if (empleado == null) {
			singleton.crearAlerta("Error", "Selección item", "seleccione un empleado", AlertType.ERROR);
		} else {
			String nombre = txtNombre.getText();
			int edad = Integer.parseInt(txtEdad.getText());
			String identificacion = txtIdentificacion.getText();
			String email = txtEmail.getText();
			String telefono = txtTelefono.getText();
			String contraseña = txtContraseña.getText();
			if (singleton.verificarCamposLlenos(txtNombre,txtEdad,txtIdentificacion, txtEmail, txtTelefono, txtContraseña)) {
				try {

					Empleado empleadoaux = new Empleado(nombre, edad, identificacion, email, telefono, null,
							contraseña);
					if (singleton.contarEmpleadoIdentificacionIgual(empleado) == 1) {

						empleado.setNombre(empleadoaux.getNombre());
						empleado.setEdad(empleadoaux.getEdad());
						empleado.setIdentificacion(empleadoaux.getIdentificacion());
						empleado.setEmail(empleadoaux.getEmail());
						empleado.setTelefono(empleadoaux.getTelefono());
						empleado.setContraseña(empleadoaux.getContraseña());

						refrescarTabla();
					} else {
						singleton.crearAlerta("Error empleado", null, "empleado ya registrado", AlertType.ERROR);

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

    @FXML
    void agregar(ActionEvent event) {

		String nombre = txtNombre.getText();
		Integer edad = Integer.parseInt(txtEdad.getText());
		String identificacion = txtIdentificacion.getText();
		String email = txtEmail.getText();
		String telefono = txtTelefono.getText();
		String contraseña = txtContraseña.getText();

		if (singleton.verificarCamposLlenos(txtNombre,txtEdad,txtIdentificacion, txtEmail, txtTelefono, txtContraseña)) {

			try {

				Empleado empleado = new Empleado(nombre, edad, identificacion, email, telefono, null, contraseña);

				if (!singleton.getConcesionario().getListaEmpleado().contains(empleado)) {
					singleton.agregarEmpleado(empleado);
					this.TablaEmpleados.setItems(singleton.obtenerListaEmpleados());
				} else {
					singleton.crearAlerta("Error empleado", null, "empleado ya registrado", AlertType.ERROR);

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

    	Empleado empleado = this.TablaEmpleados.getSelectionModel().getSelectedItem();

    	if (empleado == null){
    		singleton.crearAlerta("Error","Selección item","seleccione un empleado", AlertType.ERROR);
    	}else{
    		singleton.getConcesionario().getListaEmpleado().remove(empleado);
    		refrescarTabla();
    	}

    }

    private void refrescarTabla() {
    	this.TablaEmpleados.getItems().clear();
		this.TablaEmpleados.setItems(singleton.obtenerListaEmpleados());
	}

	@FXML
    void seleccionar(MouseEvent event) {
    	Empleado empleado = this.TablaEmpleados.getSelectionModel().getSelectedItem();

    	if(empleado != null){
    		txtNombre.setText(empleado.getNombre());
    		txtEdad.setText(empleado.getEdad()+"");
    		txtIdentificacion.setText(empleado.getIdentificacion());
    		txtEmail.setText(empleado.getEmail());
    		txtTelefono.setText(empleado.getTelefono());
    		txtContraseña.setText(empleado.getContraseña());

    	}

    }

    @FXML
    void vaciarCampos(ActionEvent event) {
    	txtNombre.setText("");
    	txtEdad.setText("");
    	txtIdentificacion.setText("");
    	txtEmail.setText("");
    	txtTelefono.setText("");
    	txtContraseña.setText("");

    }

}