package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeserializacionAdministrador {
    	/**
    	 * este metodo lee la lista de administradores
    	 * @return
    	 */
    private static List<Administrador> obtenerAdminitradoresSerializados() {
    	List<Administrador> administradores = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("administrador.ser"); // Nombre del archivo donde se guardó el objeto
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Administrador administrador;
            while ((administrador = (Administrador) in.readObject()) != null) {
                administradores.add(administrador);
            }
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return administradores;
    }
}
