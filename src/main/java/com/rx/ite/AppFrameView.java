/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rx.ite;

import com.rx.ite.ui.ImageComponent;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author scottw
 */
public class AppFrameView {
    private JFrame frame;
    private JPanel panel;
    private ImageComponent imageComponent;
    
    public AppFrameView(String text){
        frame = new JFrame(text);
        frame.setContentPane(new JScrollPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);       
        
        panel = new JPanel(new BorderLayout()); 
        imageComponent = new ImageComponent();
        panel.add(imageComponent, BorderLayout.CENTER);
        
        frame.getContentPane().add(panel);
    }
    
    public void setImage(Image image){
        imageComponent.setImage(image);
    }

    public JFrame getFrame() {
        return frame;
    }
}
