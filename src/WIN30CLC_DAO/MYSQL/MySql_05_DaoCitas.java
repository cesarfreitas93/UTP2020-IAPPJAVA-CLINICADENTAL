
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_05_Citas;
import WIN31CLC_DTO.Citas;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MySql_05_DaoCitas implements Dao_05_Citas {
    private Connection conn;
    final String INSERT = "insert into citas (fechadecita, createAt, updateat, status, patient_id, specialista_id) values(?,?,?,?,?)";
    final String CHANGE_STATUS = "update CITAS set status = ? where id = ?";
    final String UPDATE = "UPDATE CITAS set fechadecita = ?, updateat = ?, status = ?, patient_id = ?, service_id = ?, specialista_id = ? SET WHERE ID = ?";
    final String FINDBYID = "SELECT `id`,`fechaDeCita`,`status`,`patient_id`,`service_id`,`especialista_id` FROM `citas` WHERE `id`= ?";
    public MySql_05_DaoCitas(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void rlInsert(Citas entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
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
            

            if(pst.executeUpdate() == 0){
                throw new DaoException("Puede que no se haya guardado.");
            }
            
            
            try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    entity.setId((int) generatedKeys.getLong(1));
                }
                else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
            
            
        }
        catch (SQLException ex) {
            throw new DaoException("Error en SQL", ex);
        }
        finally{
           if(rs != null){
               try{
                   rs.close();
               }
               catch(SQLException ex){
                   new DaoException("Error en SQL", ex); 
               }
           }
            if(pst != null){
                try{
                    pst.close();
                }catch(SQLException ex){
                    throw new DaoException("Error en SQL", ex);
                }
            }
        } 
    }

    @Override
    public void rlUpdate(Citas entity) throws DaoException {
        PreparedStatement pst = null;
        try{
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

            if(pst.executeUpdate() == 0){
                throw new DaoException("Puede que no se haya modificado.");
            }
        }
        catch (SQLException ex) {
            throw new DaoException("Error en SQL", ex);
        }
        finally{
            if(pst != null){
                try{
                    pst.close();
                }catch(SQLException ex){
                    throw new DaoException("Error en SQL", ex);
                }
            }
        }
    }

    @Override
    public void rlDelete(Citas entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Citas> findAll(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Citas Convert_(ResultSet rs) throws SQLException{
        int id = rs.getInt("id");
        int status = rs.getInt("status");
        long paciente = rs.getLong("patient_id");
        long servicio = rs.getLong("service_id");
        long especialista  = rs.getLong("especialista_id");
        Date fechadecita = rs.getDate("fechaDeCita");
        Citas dto = new Citas(id, status, paciente, servicio, especialista, fechadecita);
        return dto;
    }
    @Override
    public Citas findById(Citas entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Citas dto = null;
        try{
            pst = (PreparedStatement) conn.prepareStatement(FINDBYID);
            pst.setLong(1, entity.getId());
            rs = pst.executeQuery();
            if(rs.next()){
                dto = Convert_(rs);
            }else{
                throw new DaoException("No se ha encontrado el registro");
            }
        }
        catch(SQLException ex){
            throw new DaoException("Error en SQL", ex);
        }finally{
           if(rs != null){
               try{
                   rs.close();
               }
               catch(SQLException ex){
                   new DaoException("Error en SQL", ex); 
               }
           }
           if(pst != null){
               try{
                   pst.close();
               }catch(SQLException ex){
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
        try{
            
            pst = (PreparedStatement) conn.prepareStatement(CHANGE_STATUS);
            pst.setInt(1, STATUS);
            pst.setLong(2, ID);
            if(pst.executeUpdate() == 0){
                RESULT = false;
                throw new DaoException("Puede que no se haya modificado el estado.");
            }
        }
        catch (SQLException ex) {
            RESULT = false;
            throw new DaoException("Error en SQL", ex);
            
        }
        finally{
            if(pst != null){
                try{
                    pst.close();
                }catch(SQLException ex){
                    RESULT = false;
                    throw new DaoException("Error en SQL", ex);
                }
            }
        }
        return RESULT;
    }

}
