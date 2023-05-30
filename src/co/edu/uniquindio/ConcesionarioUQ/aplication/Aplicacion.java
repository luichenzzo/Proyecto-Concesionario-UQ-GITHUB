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
}
