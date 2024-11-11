/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configs;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author ASUS
 */
public class Background extends JDesktopPane{
  
protected void booksComponent(Graphics g){
    Graphics2D graphics = (Graphics2D) g.create();
    
    Image img = new ImageIcon(getClass().getResource("/Assets/tokobukuhome.jpeg")).getImage();
    graphics.drawImage(img, 0, 0, getWidth(), getHeight(), null);
    graphics.dispose();
}
    
}
