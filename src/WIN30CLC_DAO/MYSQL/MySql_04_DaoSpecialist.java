/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO.MYSQL;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_04_Specialist;
import WIN31CLC_DTO.Specialist;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class MySql_04_DaoSpecialist implements Dao_04_Specialist{
    final String INSERT = "insert into services (name, price) values (?,?)";
    final String UPDATE = "update services set name = ?, price = ? where id = ?";
    final String FINDALL = "SELECT id, name, price FROM services";
    final String FINDBYID = "select id, name, price from service where id  = ?";
    private Connection conn;
    
    public MySql_04_DaoSpecialist(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void rlInsert(Specialist entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rlUpdate(Specialist entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rlDelete(Specialist entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Specialist> findAll(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Specialist findById(Specialist entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
