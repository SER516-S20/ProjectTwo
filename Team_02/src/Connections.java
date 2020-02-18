/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveLoadFile;

/**
 *
 * @author kunnu
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class Connections extends JFrame{

    public Connections(){
        
    }

    public void DotToDOtConnectin(Graphics g, int x1, int y1, int x2, int y2)
    {
        try{
        }
        catch(Exception ex){
            
        }
    }
    public void DotToBarConnection(Graphics g, int x1, int y1, int x2, int y2)
    {
        try{
        }
        catch(Exception ex){
            
        }
    }
    public void BarToBarConnection(Graphics g, int x1, int y1, int x2, int y2)
    {
        try{
        }
        catch(Exception ex){
            
        }
    }
    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
 
        g2d.drawLine(120, 50, 360, 50);
 
        g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));
 
        g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));
    }

}