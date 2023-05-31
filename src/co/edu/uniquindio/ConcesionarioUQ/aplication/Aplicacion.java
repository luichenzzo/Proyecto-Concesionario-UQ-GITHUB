package co.edu.uniquindio.ConcesionarioUQ.aplication;

import java.io.IOException;

import co.edu.uniquindio.ConcesionarioUQ.controllers.ComprarVehiculoController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.LoginController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.RegistroClientesController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.RegistroEmpleadosController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.RegistroProveedorController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.VenderVehiculoController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.VentanaDetallesVehiculoController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.VentanaPrincipalAdministradorController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.VentanaPrincipalEmpleadoController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.VentanaReporteOperacionesController;
import co.edu.uniquindio.ConcesionarioUQ.model.Administrador;
import co.edu.uniquindio.ConcesionarioUQ.model.Empleado;
import co.edu.uniquindio.ConcesionarioUQ.model.Vehiculo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Aplicacion extends Application {

	private Stage primaryStage;
	private Stage escenarioSecundario;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.escenarioSecundario = escenarioSecundario;
		mostrarVentanaPrincipal();

	}
	/**
	 * Metodo que es invocado para mostrar la ventana principal
	 */
	private void mostrarVentanaPrincipal()   {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/co/edu/uniquindio/ConcesionarioUQ/views/Login.fxml"));
			AnchorPane anchorPane = (AnchorPane) loader.load();
			LoginController x = loader.getController();
			x.setAplication(this);

			Scene scene = new Scene(anchorPane);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	 * Metodo que es invocado para mostrar la ventana principal del administrador
	 */
	public void mostrarVentanaAdministrador(){
		primaryStage.close();
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/co/edu/uniquindio/ConcesionarioUQ/views/VentanaPrincipalAdministrador.fxml"));
			AnchorPane anchorPane = (AnchorPane) loader.load();
			VentanaPrincipalAdministradorController x = loader.getController();
			x.setAplication(this);

			Scene scene = new Scene(anchorPane);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	/**
	 * Metodo que es invocado para mostrar la ventana que registra a los empleados
	 */
	public void abrirVentanaRegistroEmpleado(Pane panelVariable) {
		try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/ConcesionarioUQ/views/RegistroEmpleadosView.fxml"));
            Parent root = loader.load();
            RegistroEmpleadosController x = loader.getController();

            AnchorPane paneEnBlanco = new AnchorPane();
            paneEnBlanco.getChildren().add(root);
            /**
             * la linea 45 se encarga de limpiar el panel varible, para que el panel que se vaya a cargar
             * no se vaya a mostrar sobre otro que posiblemente ya se habia cargado
             */
            panelVariable.getChildren().clear();

            panelVariable.getChildren().add(paneEnBlanco);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	/**
	 * Metodo que es invocado para devolver a la ventana principal
	 */
	public void volverVentanaPrincipal() {

		primaryStage.close();
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/co/edu/uniquindio/ConcesionarioUQ/views/Login.fxml"));
			AnchorPane anchorPane = (AnchorPane) loader.load();
			LoginController x = loader.getController();
			x.setAplication(this);

			Scene scene = new Scene(anchorPane);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	 * Metodo que es invocado para mostrar la ventana principal de empleado
	 */
	public void mostrarVentanaEmpleado() {

		primaryStage.close();
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/co/edu/uniquindio/ConcesionarioUQ/views/VentanaPrincipalEmpleado.fxml"));
			AnchorPane anchorPane = (AnchorPane) loader.load();
			VentanaPrincipalEmpleadoController x = loader.getController();
			x.setAplication(this);

			Scene scene = new Scene(anchorPane);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	/**
	 * Metodo que es invocado para mostrar la ventana en donde se hace el registro de los clientes
	 */
	public void abrirVentanaRegistroCliente(Pane panelVariable) {
		try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/ConcesionarioUQ/views/RegistroClientesView.fxml"));
            Parent root = loader.load();
            RegistroClientesController x = loader.getController();

            AnchorPane paneEnBlanco = new AnchorPane();
            paneEnBlanco.getChildren().add(root);
            panelVariable.getChildren().clear();

            panelVariable.getChildren().add(paneEnBlanco);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

	/**
	 * Metodo que es invocado para mostrar la ventana en donde se puede registrar a los proveedores
	 */
	public void abrirVentanaRegistroProveedor(Pane panelVariable) {
		try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/ConcesionarioUQ/views/RegistroProveedorView.fxml"));
            Parent root = loader.load();
            RegistroProveedorController x = loader.getController();

            AnchorPane paneEnBlanco = new AnchorPane();
            paneEnBlanco.getChildren().add(root);
            panelVariable.getChildren().clear();

            panelVariable.getChildren().add(paneEnBlanco);
        } catch (IOException e) {
            e.printStackTrace();
        }


	}

	/**
	 * Metodo que es invocado para mostrar la ventana en donde se puede
	 * llenar el formulario para comprar un vehiculo
	 */
	public void abrirVentanaCompraVehiculo(Pane panelVariable) {

		try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/ConcesionarioUQ/views/ComprarVehiculoView.fxml"));
            Parent root = loader.load();
            ComprarVehiculoController x = loader.getController();

            AnchorPane paneEnBlanco = new AnchorPane();
            paneEnBlanco.getChildren().add(root);
            panelVariable.getChildren().clear();

            panelVariable.getChildren().add(paneEnBlanco);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

	/**
	 * Metodo que es invocado para mostrar la ventana en donde se venden los vehiculos
	 */
	public void abrirVentanaVenderVehiculo(Pane panelVariable) {

		try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/ConcesionarioUQ/views/VenderVehiculoView.fxml"));
            Parent root = loader.load();
            VenderVehiculoController x = loader.getController();

            AnchorPane paneEnBlanco = new AnchorPane();
            paneEnBlanco.getChildren().add(root);
            panelVariable.getChildren().clear();

            panelVariable.getChildren().add(paneEnBlanco);
        } catch (IOException e) {
            e.printStackTrace();
        }


	}

	/**
	 * Metodo que es invocado para mostrar la ventana donde se muestran las especificaciones del vehiculo
	 * seleccionado
	 */
	public void abrirVentanaDetallesVehiculo(Vehiculo vehiculo) {
		escenarioSecundario.close();
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/co/edu/uniquindio/ConcesionarioUQ/views/VentanaDetallesVehiculo.fxml"));
			AnchorPane anchorPane = (AnchorPane) loader.load();
			VentanaDetallesVehiculoController x = loader.getController();
			x.setVehiculo(vehiculo);
			x.setAplication(this);

			Scene scene = new Scene(anchorPane);
			escenarioSecundario.setScene(scene);
			escenarioSecundario.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo que es invocado para mostrar la ventana con los reportes de ventas
	 */
	public void abrirVentanaReporte(Pane panelVariable) {
		try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/ConcesionarioUQ/views/VentanaReporteOperaciones.fxml"));
            Parent root = loader.load();
            VentanaReporteOperacionesController x = loader.getController();

            AnchorPane paneEnBlanco = new AnchorPane();
            paneEnBlanco.getChildren().add(root);

            panelVariable.getChildren().clear();

            panelVariable.getChildren().add(paneEnBlanco);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
