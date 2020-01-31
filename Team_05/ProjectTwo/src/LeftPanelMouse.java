//@author:ShihYuChang 
//Leftmouse funtion
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LeftPanelMouse extends MouseAdapter{
	private RightPanel rightPanel;
	
	public LeftPanelMouse(RightPanel rightPanel) {
		this.rightPanel = rightPanel;
	}
	
	//Create shape at the rightPanel
	public void mouseClicked(MouseEvent e) {
		String button = e.getSource().getClass().getName();
		if(button == "RoundButton") {
			rightPanel.AddRound();
		}
		else if(button == "TriangleButton") {
			rightPanel.AddTriangle();
		}
		else {
			rightPanel.AddRectangle();
		}
	}
	
}
