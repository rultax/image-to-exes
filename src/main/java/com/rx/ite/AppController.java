/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rx.ite;

import com.rx.ite.io.ImageLoader;
import java.awt.Image;
import java.awt.event.ActionListener;

/**
 *
 * @author scottw
 */
public class AppController {
    private AppFrameView view;
    
    public AppController(AppFrameView view){
        this.view = view;
    }
    
    public void start() throws ImageException{
        Image image = ImageLoader.loadImage("C:\\image.png");
        view.setImage(image);
    }
}
