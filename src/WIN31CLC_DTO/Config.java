/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN31CLC_DTO;

/**
 *
 * @author Cesar
 */
public class Config {
    private String MySqlDAOMANAGER_db_name ;
    private String MySqlDAOMANAGER_db_server; 
    private String MySqlDAOMANAGER_db_user ;
    private String MySqlDAOMANAGER_db_pass;
    private String pathMysql;
    private String pathMysqlDump;
    public Config() {
    }

    public String getMySqlDAOMANAGER_db_name() {
        return MySqlDAOMANAGER_db_name;
    }

    public String getMySqlDAOMANAGER_db_server() {
        return MySqlDAOMANAGER_db_server;
    }

    public String getMySqlDAOMANAGER_db_user() {
        return MySqlDAOMANAGER_db_user;
    }

    public String getMySqlDAOMANAGER_db_pass() {
        return MySqlDAOMANAGER_db_pass;
    }

    public void setMySqlDAOMANAGER_db_name(String MySqlDAOMANAGER_db_name) {
        this.MySqlDAOMANAGER_db_name = MySqlDAOMANAGER_db_name;
    }

    public void setMySqlDAOMANAGER_db_server(String MySqlDAOMANAGER_db_server) {
        this.MySqlDAOMANAGER_db_server = MySqlDAOMANAGER_db_server;
    }

    public void setMySqlDAOMANAGER_db_user(String MySqlDAOMANAGER_db_user) {
        this.MySqlDAOMANAGER_db_user = MySqlDAOMANAGER_db_user;
    }

    public void setMySqlDAOMANAGER_db_pass(String MySqlDAOMANAGER_db_pass) {
        this.MySqlDAOMANAGER_db_pass = MySqlDAOMANAGER_db_pass;
    }

    public String getPathMysql() {
        return pathMysql;
    }

    public void setPathMysql(String pathMysql) {
        this.pathMysql = pathMysql;
    }

    public String getPathMysqlDump() {
        return pathMysqlDump;
    }

    public void setPathMysqlDump(String pathMysqlDump) {
        this.pathMysqlDump = pathMysqlDump;
    }
    
    
    
}
