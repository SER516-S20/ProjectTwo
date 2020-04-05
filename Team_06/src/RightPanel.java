import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * @author: Suyog, Dhananjay
 * @Date: 01/28/2020
 */
public class RightPanel extends PanelInterface{
	public static int finalFlag = 0;
	private static RightPanel single_instance = null;
	
	public static RightPanel getInstance()
	{
		if (single_instance == null)
			single_instance = new RightPanel();
		return single_instance;
	}
    private ArrayList<Point> points;
    ArrayList<Point> circlePoints = new ArrayList<Point>();
    ArrayList<Point> squarePoints= new ArrayList<Point>();
    ArrayList<Point> trianglePoints= new ArrayList<Point>();
    
	public RightPanel() {
		
		super("#d3d3d3", 150, 20);
	
        points = new ArrayList<Point>();

		addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent e) {      		        	  
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
	        
        int temp = points.size() - 1;

	    if(finalFlag == 1) {	        	
		     circlePoints.add(new Point(points.get(temp).x, points.get(temp).y));
	    }     
	    else if(finalFlag == 2) {
	         squarePoints.add(new Point(points.get(temp).x, points.get(temp).y));	        
	    }
	    else if(finalFlag == 3) {
	         trianglePoints.add(new Point(points.get(temp).x, points.get(temp).y));      
	    }
	        
	    for (Point point : circlePoints) {
	        g.drawOval(point.x, point.y, 70,  70);
	    }      
	    for (Point point : squarePoints) {
	        g.drawRect(point.x, point.y, 70, 70);
	    }	                
	    for (Point point : trianglePoints) {
	        g.drawPolygon(new int[] {point.x,  point.x- 30 , point.x + 30}, new int[] {point.y,  point.y + 70, point.y + 70}, 3);
		}        
	 }
}
