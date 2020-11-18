
package WIN31CLC_DTO;

import java.util.Objects;

public class Empresa {

    private long id;
    private String name;
    private String address;
    private String ruc;
    private String ubigeo;
    private String phone;
    private String email;
    private String logo;

    public Empresa() {
    }

    public Empresa(long id, String name, String address, String ruc, String ubigeo,
            String phone, String email, String logo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ruc = ruc;
        this.ubigeo = ubigeo;
        this.phone = phone;
        this.email = email;
        this.logo = logo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", name=" + name + ", address=" + address 
                + ", ruc=" + ruc + ", ubigeo=" + ubigeo + ", phone=" + phone + ", email=" +
                email + ", logo=" + logo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.address);
        hash = 97 * hash + Objects.hashCode(this.ruc);
        hash = 97 * hash + Objects.hashCode(this.ubigeo);
        hash = 97 * hash + Objects.hashCode(this.phone);
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.logo);
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
        final Empresa other = (Empresa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.ruc, other.ruc)) {
            return false;
        }
        if (!Objects.equals(this.ubigeo, other.ubigeo)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.logo, other.logo)) {
            return false;
        }
        return true;
    }

}
