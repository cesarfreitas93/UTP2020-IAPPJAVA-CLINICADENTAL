/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN_2020_UTILS;

import WIN31CLC_DTO.Config;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/**
 *
 * @author Cesar
 */
public class ConfigReader {
	Config result = new Config();
	InputStream inputStream;

	public Config getPropValues() throws IOException {
 
		try {
			Properties prop = new Properties();
			String propFileName = "win36clc.properties";
 
                        inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
 
			// get the property value and print it out
			result.setMySqlDAOMANAGER_db_name(prop.getProperty("MySqlDAOMANAGER.db_name"));
                        result.setMySqlDAOMANAGER_db_server(prop.getProperty("MySqlDAOMANAGER.db_server"));
                        result.setMySqlDAOMANAGER_db_user(prop.getProperty("MySqlDAOMANAGER.db_user"));
                        result.setMySqlDAOMANAGER_db_pass(prop.getProperty("MySqlDAOMANAGER.db_pass"));
                        result.setPathMysql(prop.getProperty("pathMysql"));
                        result.setPathMysqlDump(prop.getProperty("patchMysqlDump"));
                        
		} catch (Exception e) {
			//System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
}
