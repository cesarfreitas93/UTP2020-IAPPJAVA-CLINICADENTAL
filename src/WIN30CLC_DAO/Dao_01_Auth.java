/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN30CLC_DAO;

import WIN31CLC_DTO.User;

/**
 *
 * @author Cesar
 */
public interface Dao_01_Auth  extends Dao<User, Long> {
    public User ChekAuth(String username, String password) throws DaoException;
}
