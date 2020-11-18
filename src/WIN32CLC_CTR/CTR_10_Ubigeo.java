/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.Ubigeo;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Carlos Jimenez Gomez
 */
public class CTR_10_Ubigeo {

    public List<Ubigeo> get_departamentos() throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getUbigeo().getdepartamentos();
    }
 //   public List<Ubigeo> get_departa_provi(Ubigeo entity) throws SQLException, DaoException {

    public List<Ubigeo> get_departa_provi(String departamento) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getUbigeo().getprovincia(departamento);
    }

  //  public List<Ubigeo> get_provi_dist(Ubigeo entity) throws SQLException, DaoException {
           public List<Ubigeo> get_provi_dist(String departamento,String provincia) throws SQLException, DaoException {

        MySqlDaoManager man = new MySqlDaoManager();
        return man.getUbigeo().getdistrito(departamento,provincia);
    }
}
