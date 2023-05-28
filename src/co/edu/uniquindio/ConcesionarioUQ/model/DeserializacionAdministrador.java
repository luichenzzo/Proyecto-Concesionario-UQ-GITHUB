package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeserializacionAdministrador {

    public static void main(String[] args) {
        List<Administrador> administradores = obtenerAdminitradoresSerializados();

        // Utiliza los datos de los administradores deserializados, cambiar por tablas en interfaz
        for (Administrador administrador : administradores) {
            System.out.println("Nombre: " + administrador.getNombre());
            System.out.println("Edad: " + administrador.getEdad());
            System.out.println("Identificación: " + administrador.getIdentificacion());
            System.out.println("Email: " + administrador.getEmail());
            System.out.println("Teléfono: " + administrador.getTelefono());
            System.out.println("--------------------");
        }
    }
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
