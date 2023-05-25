package co.edu.uniquindio.ConcesionarioUQ.controllers;

import co.edu.uniquindio.ConcesionarioUQ.model.Concesionario;

public class Singleton {

	/**
	 * se crea una referencia a ella misma, con la finalidad de poder ser utilizada sin necesidad
	 * de tener un objeto de esta clase.
	 */
	private static Singleton instancia = null;
	private Concesionario concesionario;

	/**
	 * El constructor se defien como privado para que ninguna otra clase pueda crear un obejto del Singleton
	 * ademas, se crea la instancia del modelo, es asi como el Singleton es la conexion directa con la clase
	 * Concesionario, y es la encargada de conectar los controladores con los metodos o servicios que se
	 * soliciten del modelo.
	 */
	private Singleton(){
		this.concesionario = new Concesionario();
	}

	/**
	 * el metodo obtenerInstancia se define como estatico, con la finalidad de obtener la instancia del
	 * Singleton sin la necesidad de tener un objeto de la misma.
	 * @return
	 */
	public static Singleton obtenerInstancia(){
		if (instancia == null){
			instancia = new Singleton();
		}
		return instancia;
	}



}
