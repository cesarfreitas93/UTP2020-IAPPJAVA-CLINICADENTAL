/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.CitasPatient;
import WIN31CLC_DTO.Comprobante;
import WIN32CLC_TABLEMODELS.CitasPatientTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cesar
 */
public class CTR_08_Comprobante {
        // este metodo funciona mejor para el control jtable
    private CitasPatientTableModel  model;
    public List<CitasPatient> lista = new ArrayList();

    public void setLista(List<CitasPatient> lista) {
        this.lista = lista;
    }

    public List<CitasPatient> getLista() {
        return lista;
    }

    public AbstractTableModel List(long id) throws DaoException, SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        this.model = new CitasPatientTableModel(man.getComprobante());
        this.model.updateModel(id);
        this.setLista(this.model.getLista());
        this.model.fireTableDataChanged();
        return this.model;
    }
    
    public AbstractTableModel List(List<CitasPatient> list) throws DaoException, SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        this.model = new CitasPatientTableModel(man.getComprobante());
        this.model.updateModel(list);
        this.setLista(this.model.getLista());
        this.model.fireTableDataChanged();
        return this.model;
    }
    
    public Comprobante Insertar(Comprobante entity)throws DaoException, SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        entity =  man.getComprobante().Insertar(entity);
        return entity;
    }
    
}
