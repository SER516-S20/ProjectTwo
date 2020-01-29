/**
 * @author Ashwin Srinivasan
 * @since 01/28/2020
 * @version 1.0
 */

import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

/**
 * This class is used to read the x,y coordinates mouse click and display the selected shape on the DrawingArea
 */

class MouseListener extends MouseInputAdapter {
    private Point startPoint;

    public void mousePressed(MouseEvent e) {
        startPoint = e.getPoint();

        int x = Math.min(startPoint.x, e.getX());
        int y = Math.min(startPoint.y, e.getY());

        if (JButtonActionListener.isSquarePanelClicked) {

            Square square = new Square();
            square.setPosition(x, y);
            Frame.drawingArea.addSquare(square);
        } else if (JButtonActionListener.isCirclePanelClicked) {
            Circle circle = new Circle();
            circle.setPosition(x, y);
            Frame.drawingArea.addCircle(circle);

        } else {
            Triangle triangle = new Triangle();
            triangle.setPosition(x, y);
            Frame.drawingArea.addTriangle(triangle);
        }

    }
}

