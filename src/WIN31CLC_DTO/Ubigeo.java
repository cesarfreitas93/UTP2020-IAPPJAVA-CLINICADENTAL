
package WIN31CLC_DTO;

import java.util.Objects;

public class Ubigeo {
private String codigo_ubigeo;
private String codigo_departamento;
private String codigo_provincia;
private String codigo_distrito;
private String descripcion_departamento;
private String descripcion_provincia;
private String descripcion_distrito;
private boolean habilitado;
private String descripcion_departamento_macro;
private String descripcion_provincia_macro;
private String descripcion_distrito_macro;

    public Ubigeo() {
    }

    public Ubigeo(String codigo_ubigeo, String codigo_departamento, String codigo_provincia,
            String codigo_distrito, String descripcion_departamento, String descripcion_provincia,
            String descripcion_distrito, boolean habilitado, String descripcion_departamento_macro, 
            String descripcion_provincia_macro, String descripcion_distrito_macro) {
        this.codigo_ubigeo = codigo_ubigeo;
        this.codigo_departamento = codigo_departamento;
        this.codigo_provincia = codigo_provincia;
        this.codigo_distrito = codigo_distrito;
        this.descripcion_departamento = descripcion_departamento;
        this.descripcion_provincia = descripcion_provincia;
        this.descripcion_distrito = descripcion_distrito;
        this.habilitado = habilitado;
        this.descripcion_departamento_macro = descripcion_departamento_macro;
        this.descripcion_provincia_macro = descripcion_provincia_macro;
        this.descripcion_distrito_macro = descripcion_distrito_macro;
    }

    public String getCodigo_ubigeo() {
        return codigo_ubigeo;
    }

    public void setCodigo_ubigeo(String codigo_ubigeo) {
        this.codigo_ubigeo = codigo_ubigeo;
    }

    public String getCodigo_departamento() {
        return codigo_departamento;
    }

    public void setCodigo_departamento(String codigo_departamento) {
        this.codigo_departamento = codigo_departamento;
    }

    public String getCodigo_provincia() {
        return codigo_provincia;
    }

    public void setCodigo_provincia(String codigo_provincia) {
        this.codigo_provincia = codigo_provincia;
    }

    public String getCodigo_distrito() {
        return codigo_distrito;
    }

    public void setCodigo_distrito(String codigo_distrito) {
        this.codigo_distrito = codigo_distrito;
    }

    public String getDescripcion_departamento() {
        return descripcion_departamento;
    }

    public void setDescripcion_departamento(String descripcion_departamento) {
        this.descripcion_departamento = descripcion_departamento;
    }

    public String getDescripcion_provincia() {
        return descripcion_provincia;
    }

    public void setDescripcion_provincia(String descripcion_provincia) {
        this.descripcion_provincia = descripcion_provincia;
    }

    public String getDescripcion_distrito() {
        return descripcion_distrito;
    }

    public void setDescripcion_distrito(String descripcion_distrito) {
        this.descripcion_distrito = descripcion_distrito;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getDescripcion_departamento_macro() {
        return descripcion_departamento_macro;
    }

    public void setDescripcion_departamento_macro(String descripcion_departamento_macro) {
        this.descripcion_departamento_macro = descripcion_departamento_macro;
    }

    public String getDescripcion_provincia_macro() {
        return descripcion_provincia_macro;
    }

    public void setDescripcion_provincia_macro(String descripcion_provincia_macro) {
        this.descripcion_provincia_macro = descripcion_provincia_macro;
    }

    public String getDescripcion_distrito_macro() {
        return descripcion_distrito_macro;
    }

    public void setDescripcion_distrito_macro(String descripcion_distrito_macro) {
        this.descripcion_distrito_macro = descripcion_distrito_macro;
    }

    @Override
    public String toString() {
        return "Ubigeo{" + "codigo_ubigeo=" + codigo_ubigeo + ", codigo_departamento=" + 
                codigo_departamento + ", codigo_provincia=" + codigo_provincia + ", "
                + "codigo_distrito=" + codigo_distrito + ", descripcion_departamento=" +
                descripcion_departamento + ", descripcion_provincia=" + descripcion_provincia + 
                ", descripcion_distrito=" + descripcion_distrito + ", habilitado=" + habilitado
                + ", descripcion_departamento_macro=" + descripcion_departamento_macro + ", "
                + "descripcion_provincia_macro=" + descripcion_provincia_macro + ", "
                + "descripcion_distrito_macro=" + descripcion_distrito_macro + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.codigo_ubigeo);
        hash = 31 * hash + Objects.hashCode(this.codigo_departamento);
        hash = 31 * hash + Objects.hashCode(this.codigo_provincia);
        hash = 31 * hash + Objects.hashCode(this.codigo_distrito);
        hash = 31 * hash + Objects.hashCode(this.descripcion_departamento);
        hash = 31 * hash + Objects.hashCode(this.descripcion_provincia);
        hash = 31 * hash + Objects.hashCode(this.descripcion_distrito);
        hash = 31 * hash + (this.habilitado ? 1 : 0);
        hash = 31 * hash + Objects.hashCode(this.descripcion_departamento_macro);
        hash = 31 * hash + Objects.hashCode(this.descripcion_provincia_macro);
        hash = 31 * hash + Objects.hashCode(this.descripcion_distrito_macro);
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
        final Ubigeo other = (Ubigeo) obj;
        if (this.habilitado != other.habilitado) {
            return false;
        }
        if (!Objects.equals(this.codigo_ubigeo, other.codigo_ubigeo)) {
            return false;
        }
        if (!Objects.equals(this.codigo_departamento, other.codigo_departamento)) {
            return false;
        }
        if (!Objects.equals(this.codigo_provincia, other.codigo_provincia)) {
            return false;
        }
        if (!Objects.equals(this.codigo_distrito, other.codigo_distrito)) {
            return false;
        }
        if (!Objects.equals(this.descripcion_departamento, other.descripcion_departamento)) {
            return false;
        }
        if (!Objects.equals(this.descripcion_provincia, other.descripcion_provincia)) {
            return false;
        }
        if (!Objects.equals(this.descripcion_distrito, other.descripcion_distrito)) {
            return false;
        }
        if (!Objects.equals(this.descripcion_departamento_macro, other.descripcion_departamento_macro)) {
            return false;
        }
        if (!Objects.equals(this.descripcion_provincia_macro, other.descripcion_provincia_macro)) {
            return false;
        }
        if (!Objects.equals(this.descripcion_distrito_macro, other.descripcion_distrito_macro)) {
            return false;
        }
        return true;
    }


    
    
   }
