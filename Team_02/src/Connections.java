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
    void drawLines(Graphics g, int x1, int y1, int x2, int y2) {
      try{
          Graphics2D g2d = (Graphics2D) g;
      
 
        g2d.drawLine(x1, y1, x2, y2);
      }
      catch(Exception ex)
      {
          System.out.println(ex.getMessage());
      }
      
    }

}