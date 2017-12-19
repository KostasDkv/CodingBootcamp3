/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise;

public class StrategyPatternExercise {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //RAR r = new RAR();
        
        //Context context = new Context(new RAR());
        //context.executeCompress(); 
        
        
        
        Context context2 = new Context(new ZIP());
        context2.executeCompress();
        
        //ta antoistoixa system.out.println twn RAR kai ZIP 
        //vriskontai stis antoistoixes klasseis
        // tha mporousa kai na ta ulopoiisw edw sti main, afou ta svisw apo tis antisoixes klaseis

    
        
        
        
    }
 
}
