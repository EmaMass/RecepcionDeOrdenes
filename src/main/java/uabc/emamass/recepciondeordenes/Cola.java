/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.recepciondeordenes;

/**
 *
 * @author poppe
 */
public class Cola {
    Cliente[] cola = new Cliente[62];
    int fin = 0;
    int inicio = 0;
    int max = 62;
    
    public Cola(){
    }
    
    public void insertarDato(Cliente dato){
        if(fin < max){
            fin++;
            cola[fin] = dato;
            if(fin == 1){
                inicio = 1;
            }
        } else{
            System.out.print("Desbordamiento");
        }
    }
    
    public Cliente eliminarDato(){
        Cliente ret = null;
        if(inicio != 0){
            ret = cola[inicio];
            if(inicio == fin){
            inicio = 0;
            fin = 0;
        } else{
            inicio++;
            }
        }else{
            System.out.print("Subdesbordamiento");
        }
        return ret;
    }
    
    public void reOrganizar(Cliente VIP){
        fin++; 
        if(fin == 1){
            inicio = 1;
        }
        int cont = 2;
        Cliente swap;
        Cliente temp;
        swap = cola[1];
        cola[1] = VIP;
        while(cont <= fin){
            temp = cola[cont];
            cola[cont] = swap;
            swap = temp; 
            cont++;
        }
    }
}
