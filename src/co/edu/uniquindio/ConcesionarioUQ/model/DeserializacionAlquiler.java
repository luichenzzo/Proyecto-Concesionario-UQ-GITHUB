package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;

public class DeserializacionAlquiler {


    private static List<OperacionAlquiler> obtenerAlquilerSerializados() {
    	List<OperacionAlquiler> alquileres = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("operacionAlquiler.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            OperacionAlquiler alquiler;

            while (true) {
                try {
                    alquiler = (OperacionAlquiler) in.readObject();
                    alquileres.add(alquiler);
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

        return alquileres;
    }
}
