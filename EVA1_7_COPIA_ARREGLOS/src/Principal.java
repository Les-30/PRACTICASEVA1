/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Leslie Johana Peña Hernandez 18550680
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int aiDatos [], a, b;
        int[] aiDatos2, x, y;
        //
        int aiCopia[];
        //INICIALIZACION DEL ARREGLO
        aiDatos = new int [10];
        
        
       //LLENAR CON VALORES ALEATORIOS
       for (int i = 0; i < aiDatos.length; i++) {
            //CANTIDAD DE DATOS QUE ESTAN EN EL ARREGLO-----> length
            aiDatos[i] = (int)(Math.random() * 100) + 1; 
            
    }
        System.out.println("DATOS ORIGINALES");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" + aiDatos[i] + "]");
        }
        System.out.println(aiDatos);
        
        
        aiCopia = aiDatos;
        System.out.println(aiCopia);
        
        System.out.println("DATOS COPIADOS");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" + aiCopia[i] + "]");
    }
}
}
