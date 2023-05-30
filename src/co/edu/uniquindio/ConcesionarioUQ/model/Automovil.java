package co.edu.uniquindio.ConcesionarioUQ.model;

public abstract class Automovil extends Vehiculo {

	private Integer numeroPasajeros;
	private Integer numeroPuertas;
	private Integer bolsasAire;

	public Automovil(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire, Double precio) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, rutaImagen, tipoTransmision,
				tipoCombustible,precio);
		this.numeroPasajeros = numeroPasajeros;
		this.numeroPuertas = numeroPuertas;
		this.bolsasAire = bolsasAire;
	}

	public Automovil() {
		super();
	}

	public Integer getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(Integer numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public Integer getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(Integer numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public Integer getBolsasAire() {
		return bolsasAire;
	}

	public void setBolsasAire(Integer bolsasAire) {
		this.bolsasAire = bolsasAire;
	}

}
