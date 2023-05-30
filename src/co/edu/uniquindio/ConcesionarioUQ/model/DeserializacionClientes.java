package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeserializacionClientes {
    	/**
    	 * este metodo lee la lista de clientes
    	 * @return
    	 */
    private static List<Cliente> obtenerClientesSerializados() {
    	List<Cliente> clientes = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("Cliente.ser"); // Nombre del archivo donde se guardó el objeto
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Cliente cliente;
            while ((cliente = (Cliente) in.readObject()) != null) {
                clientes.add(cliente);
            }
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return clientes;
    }
}