/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN_2020_UTILS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Cesar
 */
public class Validators {
    
    public static boolean esEmail(String correo) {
         // Patrón para validar el email
         Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
         Matcher mather = pattern.matcher(correo);
         return mather.find();
    }
    
    public static boolean inputStringIngresado(String val){
        return val.length()>3? true : false;
    }
}
