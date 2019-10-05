/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_arreglos;

/**
 *
 * @author Leslie Johana Peña Hernandez 18550680
 */
public class EVA1_6_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //DECLARACION DE ARREGLOS
      int aiDatos [], x, y;
      int[] aiDatos2, a, b;
      //
      int aiCopia[];
      //INICIALIZACION DEL ARREGLO
      aiDatos = new int [100];
        System.out.println(aiDatos);
        for (int i = 0; i < aiDatos.length; i++) {
        //CANTODAD DE DATOS QUE ESTAN EN EL ARREGLO---> length
        aiDatos[i] = (int)(Math.random()*100)+1;
            //System.out.println(aiDatos(i));
        
        }
    }
    
}
