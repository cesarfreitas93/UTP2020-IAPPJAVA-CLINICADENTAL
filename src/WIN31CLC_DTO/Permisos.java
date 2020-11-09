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
public class Permisos {

    private long id;
    private String name;
    private long window_id;
    private long user_id;

    public Permisos() {
    }

    public Permisos(long id, String name, long window_id, long user_id) {
        this.id = id;
        this.name = name;
        this.window_id = window_id;
        this.user_id = user_id;
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

    public long getWindow_id() {
        return window_id;
    }

    public void setWindow_id(long window_id) {
        this.window_id = window_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Permisos{" + "id=" + id + ", name=" + name + ", window_id=" + window_id + ", user_id=" + user_id + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + (int) (this.window_id ^ (this.window_id >>> 32));
        hash = 41 * hash + (int) (this.user_id ^ (this.user_id >>> 32));
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
        final Permisos other = (Permisos) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.window_id != other.window_id) {
            return false;
        }
        if (this.user_id != other.user_id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}
