/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.Specialist;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cesar
 */
public class CTR_04_Specialist {
    public List<Specialist> listSpecialist(Long id) throws SQLException{
        try {
            MySqlDaoManager man = new MySqlDaoManager();
            return man.getDaoSpecialist().buscarPorEspecialidad(id);
        } catch (DaoException ex) {
            Logger.getLogger(CTR_04_Specialist.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
