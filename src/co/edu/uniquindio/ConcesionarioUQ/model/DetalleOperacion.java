package co.edu.uniquindio.ConcesionarioUQ.model;

import java.io.Serializable;

public class DetalleOperacion implements Serializable {

    private Double subTotal;
    private Vehiculo vehiculo;

    public DetalleOperacion(Double subTotal, Vehiculo vehiculo) {
        super();
        this.subTotal = subTotal;
        this.vehiculo = vehiculo;
    }

    public DetalleOperacion() {
        super();
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((vehiculo == null) ? 0 : vehiculo.hashCode());
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
        DetalleOperacion other = (DetalleOperacion) obj;
        if (vehiculo == null) {
            if (other.vehiculo != null)
                return false;
        } else if (!vehiculo.equals(other.vehiculo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DetalleOperacion [subTotal=" + subTotal + ", vehiculo=" + vehiculo + "]";
    }

}
