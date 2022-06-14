/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handsOn9;

/**
 *
 * @author ANGEL
 */
public class HelperArithmetic {
    
    DataSet DS = new DataSet();
    
    
    public double[][] eta(double[][] eta1){

        int [][] Distancia= DS.getDista();
        
        for (int i=0;i<Distancia.length;i++){
            for (int j=0;j<Distancia[0].length;j++){
                if(Distancia[i][j]!=0) {
                    eta1[i][j] = 1.0 / Distancia[i][j];
                }
            }
        }
        return eta1;
    }
    
}
