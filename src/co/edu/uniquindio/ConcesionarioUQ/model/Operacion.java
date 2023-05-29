package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Operacion implements Serializable {

    private String fecha;
    private String codigoOperacion;
    private Double total;
    private Empleado empleado;
    private List<DetalleOperacion> listaDetalles;

    public Operacion(String fecha, String codigoOperacion, Double total, List<DetalleOperacion> listaDetalles,
            Empleado empleado) {
        this.fecha = fecha;
        this.codigoOperacion = codigoOperacion;
        this.total = total;
        this.listaDetalles = listaDetalles;
        this.empleado = empleado;
    }

    public Operacion() {
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

    public List<DetalleOperacion> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(List<DetalleOperacion> listaDetalles) {
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
        return "Operacion [fecha=" + fecha + ", codigoOperacion=" + codigoOperacion + ", total=" + total + ", empleado="
                + empleado + ", listaDetalles=" + listaDetalles + "]";
    }
}
