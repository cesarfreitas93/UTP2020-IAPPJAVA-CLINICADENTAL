/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_TABLEMODELS;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_08_Comprobante;
import WIN31CLC_DTO.Citas;
import WIN31CLC_DTO.ComprobanteReporte;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cesar
 */
public class ExploradorComprobantes extends AbstractTableModel {
    private Dao_08_Comprobante comprobantes;
    private int total_registros_bd;
    private int paginas_page;
    private List<ComprobanteReporte> datos = new ArrayList<>();

    public int getTotal_registros_bd() {
        return total_registros_bd;
    }

    public int getPaginas_page() {
        return paginas_page;
    }

    public void setTotal_registros_bd(int total_registros_bd) {
        this.total_registros_bd = total_registros_bd;
    }

    public void setPaginas_page(int paginas_page) {
        this.paginas_page = paginas_page;
    }
    public ExploradorComprobantes(Dao_08_Comprobante dao) {
        this.comprobantes = dao;
    }

    
    // Estos son los tipos de datos de cada columna de la lista
    final Class[] tiposColumnas = new Class[]{
        java.lang.Integer.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class, 
        java.lang.String.class,
        java.lang.String.class, 
        java.lang.String.class};

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Serie";
            case 2:
                return "Numero";
            case 3:
                return "Ruc";
            case 4:
                return "fechaemision";
            case 5:
                return "dni";
            case 6:
                return "cliente";
            case 7:
                return "email";
            case 8:
                return "phone";
            case 9:
                return "address";
            default:
                return "[no*]";

        }
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        // Este método es invocado por el CellRenderer para saber que dibujar en la celda,
        // observen que estamos retornando la clase que definimos de antemano.
        return tipos[columnIndex];
    }
    Class[] tipos = tiposColumnas;
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        ComprobanteReporte dto = datos.get(i);

        switch (i1) {
            case 0:
                return dto.getId();
            case 1:
                return dto.getSerie();
            case 2:
                return dto.getNumero();
            case 3:
                return dto.getRuc();
            case 4:
                return dto.getFecha();
            case 5:
                return dto.getDni();
            case 6: 
                return dto.getCLiente();
            case 7:
                return dto.getEmail();
                
            case 8: 
                return dto.getPhone();
            case 9:
                return dto.getAddress();
            default:
                return "";
        }
    }
    
    public void updateModel(String filtro, int rowShow, int pagenumber) throws DaoException {
        datos = comprobantes.Explorador(filtro, rowShow, pagenumber);
        if(datos.size()>0){
            this.setTotal_registros_bd(datos.get(0).getTotal());
            this.setPaginas_page(datos.get(0).getTotalpages());
        }
    }   
}
