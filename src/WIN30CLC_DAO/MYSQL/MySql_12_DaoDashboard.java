/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_12_Dashboard;
import WIN31CLC_DTO.Dashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cesar
 */
public class MySql_12_DaoDashboard implements Dao_12_Dashboard{
    private Connection conn;
//
    public MySql_12_DaoDashboard(Connection conn) {
        this.conn = conn;
    }
//
    @Override
    public Dashboard GetInfo() throws DaoException {
     PreparedStatement pst = null;
        ResultSet rs = null;
        Dashboard dto = null;
        try {
            pst = (PreparedStatement) conn.prepareStatement("call dashboard()");
            rs = pst.executeQuery();
            if (rs.next()) {
                dto = Convert_(rs);
            } else {
                throw new DaoException("No se ha encontrado el registro");
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
                    new DaoException("Error en SQL", ex);
                }
            }
        }
        return dto;
    }

    private Dashboard Convert_(ResultSet rs) throws SQLException {
        Dashboard dto = new Dashboard();
        
        dto.setCantidad_pacientes(rs.getInt("ipacientes"));
        dto.setCitasvigentes(rs.getInt("ivigentes"));
        dto.setCitasvencidas(rs.getInt("ivencidas"));
        dto.setCitasprogramadas(rs.getInt("ireprogramadas"));
        return dto;
    }
    
}
