import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

/** 
 * @author Rahul Jain
 * @since 01-29-2019
 * Description:This class drags the panel passed in constructor using its x & y coordinates.
 */
public class DragDiagram{
	protected int x;
	protected int y;

	public DragDiagram(final JPanel panel){
	    panel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mousePressed(MouseEvent loc) {
	             x = loc.getX();
	             y = loc.getY();
	        }
	    });
	    panel.addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent loc) {
	            loc.translatePoint(loc.getComponent().getLocation().x-x, 
	            		           loc.getComponent().getLocation().y-y);
	            panel.setLocation(loc.getX(), loc.getY());
	        }
	    });
	  }
    }