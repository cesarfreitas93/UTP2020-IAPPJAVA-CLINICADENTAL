
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.Dashboard;
import java.sql.SQLException;

public class CTR_12_Dashboard {
    public Dashboard getinfo() throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getDashboard().GetInfo();
    }
}
