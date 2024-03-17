/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.recepciondeordenes;
import java.util.Random;
/**
 *
 * @author poppe
 */
public class ColaDeClientes {
    //Maneja la cola de clientes 
    ListaDeClientes llamadas = new ListaDeClientes();
    Cola listaClientes = new Cola();
    
    public ColaDeClientes(){
        ListaDeClientes llamadas = new ListaDeClientes();
    }
    
    public void agregarCliente(){
        Random rmd = new Random();
        Cliente nuevo = new Cliente(llamadas.regresarNombre(),rmd.nextInt(20));
        if(nuevo.getNombre().equals("Jesús de Nazaret") || nuevo.getNombre().equals("María de Betania")){
            listaClientes.reOrganizar(nuevo);
        } else{
        listaClientes.insertarDato(nuevo);
        }
    }
    
    public Cliente regresarCliente(){
        return listaClientes.eliminarDato();
    }
}
