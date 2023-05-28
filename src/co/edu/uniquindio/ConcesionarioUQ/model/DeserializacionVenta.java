package co.edu.uniquindio.ConcesionarioUQ.model;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeserializacionVenta {

    public static void main(String[] args) {
        List<OperacionVenta> ventas = obtenerVentasSerializados();

        // Utiliza los datos de las ventas deserializados
        for (OperacionVenta venta : ventas) {
            System.out.println("fecha: " + venta.getFecha());
            System.out.println("codigo operacion: " + venta.getCodigoOperacion());
            System.out.println("Total: " + venta.getTotal());
            System.out.println("detalles Operacion: " + venta.getListaDetalles());
            System.out.println("Empleado: " + venta.getEmpleado());
            System.out.println("Cliente: " + venta.getCliente());
            System.out.println("--------------------");
        }
    }

    private static List<OperacionVenta> obtenerVentasSerializados() {
        List<OperacionVenta> ventas = new ArrayList<>();

        try {
            FileInputStream fileIn = new FileInputStream("operacionVenta.ser"); // Nombre del archivo donde se guardó el objeto
            ObjectInputStream in = new ObjectInputStream(fileIn);
            OperacionVenta venta;
            while ((venta = (OperacionVenta) in.readObject()) != null) {
                ventas.add(venta);
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
