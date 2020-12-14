package WIN32CLC_TABLEMODELS;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_01_Auth;
import WIN31CLC_DTO.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

public class UserTableModel extends AbstractTableModel {

    private Dao_01_Auth User_e;

    private List<User> datos = new ArrayList<>();

    public UserTableModel(Dao_01_Auth pronosticDao) {
        this.User_e = pronosticDao;
    }

    public void updateModel() throws DaoException {
        datos = User_e.findAll(0);
    }
    // Estos son los tipos de datos de cada columna de la lista
    final Class[] tiposColumnas = new Class[]{
        java.lang.Integer.class,
        java.lang.String.class,
        java.lang.String.class,
        java.lang.String.class,
        JButton.class // <- noten que aquí se especifica que la última columna es un botón
    };

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Usuario";
            case 2:
                return "Contraseña";
            case 3:
                return "Rol";
            case 4:
                return "Option";
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
        return 5; // retuna la cantidad de columnas que tendra la tabla
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User dto = datos.get(rowIndex);

        String valor = "";
        if (dto.getRole().equals("1")) {
            valor = "Administrador";
        } else if (dto.getRole().equals("2")) {
            valor = "Recepcionista";
        } else {
            valor = "";
        }

        switch (columnIndex) {

            case 0:
                return dto.getId();
            case 1:
                return dto.getUsername();
            case 2:
                return dto.getPassword();
            case 3:
                return valor;
            case 4:
                return new JButton("Eliminar");
            default:
                return "";
        }
    }

}
