/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_arreglos_valor_ref;

/**
 *
 * @author  Leslie Johana Peña Hernandez 18550680
 */
public class EVA1_16_ARREGLOS_VALOR_REF {

    /**
     * @param args the command line arguments
     */
    //UN ARREGLO ES UN OBJETO, MANEJA DIRECCIONES
    public static void main(String[] args) {
        //SE CREA EL ARREGLO
        int arreglo[] = new int[5];
        llenarArreglo(arreglo);
        madrearArreglo(arreglo);
        System.out.println(arreglo);
        imprimirArreglo(arreglo);
       
    }
    public static void llenarArreglo(int[]arre){
        for (int i = 0; i < arre.length; i++){
            arre[i] = (int)(Math.random()*100);
            
        }
        System.out.println(arre);
      
            } 
    
    public static void madrearArreglo (int[] arre){
        arre = new int[100];
        System.out.println(arre);
                
    }
  
    public static void imprimirArreglo (int[] arre){
            for (int i = 0; i < arre.length; i++){
            arre[i] = (int)(Math.random()*100);
                System.out.println("[" + arre[i] + "]");  
        }
        
    
    }
}

//PASO POR VALOR ENVIA UNA COPIA 
