import java.awt.Graphics;

/**
 * interface shape which is implemented by circle, triangle and square
 * @author Nachiappan Lakshmanan
 * @version 1.0
 * @since 01/29/2020
 */
public interface Shape {

	public void setPosition(int x, int y);

	public void draw(Graphics g);

}
