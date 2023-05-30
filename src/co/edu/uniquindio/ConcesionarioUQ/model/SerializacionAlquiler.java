package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class SerializacionAlquiler {
	// reemplazar por datos de interfaz, cambiar inicializaciones
   public static void SerializarOperacionAlquiler(List<OperacionAlquiler> operacionAlquiler) {
       try {
           FileOutputStream fileOut = new FileOutputStream("operacionAlquiler.ser"); // Nombre del archivo donde se guardará el objeto
           ObjectOutputStream out = new ObjectOutputStream(fileOut);

           for (OperacionAlquiler operacion : operacionAlquiler) {
               out.writeObject(operacion); // Serializa cada objeto operacionAlquiler
           }

           out.close();
           fileOut.close();
           System.out.println("Las Administradores se han serializado correctamente.");
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
