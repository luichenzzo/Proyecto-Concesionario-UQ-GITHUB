package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializacionAdministrador {

    public static void main(String[] args) {
        List<Administrador> administradores = new ArrayList<>();

        // Obtener los datos de los administradores desde la interfaz
        obtenerDatosAdministrador(administradores);

        try {
            FileOutputStream fileOut = new FileOutputStream("administrador.ser"); // Nombre del archivo donde se guardará el objeto
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            for (Administrador administrador : administradores) {
                out.writeObject(administrador); // Serializa cada objeto administrador
            }

            out.close();
            fileOut.close();
            System.out.println("Las Administradores se han serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // cambiar entrada de datos por textos de la interfaz
    private static void obtenerDatosAdministrador(List<Administrador> administradores) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Ingrese los datos de un administrador:");
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

            Administrador administrador = new Administrador(nombre, edad, identificacion, email, telefono);
            administradores.add(administrador);

            System.out.print("¿Desea ingresar otra administrador? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        scanner.close();
    }
}
