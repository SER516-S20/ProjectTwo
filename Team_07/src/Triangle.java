import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

/*
 * @author Aravind Thillai Villalan
 * @since 01-29-2020
 */
public class Triangle implements Shapes {

	@Override
	public void drawShape(Graphics graphic, double x, double y) {
		Path2D dot=new Path2D.Double();
		dot.moveTo(x, y);
		dot.lineTo(x+100, y-150);
		dot.lineTo(x+200, y);
		dot.closePath();
		
		Graphics2D g2 = (Graphics2D) graphic;
		g2.draw(dot);
	}

}
