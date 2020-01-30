import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import java.awt.event.MouseAdapter;

public class RightPanelMouse extends MouseAdapter{
	private RightPanel rightPanel;
	public RightPanelMouse(RightPanel rightPanel) {
		this.rightPanel = rightPanel;
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON3) {
//			rightPanel.DeleteShape(this.hashCode());
		}
	}
}
