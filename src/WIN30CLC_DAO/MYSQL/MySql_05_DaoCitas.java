/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.util.List;

/**
 *
 * @author Cesar
 */
public class MySql_05_DaoCitas implements Dao_05_Citas {
    private Connection conn;
    final String INSERT = "insert into citas (createAt, status, patient_id, specialista_id) values(?,?,?,?)";
    final String CHANGE_STATUS = "update status = 1";
    
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
            pst.setBoolean(2, entity.isStatus());
            pst.setLong(3, entity.getPatient_id());
            pst.setLong(4, entity.getEspecialista_id());
            

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rlDelete(Citas entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Citas> findAll(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Citas findById(Citas entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean CambiarStatus(int STATUS) throws DaoException {
        boolean RESULT = true;
        PreparedStatement pst = null;
        try{
            
            pst = (PreparedStatement) conn.prepareStatement(CHANGE_STATUS);
            pst.setInt(1, STATUS);
            if(pst.executeUpdate() == 0){
                RESULT = false;
                throw new DaoException("Puede que no se haya modificado.");
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
