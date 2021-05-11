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
        
        
public class First_Thread extends  Thread{
    
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i + " first thread");
        }
        
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException x ) 
        {
            Logger.getLogger(First_Thread.class.getName()).log(Level.SEVERE, null, x);
            
        }
        
        System.out.println("first thread has finshed");
    }
    
}