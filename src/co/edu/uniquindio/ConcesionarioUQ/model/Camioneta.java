package co.edu.uniquindio.ConcesionarioUQ.model;

public class Camioneta extends Sedan{

	private boolean is4x4;

	public Camioneta(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadM�xima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Integer capacidadMaletero,
			boolean velocidadCrucero, boolean sensoresColision, boolean sensorTraficoCruzado, boolean permanenciaCarril,
			boolean is4x4, Double precio) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadM�xima, cilindraje, placa, rutaImagen, tipoTransmision,
				tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS,
				capacidadMaletero, velocidadCrucero, sensoresColision, sensorTraficoCruzado, permanenciaCarril, precio);
		this.is4x4 = is4x4;
	}

	public Camioneta() {
		super();
	}

	public boolean isIs4x4() {
		return is4x4;
	}

	public void setIs4x4(boolean is4x4) {
		this.is4x4 = is4x4;
	}
}
