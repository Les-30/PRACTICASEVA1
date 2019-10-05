/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_arreglos_2;

/**
 *
* @author Leslie Johana Peña Hernandez 18550680
 */
public class EVA1_8_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aiDatos[] = new int [10];
        int aiCopia[] = new int [10];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*100)+1;
            
        }
        aiCopia =aiDatos ; //----> COPIAMOS LAS DIRECCIONES ELEMENTO POR ELEMENTO
         
        for (int i = 0; i <aiDatos.length; i++) {
            aiCopia[i] = aiDatos [i];
            
        }
        imprimirArreglo(aiDatos);
        imprimirArreglo(aiCopia);
        
        
    }
    public static void imprimirArreglo (int[] args){
        System.out.println("");
        for (int i = 0; i < args.length; i++) {
            System.out.println("["+ args[i]+ "]");
            
        }
        System.out.println("");
    }
}
