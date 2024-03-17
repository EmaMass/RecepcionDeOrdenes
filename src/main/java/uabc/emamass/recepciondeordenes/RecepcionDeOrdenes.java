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
        int jcount = 0;
        int maria = 0;
        int mariacnt = 0;
        int emanuel = 0;
        int emacnt = 0;
        int massuda = 0;
        int mascnt = 0;
        int yaralin = 0;
        int yarcnt = 0;
        int issac = 0;
        int issaccnt = 0;
        int melissa = 0;
        int melcnt = 0;
        int christina = 0;
        int chriscnt = 0;
        int andres = 0;
        int andcnt = 0;
        int eunice = 0;
        int eunicecnt = 0;
        while(contador < 60){
        Cliente test = principal.regresarCliente();
        switch(test.getNombre()){
            case "Jesús de Nazaret":
                jcount++;
                jesus = jesus + test.getProductos();
                break;    
            case "María de Betania":
                mariacnt++;
                maria = maria + test.getProductos();
                break;
            case "Emanuel Seiji":
                emacnt++;
                emanuel = emanuel + test.getProductos();
                break;
            case "Massuda Cuevas":
                mascnt++;
                massuda = massuda + test.getProductos();
                break;
            case "Yaralin":
                yarcnt++;
                yaralin = yaralin + test.getProductos();
                break;
            case "Issac":
                issaccnt++;
                issac = issac = test.getProductos();
                break;
            case "Melissa":
                melcnt++;
                melissa = melissa + test.getProductos();
                break;
            case "Christina":
                chriscnt++;
                christina = christina + test.getProductos();
                break;
            case "Andres":
                andcnt++;
                andres = andres + test.getProductos();
                break;
            case "Eunice":
                eunicecnt++;
                eunice = eunice + test.getProductos();
                break;
            }
        contador++;
        }
        System.out.println("Ordenes en total "+ jcount + " Jesús de Nazaret"+" Cnt. Productos pedidos "+jesus);
        System.out.println("Ordenes en total "+ mariacnt + " María de Betania" + " Cnt. Productos pedidos " + maria);
        System.out.println("Ordenes en total "+ emacnt + " Emanuel Seiji" + " Cnt. Productos pedidos " + emanuel);
        System.out.println("Ordenes en total "+ mascnt + " Massuda Cuevas" + " Cnt. Productos pedidos " + massuda);
        System.out.println("Ordenes en total "+ yarcnt + " Yaralin" + " Cnt. Productos pedidos " + yaralin);
        System.out.println("Ordenes en total "+ issaccnt + " Issac" + " Cnt. Productos pedidos " + issac);
        System.out.println("Ordenes en total "+ melcnt  +" Melissa" + " Cnt. Productos pedidos " + melissa);
        System.out.println("Ordenes en total "+ chriscnt  + " Christina" + " Cnt. Productos pedidos " + christina);
        System.out.println("Ordenes en total "+ andcnt + " Andres" + " Cnt. Productos pedidos " + andres);
        System.out.println("Ordenes en total "+ eunicecnt + " Eunice" + " Cnt. Productos pedidos " + eunice);
        System.out.println(jcount+mariacnt+emacnt+mascnt+yarcnt+issaccnt+melcnt+chriscnt+andcnt+eunicecnt);
    }
}
