/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_arreglos;

/**
 *
 * @author Leslie Johana Peña Hernandez 18550680
 */
public class EVA1_5_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datos[] = new int [10]; //------>los arreglos en java son objetos.
        System.out.println(datos);
        //N #DE ELEMENTOS
        //0--> 1ER ELEMENTO
        //N - 1 --> ULTIMO ELEMENTO
        for (int i = 0; i < datos.length; i++) {//-----> es lacantidad de datos que hay en el elemento (length)
            datos[i] = (int)(Math.random()* 100) + 1;
            
        }
         for (int i = 0; i < datos.length; i++) {
             System.out.println(datos[i]);
    }
         //FOR-EACH -->PARA CADA ELEMENTO DEL ARREGLO
         for (int dato : datos) {
             System.out.println(dato);
            
        }
    
}
}