
package WIN30CLC_DAO;

import WIN31CLC_DTO.Citas;

public interface Dao_05_Citas extends Dao<Citas, Long>{
    public boolean CambiarStatus(int STATUS, long ID) throws DaoException;
}
