/* Version: 1.1
*/

package Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class OvalShape extends Shape {
    public void draw(GraphicsContext g) {
        g.setFill(color);
        g.fillOval(left,top,width,height);
        g.setStroke(Color.BLACK);
        g.strokeOval(left,top,width,height);
    }
    public boolean containsPoint(int x, int y) {
        // Check whether (x,y) is inside this oval.
        double rx = width/2.0;   // horizontal radius of ellipse
        double ry = height/2.0;  // vertical radius of ellipse
        double cx = left + rx;   // x-coord of center of ellipse
        double cy = top + ry;    // y-coord of center of ellipse
        if ( (ry*(x-cx))*(ry*(x-cx)) + (rx*(y-cy))*(rx*(y-cy)) <= rx*rx*ry*ry )
            return true;
        else
            return false;
    }
}
