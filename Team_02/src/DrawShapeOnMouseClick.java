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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author abhinaw sarang
 * @created on 01-27-2020
 * @version 1.0
 * @author Rohit Kumar Singh
 * @modified on 01-28-2020
 * @version 2.0
 */
public class DrawShapeOnMouseClick extends JPanel {

	private static final long serialVersionUID = 1L;

	private Map<Point, String> shapeOrigin;
	private String selectedShapeName;
	private String draggedShapeName = "";

	public DrawShapeOnMouseClick() {

		shapeOrigin = new HashMap<>();
		this.setPreferredSize(new Dimension(1600, 800));
		this.setVisible(true);
		addMouseListener(new DrawBoardMouseListener());
	}

	@Override
	public void paintComponent(Graphics graphics) {

		try {
			super.paintComponent(graphics);
			Graphics2D graphicsDimension = (Graphics2D) graphics;
			graphicsDimension.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			for (Point p1 : shapeOrigin.keySet()) {
				String currShape = shapeOrigin.get(p1);
				if (currShape.equalsIgnoreCase("rectangle")) {
					graphicsDimension.drawRect(p1.x, p1.y, 100, 80);
				} else if (currShape.equalsIgnoreCase("square")) {
					graphicsDimension.drawRect(p1.x, p1.y, 80, 80);
				} else if (currShape.equalsIgnoreCase("circle")) {
					graphicsDimension.drawOval(p1.x-40, p1.y-40, 80, 80);
					graphicsDimension.fillOval(p1.x-3, p1.y-3, 6, 6);
				} else if (currShape.equalsIgnoreCase("triangle")) {
					graphicsDimension.drawPolygon(new int[] { p1.x - 40, p1.x, p1.x + 40 },
							new int[] { p1.y + 40, p1.y - 40, p1.y + 40 }, 3);
				} else {
					System.out.println("Shape not selected");
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private class DrawBoardMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent event) {

			try {
				selectedShapeName = ClickedShape.shapeName;
				if (selectedShapeName.isEmpty() || (selectedShapeName == null)) {
					System.out.println("selectedShapeName");
					JOptionPane.showMessageDialog(null, "Please select a shape");
				} else {
					shapeOrigin.put(new Point(event.getX(), event.getY()), selectedShapeName);
					repaint();
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, e1);
			}
		}

		@Override
		public void mousePressed(MouseEvent event) {

			try {
				for (Point point : shapeOrigin.keySet()) {
					if (new Rectangle2D.Double(event.getX() - 80, event.getY() - 80, 80, 80).contains(point)) {
						draggedShapeName = shapeOrigin.get(point);
						shapeOrigin.remove(point);
						break;
					}
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

		@Override
		public void mouseReleased(MouseEvent event) {

			try {
				shapeOrigin.put(new Point(event.getX(), event.getY()), draggedShapeName);
				repaint();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
