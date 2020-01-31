import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputAdapter;

/**
 * This class is used to drag a particular shape and  create a shape on mouse click
 * @author ashwin srinivasan
 * @version 1.0
 * @since 01/28/2020
 */
class MouseListener extends MouseInputAdapter {

	private boolean activateDrag = false;

	public void mousePressed(MouseEvent e) {
		Point startPoint = e.getPoint();
		int coordinateX = Math.min(startPoint.x, e.getX());
		int coordinateY = Math.min(startPoint.y, e.getY());
		if (Boundary.checkBoundary(coordinateX, coordinateY)) {
			activateDrag = true;
		} else {
			activateDrag = false;
			if (JButtonActionListener.isSquarePanelClicked) {
				Square square = new Square();
				square.setPosition(coordinateX, coordinateY);
				Frame.drawingArea.addSquare(square);
			} else if (JButtonActionListener.isCirclePanelClicked) {
				Circle circle = new Circle();
				circle.setPosition(coordinateX, coordinateY);
				Frame.drawingArea.addCircle(circle);
			} else if (JButtonActionListener.isTrianglePanelClicked) {
				Triangle triangle = new Triangle();
				triangle.setPosition(coordinateX, coordinateY);
				Frame.drawingArea.addTriangle(triangle);
			} else {
				JOptionPane.showMessageDialog(null, "Please select a shape");
			}
		}
	}

	public void mouseDragged(MouseEvent event) {
		if (activateDrag) {
			int coordinateX = event.getX();
			int coordinateY = event.getY();
			Object object = Boundary.selectedObject;
			if (object instanceof Square) {
				Square square = (Square) object;
				square.setPosition(coordinateX, coordinateY);
				Frame.drawingArea.repaint();
			} else if (object instanceof Circle) {
				Circle circle = (Circle) object;
				circle.setPosition(coordinateX, coordinateY);
				Frame.drawingArea.repaint();
			} else if (object instanceof Triangle) {
				Triangle triangle = (Triangle) object;
				triangle.setPosition(coordinateX, coordinateY);
				Frame.drawingArea.repaintOnDrag();
			}
		}
	}

}