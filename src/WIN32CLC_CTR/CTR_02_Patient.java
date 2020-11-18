
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.Patient;
import WIN32CLC_TABLEMODELS.PatientsTableModel;
import static WIN_2020_UTILS.JsonReader.readJsonFromUrl;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
import org.json.JSONException;
import org.json.JSONObject;

public class CTR_02_Patient {
 
    public Patient SearchReniec(String dni) throws IOException, JSONException{
        
        JSONObject json = readJsonFromUrl("https://dniruc.apisperu.com/api/v1/dni/"+dni+""
                + "?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9."
                + "eyJlbWFpbCI6ImNlc2FyLmZyZWl0YXMuZGV2QGdtYWlsLmNvbSJ9."
                + "UCNjN-XCgqTBkFQdSjtp1_dS73P358H4ilLx75z9es8");
        System.out.println(json.toString());
        System.out.println(json.get("dni"));     
        System.out.println(json.get("nombres"));
        System.out.println(json.get("apellidoPaterno"));
        System.out.println(json.get("apellidoMaterno"));

        Patient patient = new  Patient();
        
        patient.setName((String) json.get("nombres"));
        patient.setLastname((String) json.get("apellidoPaterno"));
        patient.setSurename((String) json.get("apellidoMaterno"));
        
        return patient;
    }
    
    public Patient CheckDNI(String DNI)throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getDaoPatient().ChekDNI(DNI);
    }
    
    public Patient InsertPatient(Patient entity) throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getDaoPatient().Insert(entity);
    }
    
    public boolean DeletePatien(long id) throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        Patient p = new Patient();
        p.setId(id);
        man.getDaoPatient().rlDelete(p);
        return true;
    }
    
    
    private PatientsTableModel  model;

    public AbstractTableModel ListPatients() throws DaoException, SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        this.model = new PatientsTableModel(man.getDaoPatient());
        this.model.updateModel();
        this.model.fireTableDataChanged();
        return this.model;
    }

    public Patient SelectPatient(long id) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        Patient p = new Patient();
        p.setId(id);
        p =  man.getDaoPatient().findById(p);
        return p;
    }

    public void UpdatePatient(Patient patient) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        man.getDaoPatient().rlUpdate(patient);
    }
}
