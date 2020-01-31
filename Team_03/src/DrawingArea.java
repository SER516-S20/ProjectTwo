import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author Ashutosh Dey
 * @version 1.0
 * @since 01/28/2020
 */
public class DrawingArea extends JPanel {

	static ArrayList<Shape> listOfShapes = new ArrayList<>();
	private static final int DRAWING_AREA_HEIGHT = 600;
	private static final int DRAWING_AREA_WIDTH = 800;

	DrawingArea() {
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(DRAWING_AREA_WIDTH, DRAWING_AREA_HEIGHT));
		MouseListener mouseListener = new MouseListener();
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < listOfShapes.size(); i++) {
			Object object = listOfShapes.get(i);
			if (object instanceof Square) {
				Square square = (Square) object;
				square.draw(g);
			} else if (object instanceof Triangle) {
				Triangle triangle = (Triangle) object;
				triangle.draw(g);
			} else {
				Circle circle = (Circle) object;
				circle.draw(g);
			}
		}
	}

	void addSquare(Square square) {
		listOfShapes.add(square);
		repaint();
	}

	void addTriangle(Triangle triangle) {
		listOfShapes.add(triangle);
		repaint();
	}

	void addCircle(Circle circle) {
		listOfShapes.add(circle);
		repaint();
	}

	void repaintOnDrag() {
		repaint();
	}

}
