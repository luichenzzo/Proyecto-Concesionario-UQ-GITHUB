package co.edu.uniquindio.ConcesionarioUQ.model;

public class Vehiculo {
	private String marca;
	private Boolean nuevo;
	private Integer modelo;
	private Integer cantidadCambios;
	private Integer velocidadM�xima;
	private Integer cilindraje;
	private String placa;
	private String rutaImagen;
	private TipoTransmision tipoTransmision;
	private TipoCombustible tipoCombustible;

	public Vehiculo(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadM�xima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible) {
		super();
		this.marca = marca;
		this.nuevo = nuevo;
		this.modelo = modelo;
		this.cantidadCambios = cantidadCambios;
		this.velocidadM�xima = velocidadM�xima;
		this.cilindraje = cilindraje;
		this.placa = placa;
		this.rutaImagen = rutaImagen;
		this.tipoTransmision = tipoTransmision;
		this.tipoCombustible = tipoCombustible;
	}

	public Vehiculo() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Boolean getNuevo() {
		return nuevo;
	}

	public void setNuevo(Boolean nuevo) {
		this.nuevo = nuevo;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public Integer getCantidadCambios() {
		return cantidadCambios;
	}

	public void setCantidadCambios(Integer cantidadCambios) {
		this.cantidadCambios = cantidadCambios;
	}

	public Integer getVelocidadM�xima() {
		return velocidadM�xima;
	}

	public void setVelocidadM�xima(Integer velocidadM�xima) {
		this.velocidadM�xima = velocidadM�xima;
	}

	public Integer getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public TipoTransmision getTipoTransmision() {
		return tipoTransmision;
	}

	public void setTipoTransmision(TipoTransmision tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}

	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", nuevo=" + nuevo + ", modelo=" + modelo + ", cantidadCambios="
				+ cantidadCambios + ", velocidadM�xima=" + velocidadM�xima + ", cilindraje=" + cilindraje + ", placa="
				+ placa + ", rutaImagen=" + rutaImagen + ", tipoTransmision=" + tipoTransmision + "]";
	}
}
