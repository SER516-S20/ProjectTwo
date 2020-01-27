package ProjectTwo.Team_02;

import java.awt.*;
import java.awt.Point;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawShapeOnMouseClick extends JComponent{

	private static final long serialVersionUID = 1L;
	
	static JFrame f = new JFrame("Draw Shape On Mouse Click");
	// Shape to draw (circle, triangle, rectangle)
	// Please overwrite below variable with selected shape name.
    String shapeName = "circle";
    private ArrayList<Point> points;

    public DrawShapeOnMouseClick() {
    	
        points = new ArrayList<Point>();
        this.setPreferredSize(new Dimension(500, 400));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                points.add(new Point(e.getX(), e.getY()));
                repaint();
            }
            
        });
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
    	
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for (Point p1 : points) {
        	if (shapeName == "rectangle") {
            	g2.drawRect(p1.x, p1.y, 50, 50);
            } else if (shapeName == "circle") {
            	g2.drawOval(p1.x, p1.y, 50, 50);
            } else if (shapeName == "triangle") {
            	g2.drawPolygon(new int[] {p1.x-20, p1.x, p1.x+20}, new int[] {p1.y+20, p1.y-20, p1.y+20}, 3);
            } else {
                System.out.println("Shape not selected");
            }
        }
        
    }
    
    public static void main(String[] args) {
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new DrawShapeOnMouseClick());
        f.pack();
        f.setVisible(true);
    }
}