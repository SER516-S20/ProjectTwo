package ProjectTwo.Team_02;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

/**
 * @author abhinaw sarang 
 * created on 01-27-2020
 */

public class DrawShapeOnMouseClick extends JPanel {

	private static final long serialVersionUID = 1L;

	private Map<Point, String> shapeOrigin;
	private String shapeName = "rectangle";
	private String draggedShapeName = shapeName;

	public DrawShapeOnMouseClick() {

		shapeOrigin = new HashMap<>();
		this.setPreferredSize(new Dimension(1000, 1000));
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				shapeOrigin.put(new Point(e.getX(), e.getY()), shapeName);
				repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				for (Point p1 : shapeOrigin.keySet()) {
					if (new Rectangle2D.Double(e.getX() - 50, e.getY() - 50, 50, 50).contains(p1)) {
						draggedShapeName = shapeOrigin.get(p1);
						shapeOrigin.remove(p1);
						break;
					}
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				shapeOrigin.put(new Point(e.getX(), e.getY()), draggedShapeName);
				repaint();
			}
		});

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		for (Point p1 : shapeOrigin.keySet()) {
			String currShape = shapeOrigin.get(p1);
			if (currShape.equalsIgnoreCase("rectangle")) {
				g2.drawRect(p1.x, p1.y, 50, 50);
			} else if (currShape.equalsIgnoreCase("circle")) {
				g2.drawOval(p1.x, p1.y, 50, 50);
			} else if (currShape.equalsIgnoreCase("triangle")) {
				g2.drawPolygon(new int[] { p1.x - 25, p1.x, p1.x + 25 }, new int[] { p1.y + 25, p1.y - 25, p1.y + 25 },
						3);
			} else {
				System.out.println("Shape not selected");
			}
		}

	}
}