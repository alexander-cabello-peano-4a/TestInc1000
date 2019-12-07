/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercmultithreading;

/**
 *
 * @author alxsnder20
 */
public class Inc1000 extends Thread {

    static int count;
    
    public void Run() throws InterruptedException{
        for (int i = 0; i < 1000; i++) {
            count++;
            Thread.sleep(1);     
        }
    }
    
    
       
   
}
