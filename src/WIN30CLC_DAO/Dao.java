/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO;

import java.util.List;

/**
 *
 * @author Cesar
 */
public interface Dao<T,K> { // CLASE SERA T Y K EL TIPO DE DATOS DE LA CLAVE PRIMARIA
    
    void rlInsert(T entity) throws DaoException;
    void rlUpdate(T entity) throws DaoException;
    void rlDelete(T entity) throws DaoException;
    List<T> findAll(int id) throws DaoException;
    T findById(T entity) throws DaoException;
    
}