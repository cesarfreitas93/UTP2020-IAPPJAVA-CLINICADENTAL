/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.Patient;
import WIN31CLC_DTO.Specialist;
import WIN32CLC_TABLEMODELS.SpecialistTableModel;
import static WIN_2020_UTILS.JsonReader.readJsonFromUrl;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Cesar
 */
public class CTR_04_Specialist {
    
    public Specialist SearchReniec(String dni) throws IOException, JSONException{
        
        JSONObject json = readJsonFromUrl("https://dniruc.apisperu.com/api/v1/dni/"+dni+""
                + "?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9."
                + "eyJlbWFpbCI6ImNlc2FyLmZyZWl0YXMuZGV2QGdtYWlsLmNvbSJ9."
                + "UCNjN-XCgqTBkFQdSjtp1_dS73P358H4ilLx75z9es8");
        System.out.println(json.toString());
        System.out.println(json.get("dni"));     
        System.out.println(json.get("nombres"));
        System.out.println(json.get("apellidoPaterno"));
        System.out.println(json.get("apellidoMaterno"));

        Specialist e = new  Specialist();
        
        e.setName((String) json.get("nombres"));
        e.setLastname((String) json.get("apellidoPaterno"));
        e.setSurename((String) json.get("apellidoMaterno"));
        
        return e;
    }

    public Specialist CheckDNI(String DNI)throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getDaoSpecialist().ChekDNI(DNI);
    }
    
    public boolean insert(Specialist entity) throws SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        try {
            man.getDaoSpecialist().rlInsert(entity);
            return true;
        } catch (DaoException ex) {
            Logger.getLogger(CTR_03_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean update(Specialist entity) throws SQLException{
        
        MySqlDaoManager man = new MySqlDaoManager();
        try {
            man.getDaoSpecialist().rlUpdate(entity);
            return true;
        } catch (DaoException ex) {
            Logger.getLogger(CTR_03_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public List<Specialist> listSpecialist(Long id) throws SQLException{
        try {
            MySqlDaoManager man = new MySqlDaoManager();
            return man.getDaoSpecialist().buscarPorEspecialidad(id);
        } catch (DaoException ex) {
            Logger.getLogger(CTR_04_Specialist.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    // este metodo funciona mejor para el control jtable
    private SpecialistTableModel  model;

    public AbstractTableModel List() throws DaoException, SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        this.model = new SpecialistTableModel(man.getDaoSpecialist());
        this.model.updateModel();
        this.model.fireTableDataChanged();
        return this.model;
    }
    
    
    public void Delete(long id) throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        Specialist p = new Specialist();
        p.setId(id);
        man.getDaoSpecialist().rlDelete(p);
    }

    public Specialist Select(long id) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        Specialist p = new Specialist();
        p.setId(id);
        p =  man.getDaoSpecialist().findById(p);
        return p;
    }
}
