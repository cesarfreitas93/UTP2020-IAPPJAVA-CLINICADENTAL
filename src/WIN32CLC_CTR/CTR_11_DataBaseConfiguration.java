/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cesar
 */
public class CTR_11_DataBaseConfiguration {
   public boolean RESETDATABASE() throws SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        try {
            return man.getDaoDataBaseConfiguration().ResetDATABASE();
        } catch (DaoException ex) {
            Logger.getLogger(CTR_03_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
   } 
}
