
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_09_Comprobante_Detalle;
import WIN31CLC_DTO.Citas;
import WIN31CLC_DTO.CitasPatient;
import WIN31CLC_DTO.Comprobante_Detalle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class MySql_09_DaoComprobante_Detalle implements Dao_09_Comprobante_Detalle{

      private Connection conn;
      final String INSERT = "INSERT INTO comprobantedetalle (descripcion, precio, igv, total, comprantes_id)\n" +
"values (?,?,?,?,?);";
    public MySql_09_DaoComprobante_Detalle(Connection conn) {
        this.conn = conn;
    }
    @Override
    public boolean InsertarDetalle(List<CitasPatient> CitasPatient, long id_cabecera) throws DaoException {
        for (int i = 0; i < CitasPatient.size(); i++) {
            if(CitasPatient.get(i).isSelected())
            {
                // insertar al abd
                    PreparedStatement pst = null;
                    ResultSet rs = null;
                    try {
                        pst = (PreparedStatement) conn.prepareStatement(INSERT);
                        pst.setString(1, "");
                        pst.setDouble(2, CitasPatient.get(i).getPrecio());
                        pst.setDouble(3, 18);
                        pst.setDouble(4, (CitasPatient.get(i).getPrecio() * 0.18)+ CitasPatient.get(i).getPrecio() );
                        pst.setLong(5, id_cabecera);

                        if (pst.executeUpdate() == 0) {
                            throw new DaoException("Puede que no se haya guardado.");
                        }

                    } catch (SQLException ex) {
                        throw new DaoException("Error en SQL", ex);
                    } finally {
                        if (rs != null) {
                            try {
                                rs.close();
                            } catch (SQLException ex) {
                                new DaoException("Error en SQL", ex);
                            }
                        }
                        if (pst != null) {
                            try {
                                pst.close();
                            } catch (SQLException ex) {
                                throw new DaoException("Error en SQL", ex);
                            }
                        }
                    }
            }
        }
        
        return true;
    }


}
