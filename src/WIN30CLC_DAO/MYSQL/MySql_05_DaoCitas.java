package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_05_Citas;
import WIN31CLC_DTO.Citas;
import WIN31CLC_DTO.Patient;
import WIN31CLC_DTO.Service;
import WIN31CLC_DTO.Specialist;
import WIN31CLC_DTO.horario_citas;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MySql_05_DaoCitas implements Dao_05_Citas {

    private Connection conn;
    final String INSERT = "insert into citas (`createAt`,`status`,`patient_id`,`especialista_id`,`service_id`,`updateAt`,`fechaDeCita`,`id_horario`,`estado`) values(?,?,?,?,?,?,?,?,?)";
    final String CHANGE_STATUS = "UPDATE citas set fechadecita =convert(?,date),updateat = ?,status = ?,  id_horario = ? WHERE ID = ?";
    final String ANULAR_CITAS = "UPDATE citas set updateat = ?,status = ? WHERE ID = ?";

    final String UPDATE = "UPDATE CITAS set fechadecita = ?, updateat = ?, status = ?, patient_id = ?, service_id = ?, specialista_id = ? SET WHERE ID = ?";
    final String FINDBYID = "SELECT `id`,`fechaDeCita`,`status`,`patient_id`,`service_id`,`especialista_id` FROM `citas` WHERE `id`= ?";
    final String CAPTURAR_CANTIDAD_FECHAS = "SELECT count(1) as total FROM citas WHERE convert(fechadecita,date) = ? and estado = 1";
    final String CAPTURAR_CANTIDAD_FECHAS_1 = "SELECT hc.cita_horario_inicio,hc.cita_horario_fin FROM citas  as c inner join horario_citas as hc on hc.id_horario = c.id_horario WHERE convert(c.fechadecita,date) = ? and c.especialista_id=? and c.service_id=? and c.estado = 1 ";
    final String LISTAR_HORARIO_DISPONIBLE = "SELECT * FROM horario_citas WHERE habilitado=1";
    final String EXPLORADOR_CITAS = "call exploradordecitas(?,?,?)";

    final String LISTAR_CITAS_TODOS = "select cts.id,pat.name,pat.lastname,pat.surename,srv.name as name_services,spt.name as name_especialista from citas as cts inner join patient as pat on pat.id = cts.patient_id inner join services as srv on srv.id = cts.service_id inner join especialista as spt on spt.id = cts.especialista_id inner join horario_citas as hct on hct.id_horario = cts.id_horario where status = ?";

    final String LISTAR_CITAS_TODOS_BY_ID = "select cts.id as id_citas,pat.id as id_paciente,pat.name,pat.lastname,pat.surename,pat.phone,srv.id as id_services,srv.name as name_services,spt.id as id_especialista,spt.name as name_especialista,convert(fechadecita,date) as fechadecita,hct.id_horario,hct.cita_horario_inicio,hct.cita_horario_fin from citas as cts inner join patient as pat on pat.id = cts.patient_id inner join services as srv on srv.id = cts.service_id inner join especialista as spt on spt.id = cts.especialista_id inner join horario_citas as hct on hct.id_horario = cts.id_horario where cts.id = ?";

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
            pst.setInt(2, entity.isStatus());
            pst.setLong(3, entity.getPatient_id());
            pst.setLong(4, entity.getEspecialista_id());
            pst.setLong(5, entity.getService_id());
            pst.setTimestamp(6, new Timestamp(time));
            pst.setDate(7, (java.sql.Date) entity.getFechadecita());
            pst.setLong(8, entity.getId_horario());
            pst.setInt(9, 1);

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

    private Citas Convert_listar_todo_citas(ResultSet rs) throws SQLException {

        Citas dto = new Citas();

        dto.setId(rs.getLong("id"));

        Patient dto1 = new Patient();
        dto1.setLastname(rs.getString("lastname"));
        dto1.setSurename(rs.getString("surename"));
        dto.setPatient(dto1);

        Service dto2 = new Service();
        dto2.setName(rs.getString("name_services"));
        dto.setService(dto2);

        Specialist dto3 = new Specialist();
        dto3.setName(rs.getString("name_especialista"));

        dto.setSpecialist(dto3);

        return dto;
    }

    @Override
    public List<Citas> findAll(int id) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Citas> list = new ArrayList<Citas>();
        try {
            pst = (PreparedStatement) conn.prepareStatement(LISTAR_CITAS_TODOS);
            pst.setLong(1, id);
            rs = pst.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
                list.add(Convert_listar_todo_citas(rs));
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

    private Citas Convert_listar_todo_citas_findById(ResultSet rs) throws SQLException {

        Citas dto = new Citas();

        dto.setId(rs.getLong("id_citas"));
        dto.setFechadecita(rs.getDate("fechadecita"));

        Patient dto1 = new Patient();
        dto1.setId(rs.getLong("id_paciente"));
        dto1.setLastname(rs.getString("lastname"));
        dto1.setSurename(rs.getString("surename"));
        dto1.setPhone(rs.getString("phone"));

        dto.setPatient(dto1);

        Service dto2 = new Service();
        dto2.setId(rs.getLong("id_services"));
        dto2.setName(rs.getString("name_services"));
        dto.setService(dto2);

        Specialist dto3 = new Specialist();
        dto3.setId(rs.getLong("id_especialista"));
        dto3.setName(rs.getString("name_especialista"));
        dto.setSpecialist(dto3);

        horario_citas dto4 = new horario_citas();
        dto4.setId_horario((int) rs.getLong("id_horario"));
        dto4.setCita_horario_inicio(rs.getString("cita_horario_inicio"));
        dto4.setCita_horario_fin(rs.getString("cita_horario_fin"));
        dto.setHorario_citas(dto4);

        return dto;
    }

    public Citas findById(Citas entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Citas dto = null;
        try {
            pst = (PreparedStatement) conn.prepareStatement(LISTAR_CITAS_TODOS_BY_ID);
            pst.setLong(1, entity.getId());
            rs = pst.executeQuery();
            if (rs.next()) {
                dto = Convert_listar_todo_citas_findById(rs);
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
    public boolean CambiarStatus(Citas entity) throws DaoException {
        boolean RESULT = true;
        PreparedStatement pst = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();

            pst = (PreparedStatement) conn.prepareStatement(CHANGE_STATUS);
            pst.setDate(1, (java.sql.Date) entity.getFechadecita());
            pst.setTimestamp(2, new Timestamp(time));
            pst.setInt(3, entity.getStatus());
            pst.setInt(4, entity.getHorario_citas().getId_horario());
            pst.setLong(5, entity.getId());
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
    public boolean Anular_citas(Citas entity) throws DaoException {
        boolean RESULT = true;
        PreparedStatement pst = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();

            pst = (PreparedStatement) conn.prepareStatement(ANULAR_CITAS);
            pst.setTimestamp(1, new Timestamp(time));
            pst.setInt(2, entity.getStatus());
            pst.setLong(3, entity.getId());
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

    private Citas ConvertExplorador(ResultSet rs) throws SQLException {

        Citas dto = new Citas();
        dto.setId(rs.getLong("id"));
        Patient dto1 = new Patient();
        dto1.setDni(rs.getString("DNI"));
        dto1.setName(rs.getString("paciente"));
        dto.setPatient(dto1);

        Service dto2 = new Service();
        dto2.setName(rs.getString("Servicio"));
        dto.setService(dto2);

        Specialist dto3 = new Specialist();
        dto3.setName(rs.getString("medico"));
        dto.setSpecialist(dto3);

        dto.setFecha_Registro(rs.getString("fecha_registro"));
        dto.setFecha_cita(rs.getString("fecha"));
        dto.setHora_inicio(rs.getString("horainicio"));

        dto.setTotal(rs.getInt("ototal"));
        dto.setTotalpages(rs.getInt("opaginas"));
        return dto;
    }

    @Override
    public List<Citas> Explorador(String filtro, int rowShow, int pagenumber) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Citas> list = new ArrayList<Citas>();
        try {
            pst = (PreparedStatement) conn.prepareStatement(EXPLORADOR_CITAS);
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
