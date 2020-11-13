/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO;

/**
 *
 * @author Cesar
 */
public interface DaoManager {

    Dao_01_Auth getDaoAuth();

    Dao_02_Patient getDaoPatient();

    Dao_03_Services getDaoService();

    Dao_04_Specialist getDaoSpecialist();

    Dao_05_Citas getCitas();

    Dao_06_Permisos getPermisos();

    Dao_07_Empresa getEmpresa();

    Dao_08_Comprobante getComprobante();

    Dao_09_Comprobante_Detalle getComprobante_Detalle();

    Dao_10_Ubigeo getUbigeo();

}
