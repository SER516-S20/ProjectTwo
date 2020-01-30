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

	private int cordX;
	private int cordY;

	static final int NUMBER_OF_LINES = 3;
	static final int TRIANGLE_SIZE = 30;

	@Override
	public void setPosition(int x, int y) {
		this.cordX = x;
		this.cordY = y;
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.BLACK);

		int xAxis[] = new int[] { cordX, cordX - TRIANGLE_SIZE, cordX + TRIANGLE_SIZE };
		int yAxis[] = new int[] { cordY, cordY + TRIANGLE_SIZE, cordY + TRIANGLE_SIZE };

		g.drawPolygon(xAxis, yAxis, NUMBER_OF_LINES);
		g.fillPolygon(xAxis, yAxis, NUMBER_OF_LINES);

	}

}
