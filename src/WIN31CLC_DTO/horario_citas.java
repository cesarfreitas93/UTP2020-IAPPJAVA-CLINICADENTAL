/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN31CLC_DTO;

/**
 *
 * @author Carlos Jimenez Gomez
 */
public class horario_citas {
private int id_horario;
private String cita_horario_inicio;
private String  cita_horario_fin;
private boolean  habilitado;

    public horario_citas() {
    }

    public horario_citas(int id_horario, String cita_horario_inicio, String cita_horario_fin, boolean habilitado) {
        this.id_horario = id_horario;
        this.cita_horario_inicio = cita_horario_inicio;
        this.cita_horario_fin = cita_horario_fin;
        this.habilitado = habilitado;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getCita_horario_inicio() {
        return cita_horario_inicio;
    }

    public void setCita_horario_inicio(String cita_horario_inicio) {
        this.cita_horario_inicio = cita_horario_inicio;
    }

    public String getCita_horario_fin() {
        return cita_horario_fin;
    }

    public void setCita_horario_fin(String cita_horario_fin) {
        this.cita_horario_fin = cita_horario_fin;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }


}
