
package WIN30CLC_DAO;

import java.util.List;


public interface Dao<T,K> { // CLASE SERA T Y K EL TIPO DE DATOS DE LA CLAVE PRIMARIA
    
    void rlInsert(T entity) throws DaoException;
    void rlUpdate(T entity) throws DaoException;
    void rlDelete(T entity) throws DaoException;
    List<T> findAll(int id) throws DaoException;
    T findById(T entity) throws DaoException;
    
}