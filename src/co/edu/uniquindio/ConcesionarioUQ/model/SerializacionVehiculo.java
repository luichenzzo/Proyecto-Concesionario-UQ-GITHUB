package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class SerializacionVehiculo {
	// reemplazar por datos de interfaz
   public static void SerializarVehiculos(List<Vehiculo> listaVehiculos) {
       try {
           FileOutputStream fileOut = new FileOutputStream("Vehiculo.ser"); // Nombre del archivo donde se guardará el objeto
           ObjectOutputStream out = new ObjectOutputStream(fileOut);

           for (Vehiculo vehiculo : listaVehiculos) {
               out.writeObject(vehiculo); // Serializa cada objeto vehiculo
           }

           out.close();
           fileOut.close();
           System.out.println("Los vehiculos se han serializado correctamente.");
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
