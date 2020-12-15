/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO;

import WIN31CLC_DTO.Citas;
import WIN31CLC_DTO.CitasPatient;
import WIN31CLC_DTO.Comprobante_Detalle;
import java.util.List;

/**
 *
 * @author Carlos Jimenez Gomez
 */
public interface Dao_09_Comprobante_Detalle{
    public boolean InsertarDetalle(List<CitasPatient> CitasPatient,long id_cabecera) throws DaoException;
}
