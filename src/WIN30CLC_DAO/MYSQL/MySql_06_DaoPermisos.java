
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_06_Permisos;
import WIN31CLC_DTO.Permisos;
import WIN31CLC_DTO.Service;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MySql_06_DaoPermisos implements Dao_06_Permisos{

    final String FINDBYID = "select per.* from user as usr inner join permisos "
            + "as per on per.user_id = usr.id where per.user_id = ?";
    private Connection conn;
    @Override
    public void rlInsert(Permisos entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rlUpdate(Permisos entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rlDelete(Permisos entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Permisos Convert_(ResultSet rs) throws SQLException{
        //`name`, `descript`, `createAt`, `updateAt`, `status`, `company_id`, `user_id`
        Permisos dto = new Permisos();
        dto.setId(rs.getLong("id"));
        dto.setName(rs.getString("name"));
        dto.setUser_id(rs.getLong("user_id"));
        dto.setWindow_id(rs.getLong("window_id"));   
        return dto;
    }
    @Override
    public List<Permisos> findAll(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Permisos findById(Permisos entity) throws DaoException {
  PreparedStatement pst = null;
        ResultSet rs = null;
        Permisos dto = null;
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
    }}
    

