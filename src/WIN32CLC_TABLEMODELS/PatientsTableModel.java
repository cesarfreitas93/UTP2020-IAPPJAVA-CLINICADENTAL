/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_TABLEMODELS;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_02_Patient;
import WIN31CLC_DTO.Patient;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cesar
 */
public class PatientsTableModel extends AbstractTableModel{
    private Dao_02_Patient patient;
    
    private List<Patient> datos = new ArrayList<>();
    
    public PatientsTableModel(Dao_02_Patient pronosticDao){
        this.patient = pronosticDao;
    }
    
    public void updateModel() throws DaoException{
        datos = patient.findAll(0);
    }
    // Estos son los tipos de datos de cada columna de la lista
    final Class[] tiposColumnas = new Class[]{
        java.lang.Integer.class,
        java.lang.String.class,        
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,

        JButton.class // <- noten que aquí se especifica que la última columna es un botón
    };
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Id";
            case 1: return "DNI";
            case 2: return "Nombre";
            case 3: return "Telefono";
            case 4: return "E-Mail";
            case 5: return "Dirección";
            case 6: return "Option";
            default: return "[no*]";
        }
    }
    Class[] tipos = tiposColumnas;
    @Override
    public Class getColumnClass(int columnIndex) {
        // Este método es invocado por el CellRenderer para saber que dibujar en la celda,
        // observen que estamos retornando la clase que definimos de antemano.
        return tipos[columnIndex];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        // Sobrescribimos este método para evitar que la columna que contiene los botones sea editada.
        return !(this.getColumnClass(column).equals(JButton.class));
    }
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 7; // retuna la cantidad de columnas que tendra la tabla
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Patient dto = datos.get(rowIndex);
        //DateFormat df = DateFormat.getDateInstance();

        String name =  dto.getName() + " " + dto.getLastname() + " " + dto.getSurename();
        switch(columnIndex){
            case 0: return dto.getId();
            case 1: return dto.getDni();
            case 2: return name;
            case 3: return dto.getPhone();
            case 4: return dto.getEmail();
            case 5: return dto.getAddress();
            case 6:
                return new JButton("Editar");
            default: return "";
        }
    }
    
}
