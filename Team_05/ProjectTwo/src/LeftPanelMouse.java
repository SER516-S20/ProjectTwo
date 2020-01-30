import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

public class LeftPanelMouse extends MouseAdapter{
	private RoundButton roundButton = new RoundButton("Round");
	private TriangleButton triangleButton = new TriangleButton("Triangle");
	private RectangleButton rectangleButton = new RectangleButton("Rectangle");
	private RightPanel rightPanel;
	public LeftPanelMouse(JPanel rightPanel) {
		this.rightPanel = (RightPanel) rightPanel;
	}
	
	public void mouseClicked(MouseEvent e) {
		String button = e.getSource().getClass().getName();
		if(button == "RoundButton") {
			RoundButton instance = new RoundButton("");
			rightPanel.AddR();
			
		}
		else if(button == "TriangleButton") {
			
		}
		else {
			
		}
//		
		
		
		
	}
	public void setRightPanel() {
		
	}
}
