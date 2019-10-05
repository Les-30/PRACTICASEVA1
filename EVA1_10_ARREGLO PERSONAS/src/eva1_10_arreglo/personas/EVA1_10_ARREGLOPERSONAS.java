/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_arreglo.personas;

import java.util.Scanner;

/**
 *
 * @author Leslie Johana Peña Hernandez 18550680
 */
public class EVA1_10_ARREGLOPERSONAS {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
     Persona[] aPersonas = new Persona[10];
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i <aPersonas.length; i++) {
            aPersonas[i] = new Persona();
            System.out.println("Introduce tu nombre:");
            aPersonas[i].nombre = sCaptu.nextLine();
        }

    imprimeArreglo(aPersonas);
    //COPIA DEL ARRREGLO
    Persona[] aCopias = new Persona[aPersonas.length];
        for (int i = 0; i <aPersonas.length; i++) {
            aCopias[i] = new Persona();
            aCopias[i].nombre = aPersonas[i].nombre;
            
        }
}
    public static void imprimeArreglo(Persona[]args){
        for (int i = 0; i <args.length; i++) {
            System.out.println("nombre:" + args[i].nombre);
            
        }
    }
}
class Persona{
      String nombre;
    
}