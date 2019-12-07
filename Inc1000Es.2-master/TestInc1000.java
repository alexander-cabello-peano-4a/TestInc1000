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
public class TestInc1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException  {
        Inc1000 num1 = new Inc1000();
        Inc1000 num2 = new Inc1000();
        num1.start();
        num1.join();//Conflitto risolto con la classe join
        num2.start();//Parte num2 solo quando num1 ha finito
        num2.join();//Parte num2
        System.out.println(Inc1000.count);
    }
}
