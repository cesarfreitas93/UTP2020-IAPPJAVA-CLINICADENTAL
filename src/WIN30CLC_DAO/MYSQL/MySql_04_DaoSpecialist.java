/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_04_Specialist;
import WIN31CLC_DTO.Specialist;
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
public class MySql_04_DaoSpecialist implements Dao_04_Specialist{
    final String INSERT = "insert into especialista (`dni`, `name`, `lastname`, `surename`, `createAt`, `updateAt`, `enable`, `phone`, `address`) values (?,?, ?,?,?,?,?,?,?)";
    final String UPDATE = "update especialista set `phone` = ?, `address` = ? where id = ?";
    final String FINDALL = "SELECT id, `dni`, `name`, `lastname`, `surename`, `enable`, `phone`, `address` FROM especialista";
    final String FINDBYID = "select id, `dni`, `name`, `lastname`, `surename`, `enable`, `phone`, `address` FROM especialista where id  = ?";
    private Connection conn;
    
    public MySql_04_DaoSpecialist(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void rlInsert(Specialist entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();
            
            pst = (PreparedStatement) conn.prepareStatement(INSERT, new String[]{"id"});
            pst.setString(1, entity.getDni());
            pst.setString(2, entity.getName());
            pst.setString(3, entity.getLastname());
            pst.setString(4, entity.getSurename());
            pst.setTimestamp(5, new Timestamp(time));
            pst.setTimestamp(6,new Timestamp(time));
            pst.setBoolean(7, entity.isEnable());
            pst.setString(8, entity.getPhone());
            pst.setString(9, entity.getAddress());

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
    public void rlUpdate(Specialist entity) throws DaoException {
        PreparedStatement pst = null;
        try{
            pst = (PreparedStatement) conn.prepareStatement(UPDATE);
            pst.setString(1, entity.getPhone());
            pst.setString(2, entity.getAddress());
            pst.setLong(3, entity.getId());

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
    public void rlDelete(Specialist entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Specialist> findAll(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Specialist findById(Specialist entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
