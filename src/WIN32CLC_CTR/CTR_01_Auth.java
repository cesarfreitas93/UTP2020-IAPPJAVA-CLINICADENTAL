package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.User;
import WIN31CLC_DTO.declaraciones;
import WIN32CLC_TABLEMODELS.UserTableModel;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class CTR_01_Auth {

    public boolean CheckAuth(String Username, String pass) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();

        User result = new User();
        declaraciones declaraciones_Ee = new declaraciones();


        result = man.getDaoAuth().ChekAuth(Username, pass);
        declaraciones_Ee.setGlobal_User(result);

        return result != null;
    }

    public User InsertUser(User entity) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getDaoAuth().Insert(entity);
    }

    private UserTableModel model;

    public AbstractTableModel ListUser() throws DaoException, SQLException {
        MySqlDaoManager man = new MySqlDaoManager();
        this.model = new UserTableModel(man.getDaoAuth());
        this.model.updateModel();
        this.model.fireTableDataChanged();
        return this.model;
    }

    public boolean DeleteUser(long id) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        User p = new User();
        p.setId(id);
        man.getDaoAuth().rlDelete(p);
        return true;
    }

    public User SelectUser(long id) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        User p = new User();
        p.setId(id);
        p = man.getDaoAuth().findById(p);
        return p;
    }

    public void UpdateUser(User User_E) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        man.getDaoAuth().rlUpdate(User_E);
    }
}
