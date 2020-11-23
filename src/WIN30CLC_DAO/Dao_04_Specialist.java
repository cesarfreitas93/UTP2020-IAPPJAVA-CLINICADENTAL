/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO;

import WIN31CLC_DTO.Specialist;
import java.util.List;

/**
 *
 * @author Cesar
 */
public interface Dao_04_Specialist extends Dao<Specialist, Long>{
    public List<Specialist> buscarPorEspecialidad(Long id)throws DaoException;
}
