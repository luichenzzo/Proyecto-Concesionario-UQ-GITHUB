package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;

public class OperacionAlquiler extends Operacion{

	private Cliente cliente;
	private Integer diasAlquiler;
	private Double valordia;

	public OperacionAlquiler(String fecha, String codigoOperacion, Double total,
			ArrayList<DetalleOperaion> listaDetalles, Empleado empleado, Cliente cliente, Integer diasAlquiler,
			Double valordia) {
		super(fecha, codigoOperacion, total, listaDetalles, empleado);
		this.cliente = cliente;
		this.diasAlquiler = diasAlquiler;
		this.valordia = valordia;
	}

	public OperacionAlquiler(String fecha, String codigoOperacion, Double total,
			ArrayList<DetalleOperaion> listaDetalles, Empleado empleado) {
		super(fecha, codigoOperacion, total, listaDetalles, empleado);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getDiasAlquiler() {
		return diasAlquiler;
	}

	public void setDiasAlquiler(Integer diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}

	public Double getValordia() {
		return valordia;
	}

	public void setValordia(Double valordia) {
		this.valordia = valordia;
	}
}
