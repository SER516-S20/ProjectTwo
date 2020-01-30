/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectTwo.Team_02;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Kunal Sharma
 * created - 01-27-2020
 */
public class MainWindow {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Main Window");
        //JPanel frame = new JPanel();
        frame.setVisible(true);
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JSplitPane splitPane = new JSplitPane();
        splitPane.setSize(900, 900);
        splitPane.setDividerSize(0);
        splitPane.setDividerLocation(200);
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        
        splitPane.setTopComponent(new PanelToolkit());
        splitPane.setBottomComponent(new DrawBoardPanel());
        frame.add(splitPane);
    }
    
}
