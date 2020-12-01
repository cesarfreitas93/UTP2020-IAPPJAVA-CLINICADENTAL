/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_11_DataBaseConfiguration;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Cesar
 */
public class MySql_11_DaoDataBaseConfiguration implements Dao_11_DataBaseConfiguration{
    private Connection conn;
//
    final String RESET = "CALL clearDATABASE()";
    
    public MySql_11_DaoDataBaseConfiguration(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean ResetDATABASE() throws DaoException {
        boolean res = false;
        PreparedStatement pst = null;
        try{
            pst = (PreparedStatement) conn.prepareStatement(RESET);
            
            res = true;
//            if(pst.executeUpdate() == 0){
//                res = false;
//                throw new DaoException("Puede que no se haya reseteado.");
//            }
        }
        catch (SQLException ex) {
            res = false;
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
        return res;
    }
}
