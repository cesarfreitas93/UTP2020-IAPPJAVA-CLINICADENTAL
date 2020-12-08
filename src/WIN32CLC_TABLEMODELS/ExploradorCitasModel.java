/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_TABLEMODELS;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_05_Citas;
import WIN31CLC_DTO.Citas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cesar
 */
public class ExploradorCitasModel extends AbstractTableModel {
    private Dao_05_Citas citas;
    private int total_registros_bd;
    private int paginas_page;
    private List<Citas> datos = new ArrayList<>();

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
    public ExploradorCitasModel(Dao_05_Citas dao) {
        this.citas = dao;
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
        java.lang.String.class};

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Fecha registro";
            case 2:
                return "DNI";
            case 3:
                return "Paciente";
            case 4:
                return "Médico";
            case 5:
                return "Servicio";
            case 6:
                return "Fecha de Cita";
            case 7:
                return "Hora Inicio";
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
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Citas dto = datos.get(rowIndex);

        String name = dto.getPatient().getName() + " " + dto.getPatient().getLastname() + " " + dto.getPatient().getSurename();
        switch (columnIndex) {
            case 0:
                return dto.getId();
            case 1:
                return dto.getFecha_Registro();
            case 2:
                return dto.getPatient().getDni();
            case 3:
                return dto.getPatient().getName();
            case 4:
                return dto.getSpecialist().getName();
            case 5:
                return dto.getService().getName();
            case 6: 
                return dto.getFecha_cita();
            case 7:
                return dto.getHora_inicio();
            default:
                return "";
        }

    }

    public void updateModel(String filtro, int rowShow, int pagenumber) throws DaoException {
        datos = citas.Explorador(filtro, rowShow, pagenumber);
        if(datos.size()>0){
            this.setTotal_registros_bd(datos.get(0).getTotal());
            this.setPaginas_page(datos.get(0).getTotalpages());
        }
    }   
}