package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeserializacionVehiculo {

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = obtenerVehiculosSerializados();

        // Utiliza los datos de los vehiculos deserializados, cambiar por tablas en interfaz
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Es nuevo: " + vehiculo.getNuevo());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Cantidad cambios: " + vehiculo.getCantidadCambios());
            System.out.println("Velocidad maxima: " + vehiculo.getVelocidadMáxima());
            System.out.println("Cilindraje: " + vehiculo.getCilindraje());
            System.out.println("Placa: " + vehiculo.getPlaca());
            System.out.println("RutaImagen: " + vehiculo.getRutaImagen());
            System.out.println("Transmision: " + vehiculo.getTipoTransmision());
            System.out.println("Tipo combustible: " + vehiculo.getTipoCombustible());
            System.out.println("--------------------");
        }
    }
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
