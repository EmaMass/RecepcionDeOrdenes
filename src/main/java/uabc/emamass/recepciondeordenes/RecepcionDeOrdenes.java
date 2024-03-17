/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uabc.emamass.recepciondeordenes;

/**
 *
 * @author poppe
 */
public class RecepcionDeOrdenes {

    public static void main(String[] args) throws InterruptedException {
        //Principal, ciclo de tiempo de 2 minutos
        ColaDeClientes principal = new ColaDeClientes();
        long tiempo = System.currentTimeMillis();
        int contador = 0;
        while(contador < 60){
            Thread.sleep(2000 - tiempo % 1000);
            contador++;
            principal.agregarCliente();
        }
        contador = 0;
        int jesus = 0;
        int maria = 0;
        int emanuel = 0;
        int massuda = 0;
        int yaralin = 0;
        int issac = 0;
        int melissa = 0;
        int christina = 0;
        int andres = 0;
        int eunice = 0;
        while(contador < 20){
        Cliente test = principal.regresarCliente();
        switch(test.getNombre()){
            case "Jesús de Nazaret":
                jesus = jesus + test.getProductos();
                break;    
            case "María de Betania":
                maria = maria + test.getProductos();
                break;
            case "Emanuel Seiji":
                emanuel = emanuel + test.getProductos();
                break;
            case "Massuda Cuevas":
                massuda = massuda + test.getProductos();
                break;
            case "Yaralin":
                yaralin = yaralin + test.getProductos();
                break;
            case "Issac":
                issac = issac = test.getProductos();
                break;
            case "Melissa":
                melissa = melissa + test.getProductos();
                break;
            case "Christina":
                christina = christina + test.getProductos();
                break;
            case "Andres":
                andres = andres + test.getProductos();
                break;
            case "Eunice":
                eunice = eunice + test.getProductos();
                break;
            }
        contador++;
        }
        System.out.println("Jesús de Nazaret"+" "+jesus);
        System.out.println("María de Betania" + " " + maria);
        System.out.println("Emanuel Seiji" + " " + emanuel);
        System.out.println("Massuda Cuevas" + " " + massuda);
        System.out.println("Yaralin" + " " + yaralin);
        System.out.println("Issac" + " " + issac);
        System.out.println("Melissa" + " " + melissa);
        System.out.println("Christina" + " " + christina);
        System.out.println("Andres" + " " + andres);
        System.out.println("Eunice" + " " + eunice);
    }
}
