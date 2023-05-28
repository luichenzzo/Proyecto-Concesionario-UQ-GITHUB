package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializacionClientes {

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        // Obtener los datos de las clientes desde la consola
        obtenerDatosclientes(clientes);

        try {
            FileOutputStream fileOut = new FileOutputStream("cliente.ser"); // Nombre del archivo donde se guardará el objeto
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            for (Cliente cliente : clientes) {
                out.writeObject(cliente); // Serializa cada objeto cliente
            }

            out.close();
            fileOut.close();
            System.out.println("Las clientes se han serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //cambiar los metodos de consola por los datos ingresados por interfaz
    private static void obtenerDatosclientes(List<Cliente> clientes) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Ingrese los datos de una cliente:");
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

            Cliente cliente = new Cliente(nombre, edad, identificacion, email, telefono);
            clientes.add(cliente);

            System.out.print("¿Desea ingresar otra cliente? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        scanner.close();
    }
}
