package co.edu.uniquindio.ConcesionarioUQ.model;

public abstract class SafeFamily extends Automovil {

	private boolean aireAcondicionado;
	private boolean camaraReversa;
	private boolean frenoABS;

	public SafeFamily(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, Integer numeroPasajeros, Integer numeroPuertas, Integer bolsasAire,
			boolean aireAcondicionado, boolean camaraReversa, boolean frenoABS, Double precio) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa, rutaImagen, tipoTransmision,
				tipoCombustible, numeroPasajeros, numeroPuertas, bolsasAire, precio);
		this.aireAcondicionado = aireAcondicionado;
		this.camaraReversa = camaraReversa;
		this.frenoABS = frenoABS;
	}

	public SafeFamily() {
		super();
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
