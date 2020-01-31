import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

/**
 * This class creates selected shape on the right panel with the help of x and y
 * coordinates
 * 
 * @author Raghavan
 * @version 1.0
 */

public class RightPanel extends JPanel {

	int x, y;
	private static final long serialVersionUID = 1L;

	/**
	 * Uses graphics to draw different shape components
	 * 
	 * @param graphics
	 */
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		for (Shape shape : Frame.getShapes()) {
			if (shape.getBounds().getX() != 50) {
				Graphics2D g2 = (Graphics2D) graphics;
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.draw(shape);
			}
		}
		ShapesEnum selectedShape = LeftPanelMouseListener.getSelectedShape();
		if (selectedShape == ShapesEnum.SQUARE) {
			Square square = new Square();
			square.drawShape(graphics, x, y);
		} else if (selectedShape == ShapesEnum.TRIANGLE) {
			Triangle triangle = new Triangle();
			triangle.drawShape(graphics, x, y);
		} else if (selectedShape == ShapesEnum.CIRCLE) {
			Circle circle = new Circle();
			circle.drawShape(graphics, x, y);
		}

		this.setBackground(Color.WHITE);

		this.addMouseListener(new MouseAdapter() {
			/**
			 * Overridden method to add mouse click event handler.
			 * Track x and y coordinate when mouse dragged
			 */
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				for (int i = Frame.getShapes().size() - 1; i >= 0; i--) {
					Shape shape = Frame.getShapes().get(i);
					if (shape.contains(e.getPoint())) {
						LeftPanelMouseListener.markIsClickedTrue(Frame.getShapesMap().get(Frame.getShapes().get(i)));
						Frame.getShapes().remove(i);
					}
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				repaint();
			}
		});
	}

}
