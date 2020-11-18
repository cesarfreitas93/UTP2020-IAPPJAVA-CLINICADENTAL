
package WIN31CLC_DTO;

import java.util.Objects;

public class Comprobante {

    private long id;
    private String numero;
    private String serie;
    private String fechaEmision;
    private long citas_id;

    public Comprobante() {
    }

    public Comprobante(long id, String numero, String serie, String fechaEmision, 
            long citas_id) {
        this.id = id;
        this.numero = numero;
        this.serie = serie;
        this.fechaEmision = fechaEmision;
        this.citas_id = citas_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public long getCitas_id() {
        return citas_id;
    }

    public void setCitas_id(long citas_id) {
        this.citas_id = citas_id;
    }

    @Override
    public String toString() {
        return "Comprobante{" + "id=" + id + ", numero=" + numero + ", serie=" + serie + ","
                + " fechaEmision=" + fechaEmision + ", citas_id=" + citas_id + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 79 * hash + Objects.hashCode(this.numero);
        hash = 79 * hash + Objects.hashCode(this.serie);
        hash = 79 * hash + Objects.hashCode(this.fechaEmision);
        hash = 79 * hash + (int) (this.citas_id ^ (this.citas_id >>> 32));
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
        final Comprobante other = (Comprobante) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.citas_id != other.citas_id) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.serie, other.serie)) {
            return false;
        }
        if (!Objects.equals(this.fechaEmision, other.fechaEmision)) {
            return false;
        }
        return true;
    }

}
