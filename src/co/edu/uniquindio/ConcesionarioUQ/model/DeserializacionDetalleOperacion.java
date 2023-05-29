package co.edu.uniquindio.ConcesionarioUQ.model;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;

public class DeserializacionDetalleOperacion {

    public static void main(String[] args) {
        List<DetalleOperacion> detalleOperaciones = obtenerDetallesSerializados();

        // Utiliza los datos de las ventas deserializados
        for (DetalleOperacion operacion : detalleOperaciones) {
            System.out.println("subTotal: " + operacion.getSubTotal());
            System.out.println("vehiculo: " + operacion.getVehiculo());
        }
    }

    private static List<DetalleOperacion> obtenerDetallesSerializados() {
        List<DetalleOperacion> detalles = new ArrayList<>();

        try {
            FileInputStream fileIn = new FileInputStream("DetalleOperacion.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            DetalleOperacion detalle;

            while (true) {
                try {
                    detalle = (DetalleOperacion) in.readObject();
                    detalles.add(detalle);
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

        return detalles;
    }
}