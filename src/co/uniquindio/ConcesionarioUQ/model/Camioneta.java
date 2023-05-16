package co.uniquindio.ConcesionarioUQ.model;

public class Camioneta extends Sedan{

	private boolean is4x4;

	public Camioneta(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Integer capacidadMaletero,
			boolean velocidadCrucero, boolean sensoresColision, boolean sensorTraficoCrucero, boolean permanenciaCarril,
			boolean is4x4) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, numeroPasajeros, numeroPuertas,
				bolsasAire, aireAcondicionado, camaraReversa, frenoABS, capacidadMaletero, velocidadCrucero,
				sensoresColision, sensorTraficoCrucero, permanenciaCarril);
		this.is4x4 = is4x4;
	}

	public boolean isIs4x4() {
		return is4x4;
	}

	public void setIs4x4(boolean is4x4) {
		this.is4x4 = is4x4;
	}


}
