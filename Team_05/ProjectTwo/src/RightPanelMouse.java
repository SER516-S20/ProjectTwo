import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class RightPanelMouse implements MouseListener, MouseMotionListener {
	private int currentX;
	private int currentY;
	private RightPanel rightPanel;
	//private Frame frame;
	public RightPanelMouse(Frame frame, RightPanel rightPanel) {
	
		this.rightPanel = rightPanel;
		//this.frame = frame;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		e.getComponent().setLocation(e.getX() + e.getComponent().getX() - currentX, 
				 e.getY() + e.getComponent().getY() - currentY);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		currentX = e.getX();
		currentY = e.getY();
		if(e.getButton() == MouseEvent.BUTTON3) {
			rightPanel.DeleteShape(e.getComponent().hashCode());
		}
	}
			
}
