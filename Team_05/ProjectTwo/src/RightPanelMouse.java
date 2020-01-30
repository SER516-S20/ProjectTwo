import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import java.awt.event.MouseAdapter;

public class RightPanelMouse extends MouseAdapter{
	private RightPanel rightPanel;
	private RoundButton round1 = new RoundButton("");
	private TriangleButton triangle1 = new TriangleButton("");
	private RectangleButton rectangle1 = new RectangleButton("");
	private Frame frame;
	public RightPanelMouse(Frame frame, RightPanel rightPanel, RoundButton round, TriangleButton triangle, RectangleButton rectangle) {
	
		this.rightPanel = rightPanel;
		round1 = round;
		triangle1 = triangle;
		rectangle1 = rectangle;
		this.frame = frame;
	}
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON3) {
			if(round1 != null) {
				rightPanel.DeleteShape(round1.hashCode());
			}
			else if(triangle1 != null) {
				rightPanel.DeleteShape(triangle1.hashCode());
			}
			else {
				rightPanel.DeleteShape(rectangle1.hashCode());
			}
		}
		else {
			if(round1 != null) {
				round1.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent eg) {
						int dx = eg.getX();
						int dy = eg.getY();
						round1.setLocation(dx,dy);
						frame.contentRepaint();
					}
				});
			}
			else if(triangle1 != null) {
				triangle1.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent eg) {
						int dx = eg.getX();
						int dy = eg.getY();
						triangle1.setLocation(dx,dy);
						frame.contentRepaint();
					}
				});
			}
			else {
				rectangle1.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent eg) {
						int dx = eg.getX();
						int dy = eg.getY();
						rectangle1.setLocation(dx,dy);
						frame.contentRepaint();
					}
				});
			}
		}
	}
}
