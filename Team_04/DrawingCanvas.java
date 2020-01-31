import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
/** 
 * @author Snehith karna
 * @since 1-28-2020
 * @version 1.0
 */ 
public class DrawingCanvas extends JPanel implements MouseListener
{
	private SelectedShape shape;
	
	public DrawingCanvas()
	{
		shape = new SelectedShape();
		this.setLayout(null);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		DrawShape figure = new DrawShape(shape.name,e.getX()-50,e.getY());
		this.add((JLabel)figure); 
		this.repaint();
	}

	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}
}
