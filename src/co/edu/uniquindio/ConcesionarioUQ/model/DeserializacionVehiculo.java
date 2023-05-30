package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeserializacionVehiculo {

    	/**
    	 * este metodo lee la lista de vehiculos
    	 * @return
    	 */
    private static List<Vehiculo> obtenerVehiculosSerializados() {
    	List<Vehiculo> vehiculos = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("Vehiculo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Vehiculo vehiculo;

            while (true) {
                try {
                    vehiculo = (Vehiculo) in.readObject();
                    vehiculos.add(vehiculo);
                } catch (EOFException e) {
                    break; // Salir del bucle al alcanzar el final del archivo
                }
            }

            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return vehiculos;
    }
}
