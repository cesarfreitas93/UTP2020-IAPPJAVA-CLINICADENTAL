/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO;

import WIN31CLC_DTO.Ubigeo;
import java.util.List;

/**
 *
 * @author Carlos Jimenez Gomez
 */
public interface Dao_10_Ubigeo extends Dao<Ubigeo, Long>{
    public List<Ubigeo> getdepartamentos() throws DaoException;
        public List<Ubigeo> getprovincia(Ubigeo entity) throws DaoException;
            public List<Ubigeo> getdistrito(Ubigeo entity) throws DaoException;

}