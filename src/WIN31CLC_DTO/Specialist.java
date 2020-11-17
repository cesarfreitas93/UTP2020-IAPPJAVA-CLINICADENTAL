
package WIN31CLC_DTO;

import java.util.Date;
import java.util.Objects;

public class Specialist {
private long id;
private String name;
private String lastname;
private String surename;
private String phone;
private String address;
private String dni;
private boolean enable;
private Date createAt;
private Date updateAt;
private long services_id;

    public Specialist() {
    }

    public Specialist(String name, String lastname, String surename, String phone, 
            String address, String dni, boolean enable, long services_id) {
        this.name = name;
        this.lastname = lastname;
        this.surename = surename;
        this.phone = phone;
        this.address = address;
        this.dni = dni;
        this.enable = enable;
        this.services_id = services_id;
    }

    public long getId() {
        return id;
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

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getDni() {
        return dni;
    }

    public boolean isEnable() {
        return enable;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public long getServices_id() {
        return services_id;
    }

    public void setId(long id) {
        this.id = id;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public void setServices_id(long services_id) {
        this.services_id = services_id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.lastname);
        hash = 97 * hash + Objects.hashCode(this.surename);
        hash = 97 * hash + Objects.hashCode(this.phone);
        hash = 97 * hash + Objects.hashCode(this.address);
        hash = 97 * hash + Objects.hashCode(this.dni);
        hash = 97 * hash + (this.enable ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.createAt);
        hash = 97 * hash + Objects.hashCode(this.updateAt);
        hash = 97 * hash + (int) (this.services_id ^ (this.services_id >>> 32));
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
        final Specialist other = (Specialist) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.enable != other.enable) {
            return false;
        }
        if (this.services_id != other.services_id) {
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
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
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
    public String toString() {
        return "Specialist{" + "id=" + id + ", name=" + name + ", lastname=" + lastname + 
                ", surename=" + surename + ", phone=" + phone + ", address=" + address + ","
                + " dni=" + dni + ", enable=" + enable + ", createAt=" + createAt + ", updateAt="
                + updateAt + ", services_id=" + services_id + '}';
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
