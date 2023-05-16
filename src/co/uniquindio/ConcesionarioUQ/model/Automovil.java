package co.uniquindio.ConcesionarioUQ.model;

public abstract class Automovil extends Vehiculo {
	private Integer numeroPasajeros;
	private Integer numeroPuertas;
	private Integer bolsasAire;




	public Automovil(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa);
		this.numeroPasajeros = numeroPasajeros;
		this.numeroPuertas = numeroPuertas;
		this.bolsasAire = bolsasAire;
	}


	public Automovil(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa);
	}



}
