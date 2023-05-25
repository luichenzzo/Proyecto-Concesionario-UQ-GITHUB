package co.edu.uniquindio.ConcesionarioUQ.model;

public class Camioneta extends Sedan{

	private boolean is4x4;

	public Camioneta(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Integer capacidadMaletero,
			boolean velocidadCrucero, boolean sensoresColision, boolean sensorTraficoCruzado, boolean permanenciaCarril,
			boolean is4x4) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, rutaImagen, tipoTransmision,
				tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS,
				capacidadMaletero, velocidadCrucero, sensoresColision, sensorTraficoCruzado, permanenciaCarril);
		this.is4x4 = is4x4;
	}

	public Camioneta(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Integer capacidadMaletero,
			boolean velocidadCrucero, boolean sensoresColision, boolean sensorTraficoCruzado,
			boolean permanenciaCarril) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, rutaImagen, tipoTransmision,
				tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS,
				capacidadMaletero, velocidadCrucero, sensoresColision, sensorTraficoCruzado, permanenciaCarril);
	}

	public boolean isIs4x4() {
		return is4x4;
	}

	public void setIs4x4(boolean is4x4) {
		this.is4x4 = is4x4;
	}
}
