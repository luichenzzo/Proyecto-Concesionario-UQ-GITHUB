package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;

public class DeserializacionCompra {

    public static void main(String[] args) {
        List<OperacionCompra> compras = obtenerComprasSerializados();

        // Utiliza los datos de las compras deserializados
        for (OperacionCompra compra : compras) {
            System.out.println("fecha: " + compra.getFecha());
            System.out.println("codigo operacion: " + compra.getCodigoOperacion());
            System.out.println("Total: " + compra.getTotal());
            System.out.println("detalles Operacion:");
            List<DetalleOperacion> detalles = compra.getListaDetalles();
            if (detalles.isEmpty()) {
                System.out.println("  No hay detalles disponibles.");
            } else {
                for (DetalleOperacion detalle : detalles) {
                    System.out.println("  - " + detalle);
                }
            }
            System.out.println("Empleado: " + compra.getEmpleado());
            System.out.println("--------------------");
        }
    }

    private static List<OperacionCompra> obtenerComprasSerializados() {
        List<OperacionCompra> compras = new ArrayList<>();

        try {
            FileInputStream fileIn = new FileInputStream("operacionCompra.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            OperacionCompra compra;

            while (true) {
                try {
                    compra = (OperacionCompra) in.readObject();
                    compras.add(compra);
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

        return compras;
    }
}

