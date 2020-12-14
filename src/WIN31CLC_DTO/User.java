package WIN31CLC_DTO;

import java.util.Objects;

public class User {

    private long id;
    private String username;
    private String password;
    private String role;
    private boolean status;

    public User() {
    }

    public User(long id, String username, String password, String role, boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public User(String Username, String Role) {
        this.username = Username;
        this.role = Role;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 17 * hash + Objects.hashCode(this.username);
        hash = 17 * hash + Objects.hashCode(this.password);
        hash = 17 * hash + Objects.hashCode(this.role);
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
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password="
                + password + ", role=" + role + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

}
