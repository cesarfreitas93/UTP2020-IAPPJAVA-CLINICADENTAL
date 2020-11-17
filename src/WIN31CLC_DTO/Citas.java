/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN31CLC_DTO;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Cesar
 */
public class Citas {
 private long id;
 private Date createAt;
 private int status;
 private long patient_id;
 private long service_id;
 private long especialista_id;
 private Date fechadecita;

 private Patient patient;
 private Specialist specialist;
 private Service service;
 
    public Citas() {
        
    }

    public Citas(long id, int status, long patient_id, long service_id, long especialista_id, Date fechadecita) {
        this.id = id;
        this.status = status;
        this.patient_id = patient_id;
        this.service_id = service_id;
        this.especialista_id = especialista_id;
        this.fechadecita = fechadecita;
    }

    public Citas(long id, Date createAt, int status, long patient_id, long especialista_id) {
        this.id = id;
        this.createAt = createAt;
        this.status = status;
        this.patient_id = patient_id;
        this.especialista_id = especialista_id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    
    
    public long getId() {
        return id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setPatient_id(long patient_id) {
        this.patient_id = patient_id;
    }

    public void setEspecialista_id(long especialista_id) {
        this.especialista_id = especialista_id;
    }

    public int isStatus() {
        return status;
    }

    public long getPatient_id() {
        return patient_id;
    }

    public long getEspecialista_id() {
        return especialista_id;
    }

    public Date getFechadecita() {
        return fechadecita;
    }

    public void setFechadecita(Date fechadecita) {
        this.fechadecita = fechadecita;
    }

    public long getService_id() {
        return service_id;
    }

    public void setService_id(long service_id) {
        this.service_id = service_id;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.createAt);
        hash = 97 * hash + this.status;
        hash = 97 * hash + (int) (this.patient_id ^ (this.patient_id >>> 32));
        hash = 97 * hash + (int) (this.especialista_id ^ (this.especialista_id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.fechadecita);
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
        final Citas other = (Citas) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (this.patient_id != other.patient_id) {
            return false;
        }
        if (this.especialista_id != other.especialista_id) {
            return false;
        }
        if (!Objects.equals(this.createAt, other.createAt)) {
            return false;
        }
        if (!Objects.equals(this.fechadecita, other.fechadecita)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Citas{" + "id=" + id + ", createAt=" + createAt + ", status=" + status + ", patient_id=" + patient_id + ", especialista_id=" + especialista_id + ", fechadecita=" + fechadecita + '}';
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
