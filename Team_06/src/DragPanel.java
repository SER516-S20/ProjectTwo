import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class DragPanel{
	protected int x;
	protected int y;

	public DragPanel(final JPanel panel){
	    panel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mousePressed(MouseEvent me) {
	             x = me.getX();
	             y = me.getY();
	        }
	    });
	    panel.addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent me) {
	            me.translatePoint(me.getComponent().getLocation().x-x, me.getComponent().getLocation().y-y);
	            panel.setLocation(me.getX(), me.getY());
	        }
	    });
	}
	
    }