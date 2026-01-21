/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aleja
 */
public class ALazaroMascotas {
   
    private String raza;
    private String sexo;
    private String capa;
    private String nombre;
    private int edad; 
    private String veterinario;
    private String vacuna;

    public ALazaroMascotas(String raza, String sexo, String capa, String nombre, int edad, String veterinario, String vacuna) {
        this.raza = raza;
        this.sexo = sexo;
        this.capa = capa;
        this.nombre = nombre;
        this.edad = edad;
        this.veterinario = veterinario;
        this.vacuna = vacuna;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nRaza: " + raza+ "\nSexo: " + sexo + "\nCapa: " + capa  
                + "\nEdad: " + edad + "\nVeterinario:" + veterinario + "\nVacuna" + vacuna ;
    }

}
   
