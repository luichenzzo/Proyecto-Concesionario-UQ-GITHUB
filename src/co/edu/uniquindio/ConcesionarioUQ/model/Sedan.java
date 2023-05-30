package co.edu.uniquindio.ConcesionarioUQ.model;

public class Sedan  extends Van{

	private boolean velocidadCrucero;
	private boolean sensoresColision;
	private boolean sensorTraficoCruzado;
	private boolean permanenciaCarril;

	public Sedan(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Integer capacidadMaletero,
			boolean velocidadCrucero, boolean sensoresColision, boolean sensorTraficoCruzado,
			boolean permanenciaCarril, Double precio) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, rutaImagen, tipoTransmision,
				tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, camaraReversa, frenoABS,
				capacidadMaletero, precio);
		this.velocidadCrucero = velocidadCrucero;
		this.sensoresColision = sensoresColision;
		this.sensorTraficoCruzado = sensorTraficoCruzado;
		this.permanenciaCarril = permanenciaCarril;
	}

	public Sedan() {
		super();
	}

	public boolean isVelocidadCrucero() {
		return velocidadCrucero;
	}

	public void setVelocidadCrucero(boolean velocidadCrucero) {
		this.velocidadCrucero = velocidadCrucero;
	}

	public boolean isSensoresColision() {
		return sensoresColision;
	}

	public void setSensoresColision(boolean sensoresColision) {
		this.sensoresColision = sensoresColision;
	}

	public boolean isSensorTraficoCruzado() {
		return sensorTraficoCruzado;
	}

	public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
		this.sensorTraficoCruzado = sensorTraficoCruzado;
	}

	public boolean isPermanenciaCarril() {
		return permanenciaCarril;
	}

	public void setPermanenciaCarril(boolean permanenciaCarril) {
		this.permanenciaCarril = permanenciaCarril;
	}

}
