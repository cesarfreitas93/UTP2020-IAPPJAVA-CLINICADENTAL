/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN31CLC_DTO;

/**
 *
 * @author Cesar
 */
public class ComprobanteReporte {
 private int id;
 private String Numero;
 private String serie;
 private String Ruc;
 private String fecha;
 private String dni;
 private String CLiente;
 private String email;
 private String phone;
 private String address;
    private int total;
    private int totalpages;
    
    public ComprobanteReporte() {
    }

        public int getTotal() {
        return total;
    }

    public int getTotalpages() {
        return totalpages;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotalpages(int totalpages) {
        this.totalpages = totalpages;
    }

    public int getId() {
        return id;
    }

    public String getNumero() {
        return Numero;
    }

    public String getSerie() {
        return serie;
    }

    public String getRuc() {
        return Ruc;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDni() {
        return dni;
    }

    public String getCLiente() {
        return CLiente;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCLiente(String CLiente) {
        this.CLiente = CLiente;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
 
 
}
