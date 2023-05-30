package co.edu.uniquindio.ConcesionarioUQ.model;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializacionProveedor {

    public static void SerializarProveedores(List<Proveedor> proveedores) {

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
}