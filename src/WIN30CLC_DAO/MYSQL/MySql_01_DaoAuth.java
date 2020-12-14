package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_01_Auth;
import WIN31CLC_DTO.User;
import WIN32CLC_TABLEMODELS.UserTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MySql_01_DaoAuth implements Dao_01_Auth {

    final String CHECKAUTH = "select username, role from user where "
            + "username = ? and password = ? and status = 1 ";
    final String INSERT = "INSERT INTO `user`(`username`,`password`,`role`,`status`)VALUES(?,?,?,?)";
    final String FINDALL = "SELECT `id`,`username`,`password`,`role`,`status` FROM `user` where status = 1";

    final String DELETE = "update user set  status = 0 where id = ?";
    final String FINDALL_BY_ID = "SELECT `id`,`username`,`password`,`role`,`status` FROM `user` where status = 1 and id = ?";
    final String UPDATE = "UPDATE `user` SET `username` = ?,`password` =?, `role` =? WHERE `id` = ?";
    private Connection conn;

    public MySql_01_DaoAuth(Connection conn) {
        this.conn = conn;
    }

    @Override
    public User Insert(User entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();
            pst = (PreparedStatement) conn.prepareStatement(INSERT, new String[]{"id"});
            pst.setString(1, entity.getUsername());
            pst.setString(2, entity.getPassword());
            pst.setString(3, entity.getRole());
            pst.setBoolean(4, entity.getStatus());

            if (pst.executeUpdate() == 0) {
                throw new DaoException("Puede que no se haya guardado.");
            }

            try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    entity.setId((int) generatedKeys.getLong(1));
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }

        } catch (SQLException ex) {
            throw new DaoException("Error en SQL", ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DaoException("Error en SQL", ex);
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    throw new DaoException("Error en SQL", ex);
                }
            }
        }
        return entity;
    }

    @Override
    public void rlUpdate(User entity) throws DaoException {
        PreparedStatement pst = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();

            pst = (PreparedStatement) conn.prepareStatement(UPDATE);
            pst.setString(1, entity.getUsername());
            pst.setString(2, entity.getPassword());
            pst.setString(3, entity.getRole());
            pst.setLong(4, entity.getId());

            if (pst.executeUpdate() == 0) {
                throw new DaoException("Puede que no se haya modificado.");
            }
        } catch (SQLException ex) {
            throw new DaoException("Error en SQL", ex);
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    throw new DaoException("Error en SQL", ex);
                }
            }
        }
    }

    @Override
    public void rlDelete(User entity) throws DaoException {
        com.mysql.jdbc.PreparedStatement pst = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();

            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(DELETE);
            // pst.setBoolean(1, entity.getStatus());
            pst.setLong(1, entity.getId());

            if (pst.executeUpdate() == 0) {
                throw new DaoException("Puede que no se haya eliminado.");
            }
        } catch (SQLException ex) {
            throw new DaoException("Error en SQL", ex);
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    throw new DaoException("Error en SQL", ex);
                }
            }
        }
    }

    private User Convert_FinAll(ResultSet rs) throws SQLException {
        User dto = new User();
        dto.setId(rs.getLong("id"));
        dto.setUsername(rs.getString("username"));
        dto.setPassword(rs.getString("password"));
        dto.setRole(rs.getString("role"));
        return dto;
    }

    @Override
    public List<User> findAll(int id) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<User> list = new ArrayList<User>();
        try {
            pst = (PreparedStatement) conn.prepareStatement(FINDALL);
            rs = pst.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
                list.add(Convert_FinAll(rs));
            }
        } catch (SQLException ex) {
            throw new DaoException("Error en SQL", ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DaoException("Error en SQL", ex);
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    new DaoException("Error en SQL", ex);
                }
            }
        }
        return list;
    }

    @Override
    public User findById(User entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        User dto = null;
        try {
            pst = (PreparedStatement) conn.prepareStatement(FINDALL_BY_ID);
            pst.setLong(1, entity.getId());
            rs = pst.executeQuery();
            if (rs.next()) {
                dto = Convert_FinAll(rs);
            } else {
                throw new DaoException("No se ha encontrado el registro");
            }
        } catch (SQLException ex) {
            throw new DaoException("Error en SQL", ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DaoException("Error en SQL", ex);
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    new DaoException("Error en SQL", ex);
                }
            }
        }
        return dto;
    }

    private User Convert_(ResultSet rs) throws SQLException {
        String Username = rs.getString("username");
        String Role = rs.getString("role");
        User dto = new User(Username, Role);
        return dto;
    }

    @Override
    public User ChekAuth(String username, String password) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        User dto = null;
        try {
            pst = (PreparedStatement) conn.prepareStatement(CHECKAUTH);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                dto = Convert_(rs);
            } else {
                dto = null;
                throw new DaoException("Credenciales Incorrectas!");
            }
        } catch (SQLException ex) {
            throw new DaoException("Error en SQL", ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DaoException("Error en SQL", ex);
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    new DaoException("Error en SQL", ex);
                }
            }
        }
        return dto;
    }

    @Override
    public void rlInsert(User entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private UserTableModel model;

    public AbstractTableModel ListUser() throws DaoException, SQLException {
        MySqlDaoManager man = new MySqlDaoManager();
        this.model = new UserTableModel(man.getDaoAuth());
        this.model.updateModel();
        this.model.fireTableDataChanged();
        return this.model;
    }

}
