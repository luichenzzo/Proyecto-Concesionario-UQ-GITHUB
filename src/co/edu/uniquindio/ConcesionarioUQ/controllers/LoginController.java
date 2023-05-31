package co.edu.uniquindio.ConcesionarioUQ.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import co.edu.uniquindio.ConcesionarioUQ.aplication.Aplicacion;
import co.edu.uniquindio.ConcesionarioUQ.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCambiarContraseña;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private TextField txtUsuario;

	private Aplicacion aplicacion;

	private Singleton singleton = Singleton.obtenerInstancia();

	/**
	 * Metodo que se encarga de preguntarle la identificacion al usuario que olvidó su contraseña
	 * @param event el boton de cambiar contraseña
	 */
    @FXML
    void cambiarContraseña(ActionEvent event) {
    	String doc = JOptionPane.showInputDialog("Por favor Ingrese su cedula");
    	Empleado empleado = singleton.obtenerEmpleadoIngreso(doc);
    	String codigo = singleton.forgotPassword(empleado.getEmail());
    	String input = JOptionPane.showInputDialog("Por favor ingrese el código enviado a su correo");
    	if (input.equalsIgnoreCase(codigo)){
    		singleton.crearAlerta("Verificacion Completada", "Verificacion Completada", "Verificacion Completada", AlertType.CONFIRMATION);
    		String newPassword = JOptionPane.showInputDialog("Ingrese su nueva contraseña");
    		singleton.cambiarContraseña(empleado, newPassword);
    	}
    	else{
    		singleton.crearAlerta("Verificacion Fallida", "Verificacion Fallida", "Verificacion Fallida", AlertType.WARNING);
    	}
    }

    /**
     * metodo que busca la cedula que el usuario ingresó para confirmar si el usuario si existe en la base de datos
     * para asi dejarlo pasar a la ventana principal
     * @param event
     */
	@FXML
	void iniciarSesion(ActionEvent event) {
		System.out.println("SEXO");
		if (singleton.verificarCamposLlenos(txtContraseña, txtUsuario)) {

			String identificacion = txtUsuario.getText();
			String contraseña = txtContraseña.getText();

			if (singleton.verificarCredencialesAdminidtrador(identificacion, contraseña)) {
				aplicacion.mostrarVentanaAdministrador();
				singleton.crearAlerta("Información", "Ingreso Administrador", "Ingreso Exitoso",AlertType.INFORMATION);
			}else{
				if (singleton.verificarCredenciales(identificacion, contraseña)) {
					Empleado empleado = singleton.obtenerEmpleadoIngreso(identificacion);
					aplicacion.mostrarVentanaEmpleado();
					VentanaPrincipalEmpleadoController.setEmpleadoEnSesion(empleado);
					/**
					 * el controlador de la ventana principal del empleado, debe
					 * tener un atributo Empleado empleadoIngreso, con sus
					 * metodos set y get, a la hora de abrir la ventana
					 * siguiente, osea la del empleado, debo enviarle el
					 * empleado de ingreso por medio del set. En un principio se
					 * lo paso al metodo que abre la ventana en aplicacion y
					 * desde ese metodo en aplicacion debo hacer el set que
					 * corresponde a la instacia de ese controlador.
					 */
					singleton.crearAlerta("Información", "Ingreso Empleado", "Ingreso Exitoso", AlertType.INFORMATION);
				}else{
					if (singleton.EmpleadoExistente(identificacion)){
						singleton.crearAlerta("Error", "Contraseña Incorrecta","Verifique su contraseña, si no la recuerda oprima recuperar contraseña",
						AlertType.ERROR);
					}else{
						singleton.crearAlerta("Error", null, "Empleado no registrado", AlertType.ERROR);
					}
				}
			}

		} else {
			singleton.crearAlerta("Error Formato","Campos en blanco","ingrese toda la información solicitada",AlertType.ERROR);
    	}

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public void setAplication(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;

	}

}
