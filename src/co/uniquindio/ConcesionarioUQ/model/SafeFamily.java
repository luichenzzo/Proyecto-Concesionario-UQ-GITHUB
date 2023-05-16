package co.uniquindio.ConcesionarioUQ.model;

public abstract class SafeFamily extends Automovil {

	private boolean aireAcondicionado;
	private boolean camaraReversa;
	private boolean frenoABS;


	public SafeFamily(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, numeroPasajeros, numeroPuertas,
				bolsasAire);
		this.aireAcondicionado = aireAcondicionado;
		this.camaraReversa = camaraReversa;
		this.frenoABS = frenoABS;
	}


	public SafeFamily(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, numeroPasajeros, numeroPuertas,
				bolsasAire);
	}


	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}


	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}


	public boolean isCamaraReversa() {
		return camaraReversa;
	}


	public void setCamaraReversa(boolean camaraReversa) {
		this.camaraReversa = camaraReversa;
	}


	public boolean isFrenoABS() {
		return frenoABS;
	}


	public void setFrenoABS(boolean frenoABS) {
		this.frenoABS = frenoABS;
	}





}
