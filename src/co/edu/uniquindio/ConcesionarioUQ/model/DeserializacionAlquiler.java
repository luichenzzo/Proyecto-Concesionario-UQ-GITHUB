package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;

public class DeserializacionAlquiler {

    public static void main(String[] args) {
        List<OperacionAlquiler> alquileres = obtenerAlquilerSerializados();

        // Utiliza los datos de las alquileres deserializados, cambiar por datos interfaz
        for (OperacionAlquiler alquiler : alquileres) {
            System.out.println("fecha: " + alquiler.getFecha());
            System.out.println("codigo operacion: " + alquiler.getCodigoOperacion());
            System.out.println("Total: " + alquiler.getTotal());
            System.out.println("detalles Operacion:");
            List<DetalleOperacion> detalles = alquiler.getListaDetalles();
            if (detalles.isEmpty()) {
                System.out.println("  No hay detalles disponibles.");
            } else {
                for (DetalleOperacion detalle : detalles) {
                    System.out.println("  - " + detalle);
                }
            }
            System.out.println("Empleado: " + alquiler.getEmpleado());
            System.out.println("Cliente: " + alquiler.getCliente());
            System.out.println("dias alquiler: " + alquiler.getDiasAlquiler());
            System.out.println("valor dia: " + alquiler.getValordia());
            System.out.println("--------------------");
        }
    }

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
