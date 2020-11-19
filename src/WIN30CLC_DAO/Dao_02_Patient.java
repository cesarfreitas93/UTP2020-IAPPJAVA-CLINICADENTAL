
package WIN30CLC_DAO;

import WIN31CLC_DTO.Patient;

public interface Dao_02_Patient extends Dao<Patient, Long>{
    public Patient ChekDNI(String dni) throws DaoException;
    public Patient Insert(Patient entitu) throws DaoException;
    public Patient findByDNI(Patient entity) throws DaoException;
}
