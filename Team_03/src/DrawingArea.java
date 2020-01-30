import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/*
 *@author Ashutosh Dey
 */

public class DrawingArea extends JPanel {

	static ArrayList<Shape> listOfShapes = new ArrayList<Shape>();
	static final int DRAWING_AREA_HEIGHT = 800;
	static final int DRAWING_AREA_WIDTH = 600;

	DrawingArea() {
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(DRAWING_AREA_HEIGHT, DRAWING_AREA_WIDTH));
		MouseListener ml = new MouseListener();
		addMouseListener(ml);
		addMouseMotionListener(ml);
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

	public void addSquare(Square square) {
		listOfShapes.add(square);
		repaint();
	}

	public void addTriangle(Triangle triangle) {
		listOfShapes.add(triangle);
		repaint();
	}

	public void addCircle(Circle circle) {
		listOfShapes.add(circle);
		repaint();
	}

	public void repaintOnDrag() {
		repaint();
	}

}
