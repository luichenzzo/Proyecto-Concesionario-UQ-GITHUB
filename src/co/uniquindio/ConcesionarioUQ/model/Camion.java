package co.uniquindio.ConcesionarioUQ.model;

public class Camion extends Vehiculo {
	private boolean aireAcondicionado;
	private boolean frenosABS;
	private Integer numeroEjes;
	private boolean frenoAire;
	private String tipoCamion;


	public Camion(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, boolean aireAcondicionado, boolean frenosABS, Integer numeroEjes,
			boolean frenoAire, String tipoCamion) {
		super(marca, nuevo, modelo, cantidadCambios, velocidadMáxima, cilindraje, placa);
		this.aireAcondicionado = aireAcondicionado;
		this.frenosABS = frenosABS;
		this.numeroEjes = numeroEjes;
		this.frenoAire = frenoAire;
		this.tipoCamion = tipoCamion;
	}


	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}


	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}


	public boolean isFrenosABS() {
		return frenosABS;
	}


	public void setFrenosABS(boolean frenosABS) {
		this.frenosABS = frenosABS;
	}


	public Integer getNumeroEjes() {
		return numeroEjes;
	}


	public void setNumeroEjes(Integer numeroEjes) {
		this.numeroEjes = numeroEjes;
	}


	public boolean isFrenoAire() {
		return frenoAire;
	}


	public void setFrenoAire(boolean frenoAire) {
		this.frenoAire = frenoAire;
	}


	public String getTipoCamion() {
		return tipoCamion;
	}


	public void setTipoCamion(String tipoCamion) {
		this.tipoCamion = tipoCamion;
	}



}
