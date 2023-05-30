package co.edu.uniquindio.ConcesionarioUQ.model;

public class Deportivo extends Automovil {

	private Integer caballosFuerzas;
	private Integer tiempo100kmh;

	public Deportivo(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			Integer caballosFuerzas, Integer tiempo100kmh, Double precio) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, rutaImagen, tipoTransmision,
				tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, precio);
		this.caballosFuerzas = caballosFuerzas;
		this.tiempo100kmh = tiempo100kmh;
	}

	public Deportivo() {
		super();
	}

	public Integer getCaballosFuerzas() {
		return caballosFuerzas;
	}

	public void setCaballosFuerzas(Integer caballosFuerzas) {
		this.caballosFuerzas = caballosFuerzas;
	}

	public Integer getTiempo100kmh() {
		return tiempo100kmh;
	}

	public void setTiempo100kmh(Integer tiempo100kmh) {
		this.tiempo100kmh = tiempo100kmh;
	}
}
