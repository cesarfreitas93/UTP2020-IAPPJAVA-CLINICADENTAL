package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_10_Ubigeo;
import WIN31CLC_DTO.Ubigeo;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Jimenez Gomez
 */
    public class MySql_10_DaoUbigeo implements Dao_10_Ubigeo {

    private Connection conn;

    public MySql_10_DaoUbigeo(Connection conn) {
        this.conn = conn;
    }

    final String FINDBY_DEP = "SELECT DISTINCT codigo_departamento,descripcion_departamento from UBIGEO WHERE habilitado = 1 order BY descripcion_departamento";
    final String FINDBYID_DEP_PRO = "SELECT DISTINCT codigo_provincia,descripcion_provincia from UBIGEO where codigo_departamento = ? and habilitado = 1 order BY descripcion_provincia";
    final String FINDBYID_PRO_DIS = "SELECT distinct codigo_departamento,descripcion_departamento,codigo_provincia,descripcion_provincia,codigo_distrito,descripcion_distrito from UBIGEO  WHERE codigo_departamento = ? and codigo_provincia = ?  AND habilitado = 1 order BY descripcion_distrito ";

    private Ubigeo Convert_Depa(ResultSet rs) throws SQLException {
        Ubigeo dto = new Ubigeo();
        dto.setCodigo_departamento(rs.getString("Codigo_departamento"));
        dto.setDescripcion_departamento(rs.getString("Descripcion_departamento"));

        return dto;
    }

    @Override
    public List<Ubigeo> getdepartamentos() throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Ubigeo> list = new ArrayList<Ubigeo>();
        try {
            pst = (PreparedStatement) conn.prepareStatement(FINDBY_DEP);
            rs = pst.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
                list.add(Convert_Depa(rs));
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

    private Ubigeo Convert_Depa_Pro(ResultSet rs) throws SQLException {
        Ubigeo dto = new Ubigeo();
        dto.setCodigo_provincia(rs.getString("Codigo_provincia"));
        dto.setDescripcion_provincia(rs.getString("Descripcion_provincia"));

        return dto;
    }

    @Override
    public List<Ubigeo> getprovincia(Ubigeo entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Ubigeo> list = new ArrayList<Ubigeo>();
        try {
            pst = (PreparedStatement) conn.prepareStatement(FINDBYID_DEP_PRO);
            pst.setString(1, entity.getCodigo_departamento());
            rs = pst.executeQuery();

            System.out.println(rs);
            while (rs.next()) {
                list.add(Convert_Depa_Pro(rs));
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

    private Ubigeo Convert_Prov_Dist(ResultSet rs) throws SQLException {
        Ubigeo dto = new Ubigeo();
        dto.setCodigo_distrito(rs.getString("Codigo_distrito"));
        dto.setDescripcion_distrito(rs.getString("Descripcion_distrito"));

        return dto;
    }

    @Override
    public List<Ubigeo> getdistrito(Ubigeo entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Ubigeo> list = new ArrayList<Ubigeo>();
        try {
            pst = (PreparedStatement) conn.prepareStatement(FINDBYID_PRO_DIS);
            pst.setString(1, entity.getCodigo_departamento());
            pst.setString(2, entity.getCodigo_provincia());

            rs = pst.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
                list.add(Convert_Prov_Dist(rs));
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
    public void rlInsert(Ubigeo entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rlUpdate(Ubigeo entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rlDelete(Ubigeo entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ubigeo> findAll(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ubigeo findById(Ubigeo entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
