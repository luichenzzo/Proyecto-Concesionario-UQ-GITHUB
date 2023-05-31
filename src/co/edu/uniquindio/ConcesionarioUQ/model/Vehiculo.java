package co.edu.uniquindio.ConcesionarioUQ.model;

public class Vehiculo {
	private String marca;
	private Boolean nuevo;
	private Integer modelo;
	private Integer cantidadCambios;
	private Integer velocidadMaxima;
	private Integer cilindraje;
	private String placa;
	private String rutaImagen;
	private TipoTransmision tipoTransmision;
	private TipoCombustible tipoCombustible;
	private Double precio;

	public Vehiculo(String marca, Boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa, String rutaImagen, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, double precio) {
		super();
		this.marca = marca;
		this.nuevo = nuevo;
		this.modelo = modelo;
		this.cantidadCambios = cantidadCambios;
		this.velocidadMaxima = velocidadMáxima;
		this.cilindraje = cilindraje;
		this.placa = placa;
		this.rutaImagen = rutaImagen;
		this.tipoTransmision = tipoTransmision;
		this.tipoCombustible = tipoCombustible;
		this.precio = precio;
	}


	public Vehiculo() {
		super();
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
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

	public Integer getVelocidadMáxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMáxima(Integer velocidadMáxima) {
		this.velocidadMaxima = velocidadMáxima;
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
				+ cantidadCambios + ", velocidadMáxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", placa="
				+ placa + ", rutaImagen=" + rutaImagen + ", tipoTransmision=" + tipoTransmision + "]";
	}
}
