package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class SerializacionCompra {
	// reemplazar por datos de interfaz, cambiar inicializaciones
	   public static void SerializarCompras(List<OperacionCompra> compras) {
		   try {
	           FileOutputStream fileOut = new FileOutputStream("operacionCompra.ser"); // Nombre del archivo donde se guardará el objeto
	           ObjectOutputStream out = new ObjectOutputStream(fileOut);
	           for (OperacionCompra compra : compras) {
	               out.writeObject(compra); // Serializa cada objeto cliente
	           }
	           out.close();
	           fileOut.close();
	           System.out.println("Las compras se han serializado correctamente.");
		   } catch (IOException e) {
	           e.printStackTrace();
	       }
	   }
  }

