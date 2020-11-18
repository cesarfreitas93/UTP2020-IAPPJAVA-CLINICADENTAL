
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_03_Services;
import WIN31CLC_DTO.Service;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MySql_03_DaoService implements Dao_03_Services {
    final String INSERT = "INSERT INTO services (`name`, `price`) VALUES (?,?)";
    final String UPDATE = "UPDATE services set `name` = ?, `price` = ? WHERE `id` = ?";
    final String FINDALL = "SELECT `id`,`name`,`price` FROM `services`";
    final String FINDBYID = "SELECT `id`,`name`,`price` FROM `services` WHERE `id` = ?";
    final String DELETE = "UPDATE services set `enable` = 0 WHERE id=?";
    private Connection conn;
    public MySql_03_DaoService(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public void rlInsert(Service entity) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{

            pst = (PreparedStatement) conn.prepareStatement(INSERT, new String[]{"id"});
            pst.setString(1, entity.getName());
            pst.setDouble(2, entity.getPrice());

            if(pst.executeUpdate() == 0){
                throw new DaoException("Puede que no se haya guardado.");
            }
            
            
            try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    entity.setId((int) generatedKeys.getLong(1));
                }
                else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
            
        }
        catch (SQLException ex) {
            throw new DaoException("Error en SQL", ex);
        }
        finally{
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
                    throw new DaoException("Error en SQL", ex);
                }
            }
        } 
    }

    @Override
    public void rlUpdate(Service entity) throws DaoException {
        PreparedStatement pst = null;
        try{
            pst = (PreparedStatement) conn.prepareStatement(UPDATE);
            pst.setString(1, entity.getName());
            pst.setDouble(2, entity.getPrice());
            pst.setLong(3, entity.getId());

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
    public void rlDelete(Service entity) throws DaoException {
        PreparedStatement pst = null;
        try{
            pst = (PreparedStatement) conn.prepareStatement(DELETE);
            pst.setLong(1, entity.getId());

            if(pst.executeUpdate() == 0){
                throw new DaoException("Puede que no se haya eliminado.");
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

    private Service Convert_(ResultSet rs) throws SQLException{
        //`name`, `descript`, `createAt`, `updateAt`, `status`, `company_id`, `user_id`
        int id = rs.getInt("id");
        String name = rs.getString("name");
        double price = rs.getDouble("price");
        Service dto = new Service(id, name, price);
        return dto;
    }
    @Override
    public List<Service> findAll(int id) throws DaoException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Service> list = new ArrayList<Service>();
        try{
            pst = (PreparedStatement) conn.prepareStatement(FINDALL);
            pst.setLong(1, id);
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
        return list;
    }

    @Override
    public Service findById(Service entity) throws DaoException {

        PreparedStatement pst = null;
        ResultSet rs = null;
        Service dto = null;
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
