import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseMotionListener;

public class DrawingArea extends JPanel {

	static ArrayList<Shape> listOfShapes = new ArrayList<>();


	DrawingArea() {

		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(800, 600));
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


}
