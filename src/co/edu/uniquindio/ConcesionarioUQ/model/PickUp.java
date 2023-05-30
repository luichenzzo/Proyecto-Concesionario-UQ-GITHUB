package co.edu.uniquindio.ConcesionarioUQ.model;

public class PickUp extends SafeFamily {

	private Integer capacidadCajaCarga;
	private boolean is4x4;


	public PickUp(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Integer capacidadCajaCarga,
			boolean is4x4, Double precio) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, rutaImagen, tipoTransmision,
				tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa,
				frenoABS, precio);
		this.capacidadCajaCarga = capacidadCajaCarga;
		this.is4x4 = is4x4;
	}

	public PickUp() {
		super();
	}

	public Integer getCapacidadCajaCarga() {
		return capacidadCajaCarga;
	}

	public void setCapacidadCajaCarga(Integer capacidadCajaCarga) {
		this.capacidadCajaCarga = capacidadCajaCarga;
	}

	public boolean isIs4x4() {
		return is4x4;
	}

	public void setIs4x4(boolean is4x4) {
		this.is4x4 = is4x4;
	}


}
