package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;

public class SerializacionVehiculo {
	// reemplazar por datos de interfaz
   public static void main(String[] args) {
	  // creacion vehiculo boolean es el estado
	  Hibrido hibrido = new Hibrido(false, true);
	  Vehiculo vehiculo = new Vehiculo("MarcaVehiculo", true, 2022, 7, 350, 870, "PlacaVehiculo", "RutaImagen", TipoTransmision.AUTOMATICA, hibrido);
      try {
         FileOutputStream fileOut = new FileOutputStream("Vehiculo.ser"); // Nombre del archivo donde se guardará el objeto
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(vehiculo); // Serializa el objeto vehiculo
         out.close();
         fileOut.close();
         System.out.println("El objeto vehiculo se ha serializado correctamente.");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
