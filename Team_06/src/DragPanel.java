import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class DragPanel{
	public DragPanel(JPanel panel){
       final JPanel p = panel;
            panel.addMouseMotionListener(new MouseMotionAdapter() {

                @Override
                public void mouseDragged(MouseEvent me) {
                    me.translatePoint(me.getComponent().getLocation().x, me.getComponent().getLocation().y);
                    p.setLocation(me.getX(), me.getY());
                }

            });
        }
    }
