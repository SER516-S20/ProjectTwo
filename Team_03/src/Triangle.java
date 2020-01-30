import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Nachiappan Lakshmanan
 * @version 1.0
 */

/*
 * This class is used to create Triangle shape at a particular position for the
 * given X and Y cordinate
 */
public class Triangle implements Shape {

	private int cordinateX;
	private int cordinateY;

	static final int NUMBER_OF_LINES = 3;
	static final int TRIANGLE_SIZE = 30;

	@Override
	public void setPosition(int x, int y) {
		this.cordinateX = x;
		this.cordinateY = y;
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.BLACK);

		int xAxis[] = new int[] { cordinateX, cordinateX - TRIANGLE_SIZE, cordinateX + TRIANGLE_SIZE };
		int yAxis[] = new int[] { cordinateY, cordinateY + TRIANGLE_SIZE, cordinateY + TRIANGLE_SIZE };

		g.drawPolygon(xAxis, yAxis, NUMBER_OF_LINES);
		g.fillPolygon(xAxis, yAxis, NUMBER_OF_LINES);

	}

}
