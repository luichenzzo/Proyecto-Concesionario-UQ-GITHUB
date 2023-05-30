package co.edu.uniquindio.ConcesionarioUQ.model;

import java.util.ArrayList;

public abstract class Operacion {

	private String fecha;
	private String codigoOperacion;
	private Double total;
	private Empleado empleado;
	private ArrayList <DetalleOperaion> listaDetalles;

	public Operacion(String fecha, String codigoOperacion, Double total, ArrayList<DetalleOperaion> listaDetalles, Empleado empleado) {
		super();
		this.fecha = fecha;
		this.codigoOperacion = codigoOperacion;
		this.total = total;
		this.listaDetalles = new ArrayList<>();
		this.empleado = empleado;
	}

	public Operacion() {
		super();
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
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
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public ArrayList<DetalleOperaion> getListaDetalles() {
		return listaDetalles;
	}
	public void setListaDetalles(ArrayList<DetalleOperaion> listaDetalles) {
		this.listaDetalles = listaDetalles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoOperacion == null) ? 0 : codigoOperacion.hashCode());
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
		Operacion other = (Operacion) obj;
		if (codigoOperacion == null) {
			if (other.codigoOperacion != null)
				return false;
		} else if (!codigoOperacion.equals(other.codigoOperacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[fecha=" + fecha + "\n codigoOperacion=" + codigoOperacion + "\n total=" + total + "\n empleado="
				+ empleado + "\n listaDetalles=" + listaDetalles.toString() + "]";
	}
}
