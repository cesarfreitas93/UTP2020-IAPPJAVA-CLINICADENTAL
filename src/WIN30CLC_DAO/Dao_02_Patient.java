/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO;

import WIN31CLC_DTO.Patient;

/**
 *
 * @author Cesar
 */
public interface Dao_02_Patient extends Dao<Patient, Long>{
    public Patient ChekDNI(String dni) throws DaoException;
    public Patient Insert(Patient entitu) throws DaoException;
}
