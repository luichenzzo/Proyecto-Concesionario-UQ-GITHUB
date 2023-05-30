package co.edu.uniquindio.ConcesionarioUQ.application;

import java.io.IOException;


import co.edu.uniquindio.ConcesionarioUQ.controllers.VentanaRegistroVehiculoController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.VentanaReporteOperacionesController;
import co.edu.uniquindio.ConcesionarioUQ.controllers.VentanaRegistroOperacionesController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Aplicacion_3 extends Application {
    private Stage PrimaryStage;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.PrimaryStage = primaryStage;
        mostrarVentanaPrincipal();

    }
	private void mostrarVentanaPrincipal()   {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Aplicacion.class.getResource("/co/uniquindio/ConcesionarioUQ/views/VentanaReporteOperaciones.fxml"));
            AnchorPane anchorPane = (AnchorPane) loader.load();
            VentanaReporteOperacionesController loginController = loader.getController();
            loginController.setAplication(this);

            Scene scene = new Scene(anchorPane);
            PrimaryStage.setScene(scene);
            PrimaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public Stage getPrimaryStage() {
        return PrimaryStage;
    }
    public void setPrimaryStage(Stage primaryStage) {
        this.PrimaryStage = primaryStage;
    }

}
