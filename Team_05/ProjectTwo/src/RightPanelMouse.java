import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import java.awt.event.MouseAdapter;

public class RightPanelMouse extends MouseAdapter{
	private RightPanel rightPanel;
	private RoundButton round1 = new RoundButton("");
	private TriangleButton triangle1 = new TriangleButton("");
	private RectangleButton rectangle1 = new RectangleButton("");
	public RightPanelMouse(RightPanel rightPanel, RoundButton round, TriangleButton triangle, RectangleButton rectangle) {
	
	this.rightPanel = rightPanel;
	round1 = round;
	triangle1 = triangle;
	rectangle1 = rectangle;
		
	}
	public void mouseClicked(MouseEvent e) {
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
//		else {
//			
//			addMouseMotionListener(new MouseMotionAdapter() {
//				public void mouseDragged(MouseEvent eg) {
//					int dx = eg.getX() - mousePt.x;
//					int dy = eg.getY() - mousePt.y;
//					instance.setLocation(dx, dy);
//					contentRepaint();
//				}
//			});
//		}
	}
	
}
