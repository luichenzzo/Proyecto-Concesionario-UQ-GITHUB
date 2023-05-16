package co.uniquindio.ConcesionarioUQ.model;

public class Sedan  extends Van{
	private boolean velocidadCrucero;
	private boolean sensoresColision;
	private boolean sensorTraficoCrucero;
	private boolean permanenciaCarril;



	public Sedan(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Integer capacidadMaletero,
			boolean velocidadCrucero, boolean sensoresColision, boolean sensorTraficoCrucero,
			boolean permanenciaCarril) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, numeroPasajeros, numeroPuertas,
				bolsasAire, aireAcondicionado, camaraReversa, frenoABS, capacidadMaletero);
		this.velocidadCrucero = velocidadCrucero;
		this.sensoresColision = sensoresColision;
		this.sensorTraficoCrucero = sensorTraficoCrucero;
		this.permanenciaCarril = permanenciaCarril;
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



	public boolean isSensorTraficoCrucero() {
		return sensorTraficoCrucero;
	}



	public void setSensorTraficoCrucero(boolean sensorTraficoCrucero) {
		this.sensorTraficoCrucero = sensorTraficoCrucero;
	}



	public boolean isPermanenciaCarril() {
		return permanenciaCarril;
	}



	public void setPermanenciaCarril(boolean permanenciaCarril) {
		this.permanenciaCarril = permanenciaCarril;
	}


}
