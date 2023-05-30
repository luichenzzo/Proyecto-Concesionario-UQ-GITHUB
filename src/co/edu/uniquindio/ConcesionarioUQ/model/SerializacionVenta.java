package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class SerializacionVenta {
	// reemplazar por datos de interfaz
	   public static void SerializarVentas(List<OperacionVenta> ventas) {
	       try {
	           FileOutputStream fileOut = new FileOutputStream("operacionVenta.ser"); // Nombre del archivo donde se guardará el objeto
	           ObjectOutputStream out = new ObjectOutputStream(fileOut);

	           for (OperacionVenta venta : ventas) {
	               out.writeObject(venta); // Serializa cada objeto venta
	           }

	           out.close();
	           fileOut.close();
	           System.out.println("Las ventas se han serializado correctamente.");
	       } catch (IOException e) {
	           e.printStackTrace();
	       }
	   }
	}
