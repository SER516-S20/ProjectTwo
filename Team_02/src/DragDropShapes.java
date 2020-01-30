
/**
 * @author Rohit Kumar Singh
 * Created on 01-28-2020
 */

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComponent;

public class DragDropShapes extends JComponent {

	private static final long serialVersionUID = 1L;

	private Map<Point, String> shapeOrigin;
	private String shapeName = "rectangle";
	private String draggedShape = shapeName;

	/*
	 * Drag and Drops Different shapes
	 */
	public DragDropShapes() {
		shapeOrigin = new HashMap<>();
		this.setPreferredSize(new Dimension(500, 400));
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				for (Point point : shapeOrigin.keySet()) {
					if (new Rectangle2D.Double(e.getX() - 50, e.getY() - 50, 50, 50).contains(point)) {
						draggedShape = shapeOrigin.get(point);
						shapeOrigin.remove(point);
						break;
					}
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				shapeOrigin.put(new Point(e.getX(), e.getY()), draggedShape);
				repaint();
			}
		});

	}
}
