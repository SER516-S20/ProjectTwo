import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
/**
 * 
 * @author Ashwath Reddy Koppala
 *
 */
public class DrawShape extends JLabel implements MouseListener,MouseMotionListener
{
	private int currentx;
	private int currenty;
	private int relativex;
	private int relativey;
	private String shape_name;
	private int HEIGHT = 100;
	private int WIDTH = 100;
	
	public DrawShape(String shape, int posx, int posy)
	{
		shape_name = shape;
		currentx = posx;
		currenty = posy;
		Dimension size = new Dimension(HEIGHT,WIDTH);
		this.setPreferredSize(size);
		this.setBounds(currentx, currenty, 100, 100);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		if(shape_name.equals("circle"))
		{
			g.fillOval(0, 0, 100, 100);
		}
		else if(shape_name.equals("triangle"))
		{
		    int xPoints[] = {WIDTH/2, 1, WIDTH-1};
		    int yPoints[] = {1, HEIGHT-1, HEIGHT-1};
		    g.fillPolygon(xPoints, yPoints, xPoints.length);
		}
		else if(shape_name.equals("square"))
		{
			g.fillRect(1, 1, WIDTH-1, HEIGHT-1);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		relativex = currentx - e.getX();
		relativey = currenty - e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		int x1 = e.getX();
		int y1 = e.getY();
		setLocation(x1+relativex,y1+relativey);
		currentx = x1+relativex;
		currenty = y1+relativey;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {}
}