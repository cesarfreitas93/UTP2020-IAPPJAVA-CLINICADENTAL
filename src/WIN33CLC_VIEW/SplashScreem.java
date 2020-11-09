/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN33CLC_VIEW;

/**
 *
 * @author Cesar
 */
public class SplashScreem {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sleepThread();
       
         java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
               new frm_01_login().setVisible(true);
            }
        });
    }
   
     private static void sleepThread() {
        try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException ex)
            {
                // Do something, if there is a exception
                System.out.println(ex.toString());
            }
    }
}
