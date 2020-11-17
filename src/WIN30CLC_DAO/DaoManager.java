
package WIN30CLC_DAO;

public interface DaoManager {
    Dao_01_Auth getDaoAuth();
    Dao_02_Patient getDaoPatient();
    Dao_03_Services getDaoService();
    Dao_04_Specialist getDaoSpecialist();
    Dao_05_Citas getCitas();
}
