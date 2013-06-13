/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rx.ite.io;

import com.rx.ite.ImageException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author scottw
 */
public class ImageLoader {
    
    public static BufferedImage loadImage(String file) 
            throws ImageException{
        
        try{
            return ImageIO.read(new File(file));
        }catch(IOException ex){
            throw new ImageException("Failed to load image", ex);
        }
    }    
}
