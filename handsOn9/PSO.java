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
public class PSO {
    
      DataSet DS=new DataSet();
    HelperArithmetic HA= new HelperArithmetic();
    
    
    public void ProbMov () {
        
        double[][] vap = DS.getVap();
        int[][] distances = DS.getDista();
        double[][] eta = DS.getEta();
        DS.setEta(HA.eta(DS.getEta()));
        
        double[] proba = new double[5];
        double[] operations = new double[5];
        int city = 1;
        double sum = 0;
        int desicion;
        boolean flag = true;
        
        System.out.print("\n");
        System.out.print("");
        System.out.println("");

        do {
            switch (city) {
                case 1:
                for (int[] distance : distances) {
                    distance[0] = 0;
                }
                    for (int[] distance : distances) {
                        for (int j = 0; j < distances[0].length; j++) {                          
                            System.out.printf("%d ", distance[j]);
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    int i = 0;
                    for (int j = 0; j < distances[0].length; j++) {

                        if (city - 1 != j) {
                            operations[i] = vap[city - 1][j] * (eta[city - 1][j] * eta[city - 1][j]);
                            System.out.printf("ciudad :%d probablidad: %.4f \n", j + 1, operations[i]);
                            sum += operations[i];
                            i++;
                        }
                    }
                    System.out.print("\n");

                    for (int j = 0; j < i; j++) {
                        proba[j] = operations[j] / sum;
                        System.out.printf("ciudad aleatoria %d: %.4f\n", j + 1, proba[j]);
                    }

                    desicion = rutelarussa(proba);
                    System.out.printf("\n-------- la proxima ciudad a visitar es %d --------", desicion);
                    System.out.println("");

                    flag = false;
                    break; 
            }//
        }while (flag) ;
        System.out.print("\nLA HORMIGA YA VOLVIÓ A LA PRIMERA CIUDAD\n\n");
    }

    public int rutelarussa(double[] proba){
        
        
        double [] ruletazo = new double[proba.length];
        int town = 0;
        double turno = Math.random(); // HC
        double probsum = 0;
        for(int i=0;i<proba.length-1;i++){
            probsum+=proba[i];
            ruletazo[i]=probsum;
            System.out.printf("\nProbabilidad %d con %.4f",i+2,ruletazo[i]);
        }
        System.out.printf("\n ------------------------------> %.4f \n",turno);
        //System.out.println(turno + "\n");

        if (turno<ruletazo[0]){
            town=2;
        }else if(ruletazo[0]<turno && turno<ruletazo[1]){
            town=3;
        }else if(ruletazo[1]<turno && turno<ruletazo[2]){
            town=4;
        }else if(ruletazo[2]<turno && turno<ruletazo[3]){
            town=5;
        }


        return town;
    }
}
