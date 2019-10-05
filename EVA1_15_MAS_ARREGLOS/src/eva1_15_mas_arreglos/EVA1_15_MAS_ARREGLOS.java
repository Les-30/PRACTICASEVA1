/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_mas_arreglos;

import java.util.Scanner;

/**
 *
 * @author Leslie Johana Peña Hernandez 18550680
 */
public class EVA1_15_MAS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    //MANEJO DE ARGUMENTOS----> PASO POR VALOR---->SOLO LO MANEJA JAVA           PASO POR REFERENCIA
    public static void main(String[] args) {
       
      // Scanner captu = new Scanner (System.in);
      //  System.out.println("que numero quieres?");
        // int num = captu.nextInt();
        //captu.nextLine();
        int num = 10;
        System.out.println("valor  = " + num);
        incrementa (num);
        System.out.println("valor = " + num);
        //------------
    Prueba obj = new Prueba();
    obj.val = 10;
    System.out.println("valor  = " + obj.val);
        incrementa (num);
        System.out.println("valor = " + obj.val);
    
    }
    public static void incrementa(int valor){
        valor++;
    }
    
    public static void incrementaObj(Prueba obj){
        obj.val++;
    }
}
class Prueba{
    int val;
}