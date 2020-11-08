/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_01_Auth;
import WIN31CLC_DTO.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class MySql_01_DaoAuth implements Dao_01_Auth{

    final String CHECKAUTH = "select username, role from user where username = ? and password = ?";
    
    private Connection conn;
    
    public MySql_01_DaoAuth(Connection conn) {
        this.conn = conn;
    }
    
    

    @Override
    public void rlInsert(User entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rlUpdate(User entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rlDelete(User entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(User entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private User Convert_(ResultSet rs) throws SQLException{
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
        try{
            pst = (PreparedStatement) conn.prepareStatement(CHECKAUTH);
            pst.setString(1, username);           
            pst.setString(2, password);
            rs = pst.executeQuery();
            if(rs.next()){
                dto = Convert_(rs);
            }else{
                dto = null;
                throw new DaoException("Credenciales Incorrectas!");
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
    
}
