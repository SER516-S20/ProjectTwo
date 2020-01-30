import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RightPanel extends JPanel{
	private Hashtable<Integer, JButton> shapes;
	private Frame frame;
	
	public RightPanel() {
		shapes = new Hashtable<Integer, JButton>();
		//this.setLayout(null);
	}
	public void AddRound() {
		RoundButton round = new RoundButton("");
		round.addMouseListener(new RightPanelMouse(frame, this, round, null, null) {});
		shapes.put(round.hashCode(),round);
		this.add(round);
		frame.contentRepaint();
	}
	
	public void AddTriangle()
	{
		TriangleButton triangle = new TriangleButton("");
		triangle.addMouseListener(new RightPanelMouse(frame, this, null, triangle, null) {});
		shapes.put(triangle.hashCode(),triangle);
		this.add(triangle);
		frame.contentRepaint();
	}
	
	public void AddRectangle()
	{
		RectangleButton rectangle = new RectangleButton("");
		rectangle.addMouseListener(new RightPanelMouse(frame, this, null, null, rectangle) {});
		shapes.put(rectangle.hashCode(),rectangle);
		this.add(rectangle);
		frame.contentRepaint();
	}
	
	public void DeleteShape(int hashCode)
	{
		this.remove(shapes.get(hashCode));
		shapes.remove(hashCode);
		frame.contentRepaint();
	}
	
	public void SetFrame(Frame frame)
	{
		this.frame = frame;
	}
	
	public void SetShapeLocation(int hashCode, int x, int y)
	{
		shapes.get(hashCode).setLocation(x,y);
		frame.contentRepaint();
	}
}
