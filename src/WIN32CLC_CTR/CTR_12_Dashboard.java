/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.Dashboard;
import java.sql.SQLException;

/**
 *
 * @author Cesar
 */
public class CTR_12_Dashboard {
    public Dashboard getinfo() throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getDashboard().GetInfo();
    }
}
