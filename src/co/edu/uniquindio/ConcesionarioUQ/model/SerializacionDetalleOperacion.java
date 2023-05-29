package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Revisar
public class SerializacionDetalleOperacion{
	//instanciar detalle operacion
    public static void main(String[] args) {
    	Hibrido hibrido = new Hibrido(false, true);
    	Vehiculo vehiculo = new Vehiculo ("mazda", false, 2015, 7, 315, 990, "jhiu12", "rutaImagen", TipoTransmision.MANUAL, hibrido);
        List<DetalleOperacion> detallesOperacion = new ArrayList<DetalleOperacion>();
        detallesOperacion.add(new DetalleOperacion(297.5, vehiculo ));
        try {
            FileOutputStream fileOut = new FileOutputStream("DetalleOperacion.ser"); // Nombre del archivo donde se guardará el objeto
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            for (DetalleOperacion operacion : detallesOperacion) {
                out.writeObject(operacion); // Serializa cada objeto detalleOperacion
            }

            out.close();
            fileOut.close();
            System.out.println("Los detalles de la operacion se han serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
