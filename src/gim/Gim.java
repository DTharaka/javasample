/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gim;

/**
 *
 * @author Chathani
 */
public class Gim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      main mine = new main();
      mine.details(2,4.5);
      mine.force();
    }
    
}
class main{
    double mass;
    double accela;
    double force;
    
    public void details(double a, double b){
        mass = a;
        accela = b;
        
        force = a * b;
    }
    
   public void force(){
       System.out.println(force);
   }
}
