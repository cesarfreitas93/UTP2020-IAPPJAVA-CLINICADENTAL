package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_05_Citas;
import WIN31CLC_DTO.Citas;
import WIN31CLC_DTO.horario_citas;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MySql_05_DaoCitas implements Dao_05_Citas {

    private Connection conn;
    final String INSERT = "insert into citas (fechadecita, createAt, updateat, status, patient_id, specialista_id) values(?,?,?,?,?)";
    final String CHANGE_STATUS = "update CITAS set status = ? where id = ?";
    final String UPDATE = "UPDATE CITAS set fechadecita = ?, updateat = ?, status = ?, patient_id = ?, service_id = ?, specialista_id = ? SET WHERE ID = ?";
    final String FINDBYID = "SELECT `id`,`fechaDeCita`,`status`,`patient_id`,`service_id`,`especialista_id` FROM `citas` WHERE `id`= ?";
    final String CAPTURAR_CANTIDAD_FECHAS = "SELECT count(1) as total FROM citas WHERE convert(fechadecita,date) = ? and estado = 1";
    final String CAPTURAR_CANTIDAD_FECHAS_1 = "SELECT hc.cita_horario_inicio,hc.cita_horario_fin FROM citas  as c inner join horario_citas as hc on hc.id_horario = c.id_horario WHERE convert(c.fechadecita,date) = ? and c.especialista_id=? and c.service_id=? and c.estado = 1 ";
    final String LISTAR_HORARIO_DISPONIBLE = "SELECT * FROM horario_citas WHERE habilitado=1";

    public MySql_05_DaoCitas(Connection conn) {
        this.conn = conn;
    }
    public Citas rlInsert(Citas entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();

            pst = (PreparedStatement) conn.prepareStatement(INSERT, new String[]{"id"});
            pst.setTimestamp(1, new Timestamp(time));
            pst.setTimestamp(2, new Timestamp(time));
            pst.setInt(3, entity.isStatus());
            pst.setLong(4, entity.getService_id());
            pst.setLong(5, entity.getPatient_id());
            pst.setLong(6, entity.getEspecialista_id());

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

    public void rlUpdate(Citas entity) throws DaoException {
        PreparedStatement pst = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();

            pst = (PreparedStatement) conn.prepareStatement(UPDATE);
            pst.setTimestamp(1, new Timestamp(time));
            pst.setTimestamp(2, new Timestamp(time));
            pst.setInt(3, entity.isStatus());
            pst.setLong(4, entity.getPatient_id());
            pst.setLong(5, entity.getService_id());
            pst.setLong(6, entity.getEspecialista_id());
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

    public void rlDelete(Citas entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Citas> findAll(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Citas Convert_(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        int status = rs.getInt("status");
        long paciente = rs.getLong("patient_id");
        long servicio = rs.getLong("service_id");
        long especialista = rs.getLong("especialista_id");
        Date fechadecita = rs.getDate("fechaDeCita");
        Citas dto = new Citas(id, status, paciente, servicio, especialista, fechadecita);
        return dto;
    }
    public Citas findById(Citas entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Citas dto = null;
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
    /*
    El siguiente metodo es llevado a evaluacion para su futuro borrado en esta clase
     */
    @Override
    public boolean CambiarStatus(int STATUS, long ID) throws DaoException {
        boolean RESULT = true;
        PreparedStatement pst = null;
        try {

            pst = (PreparedStatement) conn.prepareStatement(CHANGE_STATUS);
            pst.setInt(1, STATUS);
            pst.setLong(2, ID);
            if (pst.executeUpdate() == 0) {
                RESULT = false;
                throw new DaoException("Puede que no se haya modificado el estado.");
            }
        } catch (SQLException ex) {
            RESULT = false;
            throw new DaoException("Error en SQL", ex);

        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    RESULT = false;
                    throw new DaoException("Error en SQL", ex);
                }
            }
        }
        return RESULT;
    }

    @Override
    public int capturar_cantidad_fechas(String fecha) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        //  Citas dto = null;
        int registros = 0;

        try {
            pst = (PreparedStatement) conn.prepareStatement(CAPTURAR_CANTIDAD_FECHAS);
            pst.setString(1, fecha);
            rs = pst.executeQuery();
            if (rs.next()) {
                registros = rs.getInt("total");;
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
        return registros;
    }

    private horario_citas Convert_horario_citas_validacion(ResultSet rs) throws SQLException {
        horario_citas dto = new horario_citas();
        dto.setCita_horario_inicio(rs.getString("cita_horario_inicio"));
        dto.setCita_horario_fin(rs.getString("cita_horario_fin"));
        return dto;
    }

    @Override
    public List<horario_citas> capturar_cantidad_fechas_v1(String fecha, long id_especialista, long id_servicio) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<horario_citas> list = new ArrayList<horario_citas>();

        try {
            pst = (PreparedStatement) conn.prepareStatement(CAPTURAR_CANTIDAD_FECHAS_1);
            pst.setString(1, fecha);
            pst.setLong(2, id_especialista);
            pst.setLong(3, id_servicio);

            rs = pst.executeQuery();
            while (rs.next()) {
                list.add(Convert_horario_citas_validacion(rs));
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

    private horario_citas Convert_horario_citas(ResultSet rs) throws SQLException {
        //`dni`, `name`, `lastname`, `surename`, `createAt`, `updateAt`, `enable`, `phone`, `address`
        horario_citas dto = new horario_citas();
        dto.setId_horario(rs.getInt("id_horario"));
        dto.setCita_horario_inicio(rs.getString("cita_horario_inicio"));
        dto.setCita_horario_fin(rs.getString("cita_horario_fin"));
        dto.setHabilitado(rs.getBoolean("habilitado"));
        return dto;
    }

    @Override
    public List<horario_citas> listando_horario_disponible() throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<horario_citas> list = new ArrayList<horario_citas>();
        try {
            pst = (PreparedStatement) conn.prepareStatement(LISTAR_HORARIO_DISPONIBLE);
            rs = pst.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
                list.add(Convert_horario_citas(rs));
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
