import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/*
 * @author Aravind Thillai Villalan
 * @since 01-29-2020
 */

public class Square implements Shapes{

	@Override
	public void drawShape(Graphics graphic, double x, double y) {
		Shape square=new Rectangle2D.Double(x, y,150,150);
		Graphics2D g2 = (Graphics2D) graphic;
		g2.draw(square);
	}

}
