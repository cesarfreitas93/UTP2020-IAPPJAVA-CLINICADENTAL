package WIN_2020_UTILS;

import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class Validators {

    public static boolean esEmail(String correo) {
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }

    public static boolean inputStringIngresado(String val) {
        return val.length() > 2 ? true : false;
    }

    public static boolean isNullOrEmpty(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    public static int getSelectedButtonIndex(ButtonGroup buttonGroup) {
        int a = 0;
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            a++;
            if (button.isSelected()) {
                return a;
           } 
 //           else {
//                a = 0;
//                return a;
//            }
        }

        return a;
    }
    /*
    public boolean validacion_columnas_filas_escalar_multiplicacion() {
        boolean _Validador = true;
        StringBuilder obj_mensaje = new StringBuilder();
        if (isNullOrEmpty(txt_matriz_a_esc.getText().trim())) {
            _Validador = false;
            obj_mensaje.append("\nIngrese Valor Matriz Columna A ");
        }
        if (!txt_matriz_a_esc.getText().trim().matches("[0-9]*")) {
            _Validador = false;
            obj_mensaje.append("\nIngrese Valor Numerico No se Acepta Letras En La Dimencion Columna A");
        }

        if (!_Validador) {
            JOptionPane.showMessageDialog(null, obj_mensaje.toString(), "Validacion Ingreso de datos", JOptionPane.ERROR_MESSAGE);
        }

        return _Validador;
    }
    
     */

}
