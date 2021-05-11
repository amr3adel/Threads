/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrad
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        First_Thread first = new First_Thread();
        first.start();
        
        Second_Thread second = new Second_Thread();
        
        Thread thread = new Thread(second);
        thread.start();
        
        for(int i =100; i<200;i+=50)
        {
            System.out.println(i + "from the main thread");
        }
        System.out.println("The main thread is finshed");
        
    }
}
