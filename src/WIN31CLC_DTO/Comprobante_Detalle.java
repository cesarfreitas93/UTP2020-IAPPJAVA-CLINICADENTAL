/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN31CLC_DTO;

import java.util.Objects;

/**
 *
 * @author Carlos Jimenez Gomez
 */
public class Comprobante_Detalle {

    private long id;
    private String descripcion;
    private double precio;
    private double igv;
    private double total;
    private long comprantes_id;

    public Comprobante_Detalle() {
    }

    public Comprobante_Detalle(long id, String descripcion, double precio, double igv, double total, long comprantes_id) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.igv = igv;
        this.total = total;
        this.comprantes_id = comprantes_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public long getComprantes_id() {
        return comprantes_id;
    }

    public void setComprantes_id(long comprantes_id) {
        this.comprantes_id = comprantes_id;
    }

    @Override
    public String toString() {
        return "Comprobante_Detalle{" + "id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", igv=" + igv + ", total=" + total + ", comprantes_id=" + comprantes_id + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 83 * hash + Objects.hashCode(this.descripcion);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.igv) ^ (Double.doubleToLongBits(this.igv) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        hash = 83 * hash + (int) (this.comprantes_id ^ (this.comprantes_id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comprobante_Detalle other = (Comprobante_Detalle) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (Double.doubleToLongBits(this.igv) != Double.doubleToLongBits(other.igv)) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (this.comprantes_id != other.comprantes_id) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }

}
