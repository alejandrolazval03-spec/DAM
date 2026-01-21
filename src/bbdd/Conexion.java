/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import javax.swing.JComboBox;
import modelo.ALazaroMascotas;



/**
 *
 * @author aleja
 */
 public class Conexion {

    /**
     *Se establece la conexion con la base de datos asi como el cierre 
     * tambien gestiona la consulta con las tablas
     */
    public static Connection conn;
     
    /**
     *   establece conexion a la base de datos n
     */
    public static void Conectar(){
 
    try {
    Class.forName("com.mysql.jdbc.Driver");
    
    conn= DriverManager.getConnection
            ("jdbc:mysql://195.35.53.72/u812167471_mascotas",
                        "u812167471_mascotas",
                        "2026-Mascotas");
    }catch(ClassNotFoundException | SQLException ex){
    System.getLogger(Conexion.class.getName()).log(System.Logger.Level.ERROR,(String) null, ex);
    }
    
    
    }
    
    /**
     * cierra la conexion con la la base de datos
     */
    public static void cerrar() {
// cierra la conexxion con la bbdd
      
        try {
             conn.close();
        } catch (SQLException ex) {
            System.getLogger(Conexion.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
     

    } 
    
    /**
     *
     * @param usuario
     * @param contrasenya
     * @return
     *  es el metodo que conecta con la tabla de usuarios para consulta del login     

     */
    public static boolean acceder(String usuario, String contrasenya) {

        
        try { 
            String consulta =
                    "SELECT usuario, pass "
                    + "FROM usuarios WHERE usuario=? "
                    + "AND pass=?";
            
            
            PreparedStatement pst;
            ResultSet rs;
            
            pst = conn.prepareStatement(consulta);

            pst.setString(1, usuario);
            pst.setString(2, contrasenya);

            rs = pst.executeQuery();

            return rs.next();
            
            
        } catch (SQLException ex) {
            System.getLogger(Conexion.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        return false;

    }

    /**
     *  consulta con la ta tabla veterinario para  mostralo en el combobox
     * 
     * @param combo
     */
    public static void cargaComboVeterinario (JComboBox combo){ 
        
        try {
     
            String consulta = "SELECT nombre FROM veterinarios ORDER BY nombre";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(consulta);

            while (rs.next()) {

                combo.addItem(rs.getString("nombre"));

            }
        } catch (SQLException ex) {
            System.getLogger(Conexion.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
         
    }

    /**
     *consulta con la ta tabla vacuna para  mostralo en el combobox
     * @param combo
     */
    public static void cargaComboVacunas (JComboBox combo){ 
        
        try {
     
            String consulta = "SELECT vacuna FROM vacuna ORDER BY vacuna";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(consulta);

            while (rs.next()) {

                combo.addItem(rs.getString("vacuna"));

            }
        } catch (SQLException ex) {
            System.getLogger(Conexion.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
         
    }
   
    /**
     *consulta con la ta tabla razas para  mostralo en el combobox
     * @param combo
     */
    public static void cargaComboRazas (JComboBox combo){ 
        
        try {
     
            String consulta = "SELECT raza FROM razas ORDER BY raza";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(consulta);

            while (rs.next()) {

                combo.addItem(rs.getString("raza"));

            }
        } catch (SQLException ex) {
            System.getLogger(Conexion.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
         
    }
 
    /**
     *consulta con la ta tabla capas para  mostralo en el combobox
     * @param combo
     */
    public static void cargaComboCapas (JComboBox combo){ 
        
        try {
     
            String consulta = "SELECT capa FROM capas ORDER BY capa";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(consulta);

            while (rs.next()) {

                combo.addItem(rs.getString("capa"));

            }
        } catch (SQLException ex) {
            System.getLogger(Conexion.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
         
            }

    /**
     *abre la tabla tabla mascota para insertar los datos del constructo  
     * @param m
     * @return
     */
    public static boolean insertarMascota(ALazaroMascotas m) {

   
        try {
            String consulta = 
                    "INSERT INTO perros (raza, sexo, capa, nombre,edad,veterinario,vacuna)"
                    + "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(consulta);

            pst.setString(1, m.getRaza());
            pst.setString(2, m.getSexo());
            pst.setString(3, m.getCapa());
            pst.setString(4, m.getNombre());
            pst.setInt(5, m.getEdad());
            pst.setString(6, m.getVeterinario());
            pst.setString(7, m.getVacuna());
            pst.execute();
            return true;
            
            
        } catch (SQLException ex) {
            System.getLogger(Conexion.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
         return false;

    }
 }



