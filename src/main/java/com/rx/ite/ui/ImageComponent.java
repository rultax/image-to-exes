/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rx.ite.ui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author scottw
 */
public class ImageComponent extends Component{
    private Image img;

    public ImageComponent(){}
    public ImageComponent(Image img){
        this.img = img;       
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
    
    public void setImage(Image img){           
        this.img = img;
        this.setSize(img.getWidth(null), img.getHeight(null));
        this.repaint();
    }
}
