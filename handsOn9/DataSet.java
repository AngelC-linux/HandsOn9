/* En Esta clase definimos los datos que vamos a usar en el código
 * José Ángel Cardona García
 * SIMULATION
 * 18/05/2022
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handsOn9;

/**
 *
 * @author ANGEL
 */
public class DataSet {
    
    int dista [][] ={
        
        {0,10,12,11,14}, {10,0,13,15,8}, {12,13,0,9,14}, {11,15,9,0,16}, {14,8,14,16,0}
    };
    
    double vap [][] ={
        
        {1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1}
    };
    
    double eta [][] = new double [5][5];
    
    int ant [] = {1,2,3};
    int city [] = {1,2,3,4,5};
    
    

    public int[][] getDista() {
        return dista;
    }
    public void setVap(double[][] vap) {
        this.vap = vap;
    }
    public double[][] getVap() {
        return vap;
    }
    public void setEta(double[][] eta) {
        this.eta = eta;
    }
    public double[][] getEta() {
        return eta;
    }
    public int[] getAnt() {
        return ant;
    }
    public int[] getCity() {
        return city;
    }
}
