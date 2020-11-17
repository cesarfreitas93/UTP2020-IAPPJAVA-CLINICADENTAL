
package WIN30CLC_DAO;

import WIN31CLC_DTO.Ubigeo;
import java.util.List;


public interface Dao_10_Ubigeo extends Dao<Ubigeo, Long>{
    public List<Ubigeo> getdepartamentos() throws DaoException;
        public List<Ubigeo> getprovincia(Ubigeo entity) throws DaoException;
            public List<Ubigeo> getdistrito(Ubigeo entity) throws DaoException;

}