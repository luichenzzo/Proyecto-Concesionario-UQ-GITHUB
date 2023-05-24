package co.edu.uniquindio.ConcesionarioUQ.model;

public class Bus  extends Van{

	private Integer cantidadEjes;
	private Integer cantidadSalidasEmergencias;

	public Bus(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Integer capacidadMaletero,
			Integer cantidadEjes, Integer cantidadSalidasEmergencias) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, rutaImagen, tipoTransmision,
				tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS,
				capacidadMaletero);
		this.cantidadEjes = cantidadEjes;
		this.cantidadSalidasEmergencias = cantidadSalidasEmergencias;
	}

	public Bus(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Integer capacidadMaletero) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, rutaImagen, tipoTransmision,
				tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS,
				capacidadMaletero);
	}

	public Integer getCantidadEjes() {
		return cantidadEjes;
	}

	public void setCantidadEjes(Integer cantidadEjes) {
		this.cantidadEjes = cantidadEjes;
	}

	public Integer getCantidadSalidasEmergencias() {
		return cantidadSalidasEmergencias;
	}

	public void setCantidadSalidasEmergencias(Integer cantidadSalidasEmergencias) {
		this.cantidadSalidasEmergencias = cantidadSalidasEmergencias;
	}

}
