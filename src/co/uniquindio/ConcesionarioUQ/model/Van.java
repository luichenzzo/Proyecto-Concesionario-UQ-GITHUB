package co.uniquindio.ConcesionarioUQ.model;

public class Van extends SafeFamily{

	private Integer capacidadMaletero;

	public Van(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Integer capacidadMaletero) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, numeroPasajeros, numeroPuertas,
				bolsasAire, aireAcondicionado, camaraReversa, frenoABS);
		this.capacidadMaletero = capacidadMaletero;
	}

	public Integer getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(Integer capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}



}
