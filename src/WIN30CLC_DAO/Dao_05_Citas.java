
package WIN30CLC_DAO;

import WIN31CLC_DTO.Citas;
import java.util.List;

public interface Dao_05_Citas{
    public void rlUpdate(Citas entity) throws DaoException;
    public Citas rlInsert(Citas entity) throws DaoException ;
    public void rlDelete(Citas entity) throws DaoException;
    public List<Citas> findAll(int id) throws DaoException ;
    public Citas findById(Citas entity) throws DaoException;
    public boolean CambiarStatus(int STATUS, long ID) throws DaoException;
}
