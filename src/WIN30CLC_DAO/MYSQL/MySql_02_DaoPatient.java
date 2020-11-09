/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_02_Patient;
import WIN31CLC_DTO.Patient;
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
public class MySql_02_DaoPatient implements Dao_02_Patient{

    private Connection conn;
    public MySql_02_DaoPatient(Connection conn) {
        this.conn = conn;
    }
    
    final String INSERT = "INSERT INTO `patient` (`dni`, `name`, `lastname`, `surename`, `createAt`, `updateAt`, `enable`, `phone`, `email`, `address`, `ubigeo`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    
    @Override
    public void rlInsert(Patient entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
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
            pst.setTimestamp(6,new Timestamp(time));
            pst.setBoolean(7, entity.isEnable());
            pst.setString(8, entity.getPhone());
            pst.setString(9, entity.getEmail());
            pst.setString(10, entity.getAddress());
            pst.setString(11, entity.getUbigeo());

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
    public void rlUpdate(Patient entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rlDelete(Patient entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Patient> findAll(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Patient findById(Patient entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Patient ChekDNI(String dni) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
