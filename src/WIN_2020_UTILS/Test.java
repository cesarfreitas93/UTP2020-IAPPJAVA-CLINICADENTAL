/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN_2020_UTILS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author Cesar
 */
public class Test {
    /**
	 * Java Code to export MySQL database
	 * @param ip MySQL IP address of the server where the database is located
	 * @param host Database port number
	 * @param userName User name required to enter the database
	 * @param password Password required to enter the database
	 * @param databaseName Database name to export
	 * @param savePath Database export file save path
	 * @param fileName Database export file name
	 * @return Return true to indicate successful export, otherwise return false.
	 * @throws IOException 
	 */
	public static void exportDatabaseTool(String ip, String host, String userName, String password, String databaseName, String savePath, String fileName) throws IOException {
		File saveFile = new File(savePath);
		if (!saveFile.exists()) {// If the directory does not exist
			saveFile.mkdirs();// create folder
		}
		if(!savePath.endsWith(File.separator)){
			savePath = savePath + File.separator;
		}

		PrintWriter printWriter = null;
		BufferedReader bufferedReader = null;
		try {
			printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(savePath + fileName), "utf8"));
			Process process = Runtime.getRuntime().exec("C:/wamp/bin/mysql/mysql5.7.28/bin/mysqldump -h" + ip + " -P" + host + " -u" + userName + " -p" + password + " --default-character-set=utf8 " + databaseName);
			InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream(), "utf8");
			bufferedReader = new BufferedReader(inputStreamReader);
			String line;
			while((line = bufferedReader.readLine())!= null){
				printWriter.println(line);
			}
			printWriter.flush();
			/*if(process.waitFor() == 0){//0 Indicates that the thread is terminated normally.
				return true;
			}*/
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (printWriter != null) {
					printWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//return false;
	}
}
