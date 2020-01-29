/**
 * @author Ashwin Srinivasan
 * @since 01/28/2020
 * @version 1.0
 */

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener extends MouseAdapter {
    private Point startingPoint;
    public void mousePressed(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        Square square = new Square();
        square.setPosition(x,y);
        new DrawingArea().addSquare(square);
    }
}
