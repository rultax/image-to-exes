package com.rx.ite;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;


public class App 
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                AppFrameView view = new AppFrameView("My View");
                AppController controller = new AppController(view);
                try {
                    controller.start();
                } catch (ImageException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
