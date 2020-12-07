package WIN32CLC_TABLEMODELS;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_05_Citas;
import WIN31CLC_DTO.Citas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

public class CitasTableModel extends AbstractTableModel {

    private Dao_05_Citas citas;

    private List<Citas> datos = new ArrayList<>();

    public CitasTableModel(Dao_05_Citas dao) {
        this.citas = dao;
    }

    public void updateModel(int id_status) throws DaoException {
        datos = citas.findAll(id_status);
    }
    // Estos son los tipos de datos de cada columna de la lista
    final Class[] tiposColumnas = new Class[]{
        java.lang.Integer.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class};

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Nombre Cliente";
            case 2:
                return "Nombre Servicio";
            case 3:
                return "Nombre Especialista";
            default:
                return "[no*]";

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
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 4; // retuna la cantidad de columnas que tendra la tabla

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Citas dto = datos.get(rowIndex);

        String name = dto.getPatient().getName() + " " + dto.getPatient().getLastname() + " " + dto.getPatient().getSurename();
        switch (columnIndex) {
            case 0:
                return dto.getId();
            case 1:
                return name;
            case 2:
                return dto.getService().getName();
            case 3:
                return dto.getSpecialist().getName();
            default:
                return "";
        }

    }

}
