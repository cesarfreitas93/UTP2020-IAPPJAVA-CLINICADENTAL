/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_TABLEMODELS;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_05_Citas;
import WIN31CLC_DTO.Citas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cesar
 */
public class CitasTableModel extends AbstractTableModel{
    
    private Dao_05_Citas citas;
    
    private List<Citas> datos = new ArrayList<>();
    
    public CitasTableModel(Dao_05_Citas dao){
        this.citas = dao;
    }
    
    public void updateModel() throws DaoException{
        datos = citas.findAll(0);
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
