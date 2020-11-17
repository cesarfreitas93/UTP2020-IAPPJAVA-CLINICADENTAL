/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.Citas;
import WIN31CLC_DTO.Patient;
import WIN31CLC_DTO.Service;
import WIN31CLC_DTO.Specialist;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class CTR_05_Citas {

    public Citas getCita(long id) throws SQLException, DaoException {
        // obtener la cita
        Citas cita = new Citas();
        cita.setId(id);
        MySqlDaoManager man = new MySqlDaoManager();
        cita = man.getCitas().findById(cita);

        // obtener el paciente
        Patient paciente = new Patient();
        paciente.setId(cita.getPatient_id());
        paciente = man.getDaoPatient().findById(paciente);
        // obtener el servicio
        Service servicio = new Service();
        servicio.setId(cita.getService_id());
        servicio = man.getDaoService().findById(servicio);
        // obtner el especialista
        Specialist especialista = new Specialist();
        especialista.setId(cita.getEspecialista_id());
        especialista = man.getDaoSpecialist().findById(especialista);
        
        cita.setSpecialist(especialista);
        cita.setPatient(paciente);
        cita.setService(servicio);
        
        return cita;
    }
    
}
