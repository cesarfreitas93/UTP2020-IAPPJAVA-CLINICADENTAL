/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_02_Patient;
import WIN31CLC_DTO.Patient;
import WIN31CLC_DTO.Service;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class MySql_02_DaoPatient implements Dao_02_Patient {

    private Connection conn;

    public MySql_02_DaoPatient(Connection conn) {
        this.conn = conn;
    }

    final String INSERT = "INSERT INTO `patient` (`dni`, `name`, `lastname`, `surename`, `createAt`, `updateAt`, `enable`, `phone`, `email`, `address`, `ubigeo`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    final String FINDALL = "select id, `dni`, `name`, `lastname`, `surename`, `enable`, `phone`, `email`, `address`, `ubigeo` from patient where enable = 1";
    final String FINDBYID = "select id, `dni`, `name`, `lastname`, `surename`, `enable`, `phone`, `email`, `address`, `ubigeo` from patient where id = ?";
    final String FINDBY_DNI = "select id, `dni`, `name`, `lastname`, `surename`, `enable`, `phone`, `email`, `address`, `ubigeo` from patient where dni = ?";
    final String UPDATE = "update `updateAt` = ?, `enable`= ?, `phone` = ?, `email`= ?, `address`= ?, `ubigeo`= ? from patient where id = ?";
    final String DELETE = "update `updateAt` = ? from patient  where id = ?";

    @Override
    public void rlInsert(Patient entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();
            //pstmt.setTimestamp(2, new Timestamp(time));

            pst = (PreparedStatement) conn.prepareStatement(INSERT, new String[]{"id"});
            pst.setString(1, entity.getDni());
            pst.setString(2, entity.getName());
            pst.setString(3, entity.getLastname());
            pst.setString(4, entity.getSurename());
            pst.setTimestamp(5, new Timestamp(time));//java.sql.Date.valueOf(java.time.LocalDate.now())); //(java.sql.Date) new Date(entity.getCreateAt().getTime()));
            pst.setTimestamp(6, new Timestamp(time));
            pst.setBoolean(7, entity.isEnable());
            pst.setString(8, entity.getPhone());
            pst.setString(9, entity.getEmail());
            pst.setString(10, entity.getAddress());
            pst.setString(11, entity.getUbigeo());

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

    }

    @Override
    public void rlUpdate(Patient entity) throws DaoException {
        PreparedStatement pst = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();

            pst = (PreparedStatement) conn.prepareStatement(UPDATE);
            pst.setTimestamp(1, new Timestamp(time));
            pst.setBoolean(2, entity.isEnable());
            pst.setString(3, entity.getPhone());
            pst.setString(4, entity.getEmail());
            pst.setString(5, entity.getAddress());
            pst.setString(6, entity.getUbigeo());
            pst.setLong(7, entity.getId());

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
    public void rlDelete(Patient entity) throws DaoException {
        PreparedStatement pst = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();

            pst = (PreparedStatement) conn.prepareStatement(DELETE);
            pst.setTimestamp(1, new Timestamp(time));
            pst.setLong(2, entity.getId());

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

    private Patient Convert_(ResultSet rs) throws SQLException {
        //`name`, `descript`, `createAt`, `updateAt`, `status`, `company_id`, `user_id`
        String name = rs.getString("name");
        Patient dto = new Patient();
        dto.setName(name);
        dto.setId(rs.getLong("id"));
        dto.setLastname(rs.getString("lastname"));
        dto.setSurename(rs.getString("surename"));
        dto.setDni(rs.getString("dni"));
        dto.setEmail(rs.getString("email"));
        dto.setPhone(rs.getString("phone"));
        dto.setUbigeo(rs.getString("ubigeo"));
        dto.setAddress(rs.getString("address"));
        return dto;
    }

    @Override
    public List<Patient> findAll(int id) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Patient> list = new ArrayList<Patient>();
        try {
            pst = (PreparedStatement) conn.prepareStatement(FINDALL);
            rs = pst.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
                list.add(Convert_(rs));
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
    public Patient findById(Patient entity) throws DaoException {

        PreparedStatement pst = null;
        ResultSet rs = null;
        Patient dto = null;
        try {
            pst = (PreparedStatement) conn.prepareStatement(FINDBYID);
            pst.setLong(1, entity.getId());
            rs = pst.executeQuery();
            if (rs.next()) {
                dto = Convert_(rs);
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

    @Override
    public Patient ChekDNI(String dni) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Patient dto = null;
        try {
            pst = (PreparedStatement) conn.prepareStatement(FINDBY_DNI);
            pst.setString(1, dni);
            rs = pst.executeQuery();
            if (rs.next()) {
                dto = Convert_(rs);
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

}
