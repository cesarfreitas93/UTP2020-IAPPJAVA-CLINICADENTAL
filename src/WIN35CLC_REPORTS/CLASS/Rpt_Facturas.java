/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN35CLC_REPORTS.CLASS;

import WIN_2020_UTILS.ConfigReader;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Cesar
 */
public class Rpt_Facturas {
    protected ConfigReader properties = null;
    protected String db_name, db_url , db_user, db_pass;
    Connection conexion = null;
    public Rpt_Facturas() throws IOException {
        try {
            properties = new ConfigReader();
            this.db_url = properties.getPropValues().getMySqlDAOMANAGER_db_server();
            this.db_user = properties.getPropValues().getMySqlDAOMANAGER_db_user();
            this.db_pass = properties.getPropValues().getMySqlDAOMANAGER_db_pass();
            conexion = (Connection) DriverManager.getConnection(this.db_url, this.db_user, this.db_pass);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public void CallExplorerRPT(String filtro, int rows,int page) {
        try {
            String master = System.getProperty("user.dir") + "\\src\\WIN35CLC_REPORTS\\rpt_facturas.jasper";
//            InputStream stream = this.getClass().getResourceAsStream("\\src\\reportes\\repoteListaPacientes.jasper");//aquí le pones la ruta de tu reporte
//            InputStream stream2 = this.getClass().getResourceAsStream("\\src\\reportes\\repoteListaPacientes.jasper");//aquí le pones la ruta de tu reporte

            System.out.println("stream" + master);

            if (master == null) {
                JOptionPane.showMessageDialog(null, "No se encuentra el archivo \n del reporte maestro");
                System.exit(2);
            }

            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObjectFromFile(master);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, "Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }

            //este es el parametro, se pueden agregar mas parametros
            Map parametro = new HashMap();
            parametro.put("filtro", filtro);
            parametro.put("rows", 1000);
            parametro.put("page", page - 1);
            //Reporte diseñado y compilado con iReport
//            JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parametro,conexion);
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, conexion);
            //System.out.println(fecha);

            //se lanza el Viewer de Jasper, no termina aplicacion al salir
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle("Dental Sys V.1.1 CLC");
            jviewer.setVisible(true);
        } catch (Exception j) {
            System.out.println("Mensaje de Error: " + j.getMessage());
        }
    }
}
