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
public class ListaDeClientes {
    //Lista de Clientes definida que regresa random
    //Tendra todo los nombres de los clientes posibles con el metodo de regresar un nombre aleatorio
    String[] clientes = {"Jesús de Nazaret","María de Betania","Emanuel Seiji","Massuda Cuevas","Yaralin","Issac","Melissa","Christina","Andres","Eunice"};;
    public ListaDeClientes(){
    }
    
    public String regresarNombre(){
        Random rmd = new Random();
        String cliente = "No";
        cliente = clientes[rmd.nextInt(clientes.length - 1)];
        //System.out.print(cliente+"\n");
        return cliente;
    }
}
