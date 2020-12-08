
package WIN30CLC_DAO;

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

    Dao_11_DataBaseConfiguration getDaoDataBaseConfiguration();
    
    Dao_12_Dashboard getDashboard();
}
