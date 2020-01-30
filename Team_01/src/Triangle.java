import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

/**
 * @author Raghavan
 *
 */
public class Triangle implements Shapes {

	/**
	 * Draw a triangle using Path2D
	 * @param graphic
	 * @param x - x coordinate for the shape
	 * @param y - y coordinate for the shape
	 */
	@Override
	public void drawShape(Graphics graphic, double x, double y) {
		Path2D path = new Path2D.Double();
		path.moveTo(x, y);
		path.lineTo(x + 100, y - 150);
		path.lineTo(x + 200, y);
		path.closePath();
	
		Graphics2D g2 = (Graphics2D) graphic;
		g2.draw(path);
		
		Frame.addShape(path, ShapesEnum.TRIANGLE);
	}

}
