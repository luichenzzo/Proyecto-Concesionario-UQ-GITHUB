package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.Serializable;

public class Electrico extends TipoCombustible implements Serializable{

	private Integer autonomia;
	private Integer tiempoCarga;

	public Electrico(Integer autonomia, Integer tiempoCarga) {
		super();
		this.autonomia = autonomia;
		this.tiempoCarga = tiempoCarga;
	}

	public Electrico() {
		super();
	}

	public Integer getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Integer autonomia) {
		this.autonomia = autonomia;
	}

	public Integer getTiempoCarga() {
		return tiempoCarga;
	}

	public void setTiempoCarga(Integer tiempoCarga) {
		this.tiempoCarga = tiempoCarga;
	}
}
