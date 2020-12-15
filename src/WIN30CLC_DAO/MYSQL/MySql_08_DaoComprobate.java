
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_08_Comprobante;
import WIN31CLC_DTO.CitasPatient;
import WIN31CLC_DTO.Comprobante;
import WIN31CLC_DTO.ComprobanteReporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySql_08_DaoComprobate implements Dao_08_Comprobante{

    final String INSERT =   "INSERT INTO COMPRANTES \n" +
                            "(numero, serie, ruc,  \n" +
                            "fechaemision, patient_id )\n" +
                            "values (?,?,?,?,?);";
  private Connection conn;

    public MySql_08_DaoComprobate(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<CitasPatient> getCitasByPatient(long id) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<CitasPatient> list = new ArrayList<CitasPatient>();
        try {
            pst = (PreparedStatement) conn.prepareStatement("call SP_CITAS_GETCITAS_X_PATIENT(?)");
            pst.setLong(1, id);
            rs = pst.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
                list.add(Convert(rs));
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
//        if(list.size() == 1)
//            list.get(0).setSelected(true);
        
        return list;
    }

    private CitasPatient Convert(ResultSet rs) throws SQLException {
        CitasPatient dto = new CitasPatient();
        dto.setId(rs.getInt("Codigo de cita"));
        dto.setFechaCita(rs.getString("fechaDeCita"));
        dto.setHoraInicio(rs.getString("cita_horario_inicio"));
        dto.setHoraFin(rs.getString("cita_horario_fin"));
        dto.setServicio(rs.getString("Servicio"));
        dto.setPrecio(rs.getDouble("Precio"));
        dto.setSpecialista(rs.getString("Especialista"));
        return dto;
    }

    @Override
    public Comprobante Insertar(Comprobante entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = (PreparedStatement) conn.prepareStatement(INSERT, new String[]{"id"});
            pst.setString(1, entity.getNumero());
            pst.setString(2, entity.getSerie());
            pst.setString(3, entity.getRuc());
            pst.setString(4, entity.getFechaEmision());
            pst.setLong(5, entity.getPatienid());

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

     private ComprobanteReporte ConvertExplorador(ResultSet rs) throws SQLException {
         ComprobanteReporte dto = new ComprobanteReporte();
         dto.setAddress(rs.getString("address"));
         dto.setCLiente(rs.getString("cliente"));
         dto.setDni(rs.getString("dni"));
         dto.setEmail(rs.getString("email"));
         dto.setFecha(rs.getString("fechaemision"));
         dto.setId(rs.getInt("id"));
         dto.setNumero(rs.getString("numero"));
         dto.setPhone(rs.getString("phone"));
         dto.setRuc(rs.getString("ruc"));
         dto.setSerie(rs.getString("serie"));
        dto.setTotal(rs.getInt("ototal"));
        dto.setTotalpages(rs.getInt("opaginas"));
         return dto;
     }
     
    @Override
    public List<ComprobanteReporte> Explorador(String filtro, int rowShow, int pagenumber) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<ComprobanteReporte> list = new ArrayList<ComprobanteReporte>();
        try {
            // call exploradorComprobantes(10,0,'ces');
            pst = (PreparedStatement) conn.prepareStatement("call exploradorComprobantes(?,?,?)");
            pst.setInt(1, rowShow);
            pst.setInt(2, ((pagenumber - 1) * rowShow));
            pst.setString(3, filtro);
            rs = pst.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
                list.add(ConvertExplorador(rs));
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

}
