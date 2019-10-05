/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_arreglo_de_objetos;

/**
 *
 * @author LESLIE JOHANA PEÑA HERNANDEZ 18550680
 */
public class EVA1_9_ARREGLO_DE_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prueba[]apArreglo = new Prueba[5];
            System.out.println(apArreglo);
            for (int i = 0; i <apArreglo.length; i++) {
            apArreglo[i] = new Prueba();
                System.out.println(apArreglo[i]);
            
        }
    }
    
}
class Prueba{}