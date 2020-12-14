
package WIN30CLC_DAO;

import WIN31CLC_DTO.User;

public interface Dao_01_Auth  extends Dao<User, Long> {
    public User ChekAuth(String username, String password) throws DaoException;

    public User Insert(User entity) throws DaoException;
}
