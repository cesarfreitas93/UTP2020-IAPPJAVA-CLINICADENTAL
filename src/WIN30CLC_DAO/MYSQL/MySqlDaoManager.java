
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.DaoManager;
import WIN30CLC_DAO.Dao_01_Auth;
import WIN30CLC_DAO.Dao_02_Patient;
import WIN30CLC_DAO.Dao_03_Services;
import WIN30CLC_DAO.Dao_04_Specialist;
import WIN30CLC_DAO.Dao_05_Citas;
import WIN30CLC_DAO.Dao_06_Permisos;
import WIN30CLC_DAO.Dao_07_Empresa;
import WIN30CLC_DAO.Dao_08_Comprobante;
import WIN30CLC_DAO.Dao_09_Comprobante_Detalle;
import WIN30CLC_DAO.Dao_10_Ubigeo;
import WIN30CLC_DAO.Dao_11_DataBaseConfiguration;
import WIN31CLC_DTO.Config;
import WIN33CLC_VIEW.test_para_lanzar_metodos;
import WIN_2020_UTILS.ConfigReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cesar
 */
public class MySqlDaoManager implements DaoManager {

    private Dao_01_Auth DaoAuht = null;
    private Dao_02_Patient DaoPatient = null;
    private Dao_03_Services services = null;
    private Dao_04_Specialist specialist = null;
    private Dao_05_Citas citas = null;
    private Dao_06_Permisos permisos = null;
    private Dao_07_Empresa empresa = null;
    private Dao_08_Comprobante comprobante = null;
    private Dao_09_Comprobante_Detalle comprobante_detalle = null;
    private Dao_10_Ubigeo ubigeo = null;
    private Dao_11_DataBaseConfiguration baseConfiguration = null;

    protected ConfigReader properties = null;
    protected String db_name, db_url , db_user, db_pass;
    protected java.sql.Connection connection_  = null;
    
    public MySqlDaoManager() throws SQLException{
        
        try {
            properties = new ConfigReader();
            this.db_url = properties.getPropValues().getMySqlDAOMANAGER_db_server();
            this.db_user = properties.getPropValues().getMySqlDAOMANAGER_db_user();
            this.db_pass = properties.getPropValues().getMySqlDAOMANAGER_db_pass();
            connection_ = DriverManager.getConnection(this.db_url, this.db_user, this.db_pass);
        } catch (IOException ex) {
            Logger.getLogger(MySqlDaoManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Dao_01_Auth getDaoAuth() {
        if (DaoAuht == null) {
            DaoAuht = new MySql_01_DaoAuth(connection_);
        }
        return DaoAuht;
    }

    @Override
    public Dao_02_Patient getDaoPatient() {
        if (DaoPatient == null) {
            DaoPatient = new Mysql_02_DaoPatient(connection_);
        }
        return DaoPatient;
    }

    @Override
    public Dao_03_Services getDaoService() {
        if (services == null) {
            services = new MySql_03_DaoService(connection_);
        }
        return services;
    }

    @Override
    public Dao_04_Specialist getDaoSpecialist() {
        if (specialist == null) {
            specialist = new MySql_04_DaoSpecialist(connection_);
        }
        return specialist;
    }

    @Override
    public Dao_05_Citas getCitas() {
        if (citas == null) {
            citas = new MySql_05_DaoCitas(connection_);
        }
        return citas;
    }

    @Override
    public Dao_06_Permisos getPermisos() {
        if (permisos == null) {
            permisos = new MySql_06_DaoPermisos(connection_);
        }
        return permisos;
    }

    @Override
    public Dao_07_Empresa getEmpresa() {
        if (empresa == null) {
            empresa = new MySql_07_DaoEmpresa(connection_);
        }
        return empresa;
    }

    @Override
    public Dao_08_Comprobante getComprobante() {
 if (comprobante == null) {
            comprobante = new MySql_08_DaoComprobate(connection_);
        }
        return comprobante;
    }

    @Override
    public Dao_09_Comprobante_Detalle getComprobante_Detalle() {
       if (comprobante_detalle == null) {
            comprobante_detalle = new MySql_09_DaoComprobante_Detalle(connection_);
        }
        return comprobante_detalle;
    }

    @Override
    public Dao_10_Ubigeo getUbigeo() {
       if (ubigeo == null) {
            ubigeo = new MySql_10_DaoUbigeo(connection_);
        }
        return ubigeo;
    }

    @Override
    public Dao_11_DataBaseConfiguration getDaoDataBaseConfiguration() {
       if (baseConfiguration == null) {
            baseConfiguration = new MySql_11_DaoDataBaseConfiguration(connection_);
        }
        return baseConfiguration;
    }

}
