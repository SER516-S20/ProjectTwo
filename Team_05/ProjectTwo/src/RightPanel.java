import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Yijian Hu
 */
public class RightPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Hashtable<Integer, JButton> shapes;
	private Frame frame;
	
	public RightPanel() {
		shapes = new Hashtable<Integer, JButton>();
	}
	
	public void addRound() {
		RoundButton round = new RoundButton("");
		round.addMouseListener(new RightPanelMouse(this) {});
		round.addMouseMotionListener(new RightPanelMouse(this) {});
		shapes.put(round.hashCode(),round);
		this.add(round);
		frame.contentRepaint();
	}
	
	public void addRound(int ID) {
		RoundButton round = new RoundButton("");
		round.addMouseListener(new RightPanelMouse(this) {});
		round.addMouseMotionListener(new RightPanelMouse(this) {});
		shapes.put(ID,round);
		this.add(round);
		frame.contentRepaint();
	}
	
	public void addTriangle() {
		TriangleButton triangle = new TriangleButton("");
		triangle.addMouseListener(new RightPanelMouse(this) {});
		triangle.addMouseMotionListener(new RightPanelMouse(this) {});
		shapes.put(triangle.hashCode(),triangle);
		this.add(triangle);
		frame.contentRepaint();
	}
	
	public void addTriangle(int ID) {
		TriangleButton triangle = new TriangleButton("");
		triangle.addMouseListener(new RightPanelMouse(this) {});
		triangle.addMouseMotionListener(new RightPanelMouse(this) {});
		shapes.put(ID,triangle);
		this.add(triangle);
		frame.contentRepaint();
	}
	
	public void addRectangle() {
		RectangleButton rectangle = new RectangleButton("");
		rectangle.addMouseListener(new RightPanelMouse(this) {});
		rectangle.addMouseMotionListener(new RightPanelMouse(this) {});
		shapes.put(rectangle.hashCode(),rectangle);
		this.add(rectangle);
		frame.contentRepaint();
	}
	
	public void addRectangle(int ID) {
		RectangleButton rectangle = new RectangleButton("");
		rectangle.addMouseListener(new RightPanelMouse(this) {});
		rectangle.addMouseMotionListener(new RightPanelMouse(this) {});
		shapes.put(ID,rectangle);
		this.add(rectangle);
		frame.contentRepaint();
	}
	
	public void deleteShape(int hashCode) {
		this.remove(shapes.get(hashCode));
		shapes.remove(hashCode);
		frame.contentRepaint();
	}
	
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	
	public void setShapeLocation(int hashCode, int x, int y) {
		shapes.get(hashCode).setLocation(x,y);
		frame.contentRepaint();
	}
	
	public Hashtable<Integer, JButton> getShapes()
	{
		return shapes;
	}
}
