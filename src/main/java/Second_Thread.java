/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrad
 */
import java.util.logging.Level;
import java.util.logging.Logger;


public class Second_Thread implements Runnable{
    
    public void run(){
        for(int i = 0; i < 20; i++)
        {
            System.out.println(i + "second thread");
            try{
                Thread.sleep(1500);
            }
            catch(InterruptedException x ){
                Logger.getLogger(Second_Thread.class.getName()).log(Level.SEVERE, null, x);

                
            }
        }
        
        System.out.println("second thread has finshed");
    }
}
