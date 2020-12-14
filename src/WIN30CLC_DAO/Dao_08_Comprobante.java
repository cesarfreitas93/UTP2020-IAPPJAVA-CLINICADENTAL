/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO;

import WIN31CLC_DTO.CitasPatient;
import WIN31CLC_DTO.Comprobante;
import java.util.List;

/**
 *
 * @author Carlos Jimenez Gomez
 */
public interface Dao_08_Comprobante{
    public List<CitasPatient> getCitasByPatient(long id) throws DaoException;
    public Comprobante Insertar(Comprobante entity) throws DaoException;
}