/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN31CLC_DTO;

import java.util.Objects;

/**
 *
 * @author Cesar
 */
public class CitasPatient {
    private int id;
    private String fechaCita;
    private String horaInicio;
    private String horaFin;
    private String servicio;
    private double precio;
    private String specialista;
    private boolean selected;

    public boolean isSelected() {
        return selected;
    }
    public CitasPatient() {
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    
    
    public int getId() {
        return id;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public String getServicio() {
        return servicio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getSpecialista() {
        return specialista;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSpecialista(String specialista) {
        this.specialista = specialista;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.fechaCita);
        hash = 89 * hash + Objects.hashCode(this.horaInicio);
        hash = 89 * hash + Objects.hashCode(this.horaFin);
        hash = 89 * hash + Objects.hashCode(this.servicio);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.specialista);
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
        final CitasPatient other = (CitasPatient) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.fechaCita, other.fechaCita)) {
            return false;
        }
        if (!Objects.equals(this.horaInicio, other.horaInicio)) {
            return false;
        }
        if (!Objects.equals(this.horaFin, other.horaFin)) {
            return false;
        }
        if (!Objects.equals(this.servicio, other.servicio)) {
            return false;
        }
        if (!Objects.equals(this.specialista, other.specialista)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CitasPatient{" + "id=" + id + ", fechaCita=" + fechaCita + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", servicio=" + servicio + ", precio=" + precio + ", specialista=" + specialista + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
