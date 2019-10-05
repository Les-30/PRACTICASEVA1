/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peña Hernandez Leslie Johana. 18550680
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamada a funcion--->se ejecuta una funcion
       //int a = 100; 
       //float b = 55.5f;
        System.out.println("inicia main");
    A();
        System.out.println("termina main");
    }
    public static void A(){
        System.out.println("inicia A");
        B();
        System.out.println("termina A");
    }
           
    
     public static void B(){
         System.out.println("inicia B");
         C();
         System.out.println("termina B");
}
     public static void C(){
System.out.println("inicia C");
System.out.println("termina C");
}
     
}