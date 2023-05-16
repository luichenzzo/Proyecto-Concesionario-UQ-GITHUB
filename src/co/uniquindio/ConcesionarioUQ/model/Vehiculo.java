package co.uniquindio.ConcesionarioUQ.model;

public class Vehiculo {
	private String marca;
	private boolean nuevo;
	private Integer modelo;
	private Integer cantidadCambios;
	private Integer velocidadMáxima;
	private Integer cilindraje;
	private String placa;
	private TipoTransmision tipoTransmision;


	public Vehiculo(String marca, boolean nuevo, Integer modelo, Integer cantidadCambios, Integer velocidadMáxima,
			Integer cilindraje, String placa) {
		super();
		this.marca = marca;
		this.nuevo = nuevo;
		this.modelo = modelo;
		this.cantidadCambios = cantidadCambios;
		this.velocidadMáxima = velocidadMáxima;
		this.cilindraje = cilindraje;
		this.placa = placa;
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


	public boolean isNuevo() {
		return nuevo;
	}


	public void setNuevo(boolean nuevo) {
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
		return velocidadMáxima;
	}


	public void setVelocidadMáxima(Integer velocidadMáxima) {
		this.velocidadMáxima = velocidadMáxima;
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


}
