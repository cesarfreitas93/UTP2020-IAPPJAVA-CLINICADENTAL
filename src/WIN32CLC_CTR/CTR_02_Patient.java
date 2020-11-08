/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.Patient;
import static WIN_2020_UTILS.JsonReader.readJsonFromUrl;
import java.io.IOException;
import java.sql.SQLException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Cesar
 */
public class CTR_02_Patient {
 
    public Patient SearchReniec(String dni) throws IOException, JSONException{
        
        JSONObject json = readJsonFromUrl("https://dniruc.apisperu.com/api/v1/dni/"+dni+"?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6ImNlc2FyLmZyZWl0YXMuZGV2QGdtYWlsLmNvbSJ9.UCNjN-XCgqTBkFQdSjtp1_dS73P358H4ilLx75z9es8");
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
    
    public boolean InsertPatient(Patient entity) throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        //Patient result = new Patient();
        man.getDaoPatient().rlInsert(entity);
        return true;
    }
}
