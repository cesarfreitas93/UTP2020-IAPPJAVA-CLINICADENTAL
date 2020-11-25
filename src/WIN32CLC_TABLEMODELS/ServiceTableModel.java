package WIN32CLC_TABLEMODELS;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_03_Services;
import WIN31CLC_DTO.Service;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

public class ServiceTableModel extends AbstractTableModel{
    private Dao_03_Services service;
    
    private List<Service> datos = new ArrayList<>();
    
    public ServiceTableModel(Dao_03_Services serviceDao){
        this.service = serviceDao;
    }
    
    public void updateModel() throws DaoException{
        datos = service.findAll(0);
    }
    // Estos son los tipos de datos de cada columna de la lista
    final Class[] tiposColumnas = new Class[]{
        java.lang.Integer.class,
        java.lang.String.class,        
        java.lang.Double.class,
        JButton.class // <- noten que aquí se especifica que la última columna es un botón
    };
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Id";
            case 1: return "Nombre";
            case 2: return "Precio";
            case 3: return "Option";
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
        return 4; // retuna la cantidad de columnas que tendra la tabla
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Service dto = datos.get(rowIndex);

        switch(columnIndex){
            case 0: return dto.getId();
            case 1: return dto.getName();
            case 2: return dto.getPrice();
            case 3: return new JButton("Eliminar");
            default: return "";
        }
    }
    
}
