/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_TABLEMODELS;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_08_Comprobante;
import WIN31CLC_DTO.CitasPatient;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cesar
 */
public class CitasPatientTableModel  extends AbstractTableModel {

    private Dao_08_Comprobante dao;

    private List<CitasPatient> lista = new ArrayList<>();

    public CitasPatientTableModel(Dao_08_Comprobante dao) {
        this.dao = dao;
    }

    public List<CitasPatient> getLista() {
        return lista;
    }
    
    
    public void updateModel(long id) throws DaoException {
        lista = dao.getCitasByPatient(id);
    }
    
    public void updateModel(List<CitasPatient> list){
        lista = list;
    }
    // Estos son los tipos de datos de cada columna de la lista
    final Class[] tiposColumnas = new Class[]{
        java.lang.Boolean.class,
        java.lang.Integer.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.Double.class};

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Seleccionar";
            case 1:
                return "Código de Cita";
            case 2:
                return "Fecha de Cita";
            case 3:
                return "Hora Inicio";
            case 4:
                return "Hora Fin";
            case 5:
                return "Servicio";
            case 6:
                return "Médico";
            case 7:
                return "Precio";
            default:
                return "[no*]";

        }
    }
//    @Override
//    public boolean isCellEditable(int rowIndex, int columnIndex) {
////        if(columnIndex == 0){
////            return true;
////        }
////        else{
//            return false;
////        }
//    }

    @Override
    public Class getColumnClass(int columnIndex) {
        // Este método es invocado por el CellRenderer para saber que dibujar en la celda,
        // observen que estamos retornando la clase que definimos de antemano.
        return tipos[columnIndex];
    }
    Class[] tipos = tiposColumnas;
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CitasPatient dto = lista.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return dto.isSelected();
            case 1:
                return  dto.getId(); //dto.
            case 2:
                return dto.getFechaCita();//name;
            case 3:
                return dto.getHoraInicio(); //dto.getService().getName();
            case 4:
                return dto.getHoraFin();//dto.getSpecialist().getName()+ " "+dto.getSpecialist().getLastname()+" "+dto.getSpecialist().getSurename();
            case 5:
                return dto.getServicio();
            case 6:
                return dto.getSpecialista();
            case 7:
                return dto.getPrecio();
            default:
                return "";
                
                
        }

    }
    
}
