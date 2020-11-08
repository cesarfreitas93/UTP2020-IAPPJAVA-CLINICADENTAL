/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.DaoManager;
import WIN30CLC_DAO.Dao_01_Auth;
import WIN30CLC_DAO.Dao_02_Patient;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author Cesar
 */
public class MySqlDaoManager implements DaoManager{
    
    private Dao_01_Auth DaoAuht = null;
    private Dao_02_Patient DaoPatient = null;
    
    protected String db_name, db_url , db_user, db_pass;
    protected java.sql.Connection connection_  = null;
    public MySqlDaoManager() throws SQLException{
        this.db_name = "UTP2020-DENTAL-SYSTEM-DEV"; 
        this.db_url = "jdbc:mysql://localhost:3306/"+ this.db_name; 
        this.db_user = "root"; 
        this.db_pass = "";
        connection_  = DriverManager.getConnection(this.db_url, this.db_user,this.db_pass);
    }

    @Override
    public Dao_01_Auth getDaoAuth() {
        if(DaoAuht == null){
            DaoAuht = new MySql_01_DaoAuth(connection_);
        }
        return DaoAuht;
    }

    @Override
    public Dao_02_Patient getDaoPatient() {
        if(DaoPatient == null){
            DaoPatient = new Mysql_02_DaoPatient(connection_);
        }
        return DaoPatient;
    }
    
    
}
