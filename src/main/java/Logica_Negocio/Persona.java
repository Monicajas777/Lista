/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class Persona {
    
     public String nombre, Apellido, cedula, direccion;
    public ArrayList<Computador> listacompus;

    public Persona() {
    }

    public Persona(String nombre, String Apellido, String cedula, String direccion, ArrayList<Computador> listacompus) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.listacompus = listacompus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Computador> getListacompus() {
        return listacompus;
    }

    public void setListacompus(ArrayList<Computador> listacompus) {
        this.listacompus = listacompus;
    }
    
    
    
}
