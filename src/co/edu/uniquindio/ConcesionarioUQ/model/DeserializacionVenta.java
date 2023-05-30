package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;

public class DeserializacionVenta {


    private static List<OperacionVenta> obtenerVentasSerializados(List<OperacionVenta> ventas) {

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
