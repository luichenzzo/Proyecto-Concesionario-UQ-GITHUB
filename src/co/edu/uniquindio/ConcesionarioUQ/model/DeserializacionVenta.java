package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;

public class DeserializacionVenta {

    public static void main(String[] args) {
        List<OperacionVenta> ventas = obtenerVentasSerializados();

        // Utiliza los datos de las ventas deserializados
        for (OperacionVenta venta : ventas) {
            System.out.println("fecha: " + venta.getFecha());
            System.out.println("codigo operacion: " + venta.getCodigoOperacion());
            System.out.println("Total: " + venta.getTotal());
            System.out.println("detalles Operacion:");
            List<DetalleOperacion> detalles = venta.getListaDetalles();
            if (detalles.isEmpty()) {
                System.out.println("  No hay detalles disponibles.");
            } else {
                for (DetalleOperacion detalle : detalles) {
                    System.out.println("  - " + detalle);
                }
            }
            System.out.println("Empleado: " + venta.getEmpleado());
            System.out.println("Cliente: " + venta.getCliente());
            System.out.println("--------------------");
        }
    }

    private static List<OperacionVenta> obtenerVentasSerializados() {
        List<OperacionVenta> ventas = new ArrayList<>();

        try {
            FileInputStream fileIn = new FileInputStream("operacionVenta.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            OperacionVenta venta;

            while (true) {
                try {
                    venta = (OperacionVenta) in.readObject();
                    ventas.add(venta);
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

        return ventas;
    }
}
