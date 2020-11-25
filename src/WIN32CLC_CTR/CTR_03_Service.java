/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.Service;
import WIN32CLC_TABLEMODELS.ServiceTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cesar
 */
public class CTR_03_Service {
 
    public boolean insert(Service entity) throws SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        try {
            man.getDaoService().rlInsert(entity);
            return true;
        } catch (DaoException ex) {
            Logger.getLogger(CTR_03_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean update(Service entity) throws SQLException{
        
        MySqlDaoManager man = new MySqlDaoManager();
        try {
            man.getDaoService().rlUpdate(entity);
            return true;
        } catch (DaoException ex) {
            Logger.getLogger(CTR_03_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // este metodo funciona para los combos desplegables
    public List<Service> listService() throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getDaoService().findAll(0);
    }
    
    // este metodo funciona mejor para el control jtable
    private ServiceTableModel  model;

    public AbstractTableModel ListService() throws DaoException, SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        this.model = new ServiceTableModel(man.getDaoService());
        this.model.updateModel();
        this.model.fireTableDataChanged();
        return this.model;
    }
    
    public void DeleteService(long id) throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        Service p = new Service();
        p.setId(id);
        man.getDaoService().rlDelete(p);
    }

    public Service SelectService(long id) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        Service p = new Service();
        p.setId(id);
        p =  man.getDaoService().findById(p);
        return p;
    }
}
