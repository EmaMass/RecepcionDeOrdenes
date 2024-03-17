/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.recepciondeordenes;

/**
 *
 * @author poppe
 */
public class Cliente {
    String nombre;
    int productos;
    
    public Cliente(String nombre, int productos){
        this.nombre = nombre;
        this.productos = productos;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setProductos(int productos){
        this.productos = productos;
    }
    
    public int getProductos(){
        return productos;
    }
}
