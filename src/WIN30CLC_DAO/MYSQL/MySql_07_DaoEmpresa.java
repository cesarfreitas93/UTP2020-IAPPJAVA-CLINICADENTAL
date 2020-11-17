
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_07_Empresa;
import WIN31CLC_DTO.Empresa;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MySql_07_DaoEmpresa implements Dao_07_Empresa {

    private Connection conn;

    public MySql_07_DaoEmpresa(Connection conn) {
        this.conn = conn;
    }

    final String INSERT = "insert into empresa (name , address, ruc, "
            + "ubigeo, phone, email, logo)values(?,?, ?, ?,?,?,?);";
    final String FINDALL = "select id, name , address, ruc, ubigeo, phone,"
            + " email, logo  from empresa";
    final String FINDBYID = "select id, name , address, ruc, ubigeo, phone, email, "
            + "logo  from empresa where id = ?";
    final String UPDATE = "update  name= ? , address= ?, ruc= ?, ubigeo= ?, phone= ?,"
            + " email= ?, logo  = ? from empresa where id = ?";

    @Override
    public void rlInsert(Empresa entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();

            pst = (PreparedStatement) conn.prepareStatement(INSERT, new String[]{"id"});
            pst.setString(1, entity.getName());
            pst.setString(2, entity.getAddress());
            pst.setString(3, entity.getRuc());
            pst.setString(4, entity.getUbigeo());
            pst.setString(5, entity.getPhone());
            pst.setString(6, entity.getEmail());
            pst.setString(7, entity.getLogo());

            if (pst.executeUpdate() == 0) {
                throw new DaoException("Puede que no se haya guardado.");
            }

            try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    entity.setId((int) generatedKeys.getLong(1));
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
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

    @Override
    public void rlUpdate(Empresa entity) throws DaoException {
       PreparedStatement pst = null;
        try{
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();
            
            pst = (PreparedStatement) conn.prepareStatement(UPDATE);
            pst.setString(1, entity.getName());
            pst.setString(2, entity.getAddress());
            pst.setString(3, entity.getRuc());
            pst.setString(4, entity.getUbigeo());
            pst.setString(5, entity.getPhone());
            pst.setString(6, entity.getEmail());
            pst.setString(7, entity.getLogo());
            pst.setLong(8, entity.getId());

            if(pst.executeUpdate() == 0){
                throw new DaoException("Puede que no se haya modificado.");
            }
        }
        catch (SQLException ex) {
            throw new DaoException("Error en SQL", ex);
        }
        finally{
            if(pst != null){
                try{
                    pst.close();
                }catch(SQLException ex){
                    throw new DaoException("Error en SQL", ex);
                }
            }
        }
    }
    @Override
    public void rlDelete(Empresa entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Empresa Convert_(ResultSet rs) throws SQLException{
        Empresa dto = new Empresa();
        dto.setId(rs.getLong("id"));
        dto.setName(rs.getString("name"));
        dto.setAddress(rs.getString("address"));
        dto.setRuc(rs.getString("ruc"));
        dto.setUbigeo(rs.getString("ubigeo"));
        dto.setPhone(rs.getString("phone"));
        dto.setEmail(rs.getString("enail"));
        dto.setLogo(rs.getString("logo"));
        return dto;
    }
    @Override
    public List<Empresa> findAll(int id) throws DaoException {
    PreparedStatement pst = null;
        ResultSet rs = null;
        List<Empresa> list = new ArrayList<Empresa>();
        try{
            pst = (PreparedStatement) conn.prepareStatement(FINDALL);
            rs = pst.executeQuery();
            System.out.println(rs);
            while(rs.next()){
                list.add(Convert_(rs));
            }
        }
        catch(SQLException ex){
            throw new DaoException("Error en SQL", ex);
        }finally{
           if(rs != null){
               try{
                   rs.close();
               }
               catch(SQLException ex){
                   new DaoException("Error en SQL", ex); 
               }
           }
           if(pst != null){
               try{
                   pst.close();
               }catch(SQLException ex){
                   new DaoException("Error en SQL", ex);
               }
           }
        }
        return list;    }

    @Override
    public Empresa findById(Empresa entity) throws DaoException {
          PreparedStatement pst = null;
        ResultSet rs = null;
        Empresa dto = null;
        try{
            pst = (PreparedStatement) conn.prepareStatement(FINDBYID);
            pst.setLong(1, entity.getId());
            rs = pst.executeQuery();
            if(rs.next()){
                dto = Convert_(rs);
            }else{
                throw new DaoException("No se ha encontrado el registro");
            }
        }
        catch(SQLException ex){
            throw new DaoException("Error en SQL", ex);
        }finally{
           if(rs != null){
               try{
                   rs.close();
               }
               catch(SQLException ex){
                   new DaoException("Error en SQL", ex); 
               }
           }
           if(pst != null){
               try{
                   pst.close();
               }catch(SQLException ex){
                   new DaoException("Error en SQL", ex);
               }
           }
        }
        return dto;
    }

}
