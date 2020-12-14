/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN31CLC_DTO;

/**
 *
 * @author Carlos Jimenez Gomez
 */
public class declaraciones {
    private  static   WIN31CLC_DTO.User global_User = new WIN31CLC_DTO.User(); 

    public declaraciones() {
    }

    public static User getGlobal_User() {
        return global_User;
    }

    public static void setGlobal_User(User global_User) {
        declaraciones.global_User = global_User;
    }
    
    
    
    
}
