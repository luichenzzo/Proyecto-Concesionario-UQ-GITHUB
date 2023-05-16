package co.uniquindio.ConcesionarioUQ.model;

public class Deportivo extends Automovil {

	private Integer caballosFuerzas;
	private Integer tiempo100kmh;


	public Deportivo(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			Integer caballosFuerzas, Integer tiempo100kmh) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, numeroPasajeros, numeroPuertas,
				bolsasAire);
		this.caballosFuerzas = caballosFuerzas;
		this.tiempo100kmh = tiempo100kmh;
	}


	public Deportivo(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, numeroPasajeros, numeroPuertas,
				bolsasAire);
	}



}
