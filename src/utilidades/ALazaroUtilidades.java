/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author aleja
 */
public class ALazaroUtilidades {

    public static boolean compruebaCampoVacio(JTextField campo) {
        return "".equals(campo.getText().trim());
    }

    public static void ventanaCampoVacio(JTextField campo) {
        JOptionPane.showMessageDialog(null, "El " + campo.getName() + " es obligatorio");
        campo.setBackground(Color.red);

    }

    public static boolean compruebaEntero(JTextField campo) {

        try {
            Integer.parseInt(campo.getText().trim());
            return false;
        } catch (NumberFormatException ex) {
            return true;
        }
    }

    public static boolean compruebaDouble(JTextField campo) {

        try {
            Double.parseDouble(campo.getText().trim());
            return false;
        } catch (NumberFormatException ex) {
            return true;
        }
    }

    
    
    
    public static boolean compruebaComboVacio(JComboBox combo) {
        return combo.getSelectedIndex() == 0;
    }

    
    
    
    public static void ventanaComboVacio(JComboBox combo) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento en el desplegable  " + combo.getName());
        combo.setBackground(Color.red);

    }

    
    
    
    static String patronDNI = "[0-9]{8}[A-Za-z]{1}";

    public static boolean compruebaDni(JTextField campo) {
        if (campo.getText().matches(patronDNI)) {
            return false;
        } else {
            return true;
        }

    }
    
    
    
    
    
    static String patronCP = "[0-9]{5}";

    public static boolean compruebaCP(JTextField campo) {
        if (campo.getText().matches(patronCP)) {
            return false;
        } else {
            return true;
        }

    }
    
    
       static String patronfecha = "[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}";
    
        public static boolean compruebaFecha(JTextField campo) {
        if (campo.getText().matches(patronfecha)) {
            return false;
        } else {
            return true;
        }

    }
    
    
    
    
    static String patronTlf = "[0-9]{9}";

    public static boolean compruebaTlf(JTextField campo) {
        if (campo.getText().matches(patronTlf)) {
            return false;
        } else {
            return true;
        }

    }

    public static void mensajeEntero(JTextField campo) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero valido en el campo  " + campo.getName());
        campo.setBackground(Color.red);
    }
    
    
    

    public static void mensajeDouble(JTextField campo) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un numero decimal valido en el campo  " + campo.getName());
        campo.setBackground(Color.red);
    }

    
    
    
    
    public static boolean numeroPositivo(JTextField campo) {
        if (Integer.parseInt(campo.getText()) < 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
     public static void mensajePositivo(JTextField campo) {
        JOptionPane.showMessageDialog(null, "El campo"+campo.getName()+" tiene que ser positiva");
        campo.setBackground(Color.red);
    }

}
