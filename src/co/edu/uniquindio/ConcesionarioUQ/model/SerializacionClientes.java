package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializacionClientes {

    public static void SerializarClientes(List<Cliente> clientes) {

        try {
            FileOutputStream fileOut = new FileOutputStream("cliente.ser"); // Nombre del archivo donde se guardará el objeto
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            for (Cliente cliente : clientes) {
                out.writeObject(cliente); // Serializa cada objeto cliente
            }

            out.close();
            fileOut.close();
            System.out.println("Los clientes se han serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
