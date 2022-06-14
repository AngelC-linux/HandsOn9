/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handsOn9;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author ANGEL
 */
public class PSOAgent extends Agent {
    
    @Override
    protected void setup(){
        
        System.out.println("Agent " + getLocalName() + " Started");
        addBehaviour(new MyOneShotBehaviour());
        
    }
    private class MyOneShotBehaviour extends OneShotBehaviour{
        
        @Override
        public void action(){
            System.out.println("\n\n");
            DataSet DS = new DataSet();
            HelperArithmetic HA = new HelperArithmetic();
            
            DS.setEta(HA.eta(DS.getEta()));
            PSO MV = new PSO();
            MV.ProbMov();
            
            int [][] distancia = DS.getDista();
            for(int [] distancia1 : distancia){
                for(int j = 0; j < distancia[0].length; j++){
                    System.out.printf("%d ", distancia1[j]);
                }
                System.out.println();
                
            }
            double[][] feromonas = DS.getVap();
            for(double[] feromona : feromonas){
                for(int j = 0; j < feromonas[0].length; j++){
                    System.out.printf("%f ", feromona[j]);
                    
                }
                System.out.println();
                
            }
            System.out.println();
            double[][] eta = DS.getEta();
            for(double[] eta1 : eta){
                for(int j = 0; j < eta[0].length; j++){
                    System.out.printf("%.4f", eta1[j]);
                }
                System.out.println();
            }
        }
        public int onEnd(){
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}
