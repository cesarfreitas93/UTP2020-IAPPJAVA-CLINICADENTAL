
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.User;
import java.sql.SQLException;

public class CTR_01_Auth {
    public boolean CheckAuth (String Username,  String pass) throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        
        User result = new User();
        result = man.getDaoAuth().ChekAuth(Username, pass);
        
        return result != null;
    }
    

}
