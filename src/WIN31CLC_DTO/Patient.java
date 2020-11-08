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
public class Patient {
  private long id;
  private String dni;
  private String name;
  private String lastname;
  private String surename;
  private Date createAt;
  private Date updateAt;
  private boolean enable;
  private String phone;
  private String email;
  private String address;
  private String ubigeo; 

    public Patient() {
    }

    public Patient(String dni, String name, String lastname, String surename) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.surename = surename;
    }
    
  
    public Patient(String dni, String name, String lastname, String surename, Date createAt, Date updateAt, boolean enable, String phone, String email, String address, String ubigeo) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.surename = surename;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.enable = enable;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.ubigeo = ubigeo;
    }

    public long getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSurename() {
        return surename;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public boolean isEnable() {
        return enable;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", dni=" + dni + ", name=" + name + ", lastname=" + lastname + ", surename=" + surename + ", createAt=" + createAt + ", updateAt=" + updateAt + ", enable=" + enable + ", phone=" + phone + ", email=" + email + ", address=" + address + ", ubigeo=" + ubigeo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 53 * hash + Objects.hashCode(this.dni);
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.lastname);
        hash = 53 * hash + Objects.hashCode(this.surename);
        hash = 53 * hash + Objects.hashCode(this.createAt);
        hash = 53 * hash + Objects.hashCode(this.updateAt);
        hash = 53 * hash + (this.enable ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.phone);
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + Objects.hashCode(this.address);
        hash = 53 * hash + Objects.hashCode(this.ubigeo);
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
        final Patient other = (Patient) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.enable != other.enable) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.surename, other.surename)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.ubigeo, other.ubigeo)) {
            return false;
        }
        if (!Objects.equals(this.createAt, other.createAt)) {
            return false;
        }
        if (!Objects.equals(this.updateAt, other.updateAt)) {
            return false;
        }
        return true;
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
