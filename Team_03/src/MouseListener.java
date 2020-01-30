import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.event.MouseInputAdapter;

/*This class is used to drag a particular shape and  create a shape on mouse click*/
class MouseListener extends MouseInputAdapter {
	private Point startPoint;
	static boolean activateDrag = false;
	static final String ALERT_MESSAGE = "Please select a shape";

	public void mousePressed(MouseEvent e) {
		startPoint = e.getPoint();

		int cordinateX = Math.min(startPoint.x, e.getX());
		int cordinateY = Math.min(startPoint.y, e.getY());

		if (new Boundary().checkBoundary(cordinateX, cordinateY)) {
			activateDrag = true;
		} else {
			activateDrag = false;
			if (JButtonActionListener.isSquarePanelClicked) {

				Square square = new Square();
				square.setPosition(cordinateX, cordinateY);
				Frame.drawingArea.addSquare(square);

			} else if (JButtonActionListener.isCirclePanelClicked) {

				Circle circle = new Circle();
				circle.setPosition(cordinateX, cordinateY);
				Frame.drawingArea.addCircle(circle);

			} else if (JButtonActionListener.isTrianglePanelClicked) {

				Triangle triangle = new Triangle();
				triangle.setPosition(cordinateX, cordinateY);
				Frame.drawingArea.addTriangle(triangle);
			} else {
				JOptionPane.showMessageDialog(null, ALERT_MESSAGE);

			}
		}

	}

	public void mouseDragged(MouseEvent event) {

		if (activateDrag) {
			int cordinateX = event.getX();
			int cordinateY = event.getY();

			Object object = Boundary.selectedObject;
			if (object instanceof Square) {
				Square square = (Square) object;
				square.setPosition(cordinateX, cordinateY);
				Frame.drawingArea.repaint();
			} else if (object instanceof Circle) {
				Circle circle = (Circle) object;
				circle.setPosition(cordinateX, cordinateY);
				Frame.drawingArea.repaint();
			} else if (object instanceof Triangle) {
				Triangle triangle = (Triangle) object;
				triangle.setPosition(cordinateX, cordinateY);
				Frame.drawingArea.repaintOnDrag();
			}
		}

	}

}