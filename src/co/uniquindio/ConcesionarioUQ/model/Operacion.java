package co.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;

public class Operacion {
	private String fecha;
	private String codigoOperacion;
	private Double Total;



	private ArrayList <DetalleOperaion> listaDetalles;
	public Operacion(String fecha, String codigoOperacion, Double total, ArrayList<DetalleOperaion> listaDetalles) {
		super();
		this.fecha = fecha;
		this.codigoOperacion = codigoOperacion;
		Total = total;
		this.listaDetalles = listaDetalles;
	}
	public Operacion() {
		super();
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCodigoOperacion() {
		return codigoOperacion;
	}
	public void setCodigoOperacion(String codigoOperacion) {
		this.codigoOperacion = codigoOperacion;
	}
	public Double getTotal() {
		return Total;
	}
	public void setTotal(Double total) {
		Total = total;
	}
	public ArrayList<DetalleOperaion> getListaDetalles() {
		return listaDetalles;
	}
	public void setListaDetalles(ArrayList<DetalleOperaion> listaDetalles) {
		this.listaDetalles = listaDetalles;
	}



}
