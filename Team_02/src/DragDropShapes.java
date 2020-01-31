import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComponent;
/**
 * @author Rohit Kumar Singh
 * @created on 01-28-2020
 */
public class DragDropShapes extends JComponent {
	
private static final long serialVersionUID = 1L;
private Map<Point, String> shapeOrigin;
private String shapeName = "rectangle";
private String draggedShape = shapeName;
	
public DragDropShapes() {

	shapeOrigin = new HashMap<>();
	this.setPreferredSize(new Dimension(500, 400));
	addMouseListener(new MouseAdapter() {

	@Override
	public void mousePressed(MouseEvent event) {
		for (Point point : shapeOrigin.keySet()) {
			if (new Rectangle2D.Double(event.getX() - 50, event.getY() - 50, 50, 50).contains(point)) {
				draggedShape = shapeOrigin.get(point);
				shapeOrigin.remove(point);
				break;
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		shapeOrigin.put(new Point(event.getX(), event.getY()), draggedShape);
		repaint();
	      }
	   });
	}
}
