package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializacionAdministrador {

    public static void SerializarAdministradores (List<Administrador> administradores) {

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
}
