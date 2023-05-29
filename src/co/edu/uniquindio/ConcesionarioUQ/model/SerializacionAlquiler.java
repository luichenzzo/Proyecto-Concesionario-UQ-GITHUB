package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;

public class SerializacionAlquiler {
	// reemplazar por datos de interfaz, cambiar inicializaciones
   public static void main(String[] args) {
	  Cliente cliente = new Cliente("NombreCliente", "EdadCliente", "IdentificacionCliente", "EmailCliente", "TelefonoCliente");
      Empleado empleado = new Empleado("nombreEmpleado", "edadEmpleado", "idenficacion", "E-mail", "Telefono");
      ArrayList<DetalleOperacion> listaDetalles = new ArrayList<DetalleOperacion>();
      Hibrido hibrido = new Hibrido(false, true);
      Vehiculo vehiculo = new Vehiculo ("mazda", false, 2015, 7, 315, 990, "jhiu12", "rutaImagen", TipoTransmision.MANUAL, hibrido);
      Vehiculo vehiculo2 = new Vehiculo ("toyota", false, 2018, 6, 385, 880, "iu12", "rutaImagen", TipoTransmision.MANUAL, hibrido);
      listaDetalles.add(new DetalleOperacion(297.5, vehiculo ));
      listaDetalles.add(new DetalleOperacion(837.2, vehiculo2));
      // el numero es el total, reemplazar por valor interfaz, el 17 son los dias de alquiler, ultimo dato es le valor del dia
      OperacionAlquiler operacionAlquiler = new OperacionAlquiler("Fecha", "CodigoOperacion", 100000.0, listaDetalles, empleado, cliente, 17, 18923.00); // Crea una instancia del objeto OperacionVenta

      try {
         FileOutputStream fileOut = new FileOutputStream("operacionAlquiler.ser"); // Nombre del archivo donde se guardará el objeto
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(operacionAlquiler); // Serializa el objeto OperacionVenta
         out.close();
         fileOut.close();
         System.out.println("El objeto OperacionAlquiler se ha serializado correctamente.");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
