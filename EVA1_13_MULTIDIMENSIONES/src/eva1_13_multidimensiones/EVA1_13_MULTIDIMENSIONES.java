/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_multidimensiones;

/**
 *
 * @author LESLIE JOHANA PEÑA HERNANDEZ 18550680
 */
public class EVA1_13_MULTIDIMENSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int aMatriz[][][][][] = new int [2][3][2][1][1];
       
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                for (int k = 0; k <aMatriz[i][j].length; k++) {
                    for (int l = 0; l <aMatriz[i][j][k].length; l++) {
                        for (int m = 0; m <aMatriz[i][j][k][l].length; m++) {
                            aMatriz[i][j][k][l][m] =(int)(Math.random()*1000);
                         //System.out.print("[" + aMatriz[i][j][k][l][m] + "]");
                        }
                        
                    }
                    
                }
                
            }
            
        }
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                for (int k = 0; k <aMatriz[i][j].length; k++) {
                    for (int l = 0; l <aMatriz[i][j][k].length; l++) {
                        for (int m = 0; m <aMatriz[i][j][k][l].length; m++) {
                            aMatriz[i][j][k][l][m] =(int)(Math.random()*1000);
                         System.out.println("[" + aMatriz[i][j][k][l][m] + "]");
       
       
    }
    
}
                }
            }
        }
    }
}
