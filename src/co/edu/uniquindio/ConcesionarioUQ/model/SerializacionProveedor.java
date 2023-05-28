package co.edu.uniquindio.ConcesionarioUQ.model;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializacionProveedor {

    public static void main(String[] args) {
        List<Proveedor> proveedores = new ArrayList<>();

        // Obtener los datos de los proveedores desde la interfaz
        obtenerDatosProveedor(proveedores);

        try {
            FileOutputStream fileOut = new FileOutputStream("proveedor.ser"); // Nombre del archivo donde se guardará el objeto
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            for (Proveedor proveedor : proveedores) {
                out.writeObject(proveedor); // Serializa cada objeto proveedor
            }

            out.close();
            fileOut.close();
            System.out.println("Los proveedores se han serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // cambiar entrada de datos por textos de la interfaz
    private static void obtenerDatosProveedor(List<Proveedor> proveedores) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Ingrese los datos de un proveedor:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            String edad = scanner.nextLine();
            System.out.print("Identificación: ");
            String identificacion = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

            Proveedor proveedor = new Proveedor(nombre, edad, identificacion, email, telefono);
            proveedores.add(proveedor);

            System.out.print("¿Desea ingresar otro proveedor? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        scanner.close();
    }
}
