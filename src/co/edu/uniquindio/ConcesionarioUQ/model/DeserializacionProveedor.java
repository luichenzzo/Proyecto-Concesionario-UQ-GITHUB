package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeserializacionProveedor {
    	/**
    	 * este metodo lee la lista de proveedores
    	 * @return
    	 */
    private static List<Proveedor> obtenerProveedoresSerializados() {
    	List<Proveedor> proveedores = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("proveedor.ser"); // Nombre del archivo donde se guardó el objeto
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Proveedor proveedor;
            while ((proveedor = (Proveedor) in.readObject()) != null) {
            	proveedores.add(proveedor);
            }
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return proveedores;
    }
}
