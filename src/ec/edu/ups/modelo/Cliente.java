/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Dutan2000
 */
public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private List<Vehiculo> vehiculo;

    //constructor
    public Cliente() {
        vehiculo=new ArrayList<>();
    }

    public Cliente(String cedula, String nombre, String apellido, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        vehiculo=new ArrayList<>();
    }
    
    
    //get y set

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void agregarVehiculo(/*anadir tipo*/){
        
    }
    public void editarVehiculo(/*anadir tipo*/){
        
    }
    public void eliminarVehiculo(/*anadir tipo*/){
        
    }
    public void verVehiculo(/*anadir tipo*/){
        
    }
    public void listarVehiculo(/*anadir tipo*/){
        
    }

    //hashCode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }  
    
}
