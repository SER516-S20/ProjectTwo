import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Nachiappan Lakshmanan
 * @version 1.0
 * @since 01/29/2020
 */
public class Triangle implements Shape {

	private int coordinateX;
	private int coordinateY;

	private static final int NUMBER_OF_LINES = 3;
	static final int TRIANGLE_SIZE = 30;
	
	public int getCoordinateX() {
		return coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	@Override
	public void setPosition(int x, int y) {
		this.coordinateX = x;
		this.coordinateY = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		int[] xAxis = new int[] {coordinateX, coordinateX - TRIANGLE_SIZE, coordinateX + TRIANGLE_SIZE };
		int[] yAxis = new int[] {coordinateY, coordinateY + TRIANGLE_SIZE, coordinateY + TRIANGLE_SIZE };
		g.drawPolygon(xAxis, yAxis, NUMBER_OF_LINES);
		g.fillPolygon(xAxis, yAxis, NUMBER_OF_LINES);
	}

}
