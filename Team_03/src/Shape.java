import java.awt.Graphics;

/**
 * @author Nachiappan Lakshmanan
 * @version 1.0
 */
/*
 * interface shape which is implemented by circle, triangle and square
 */
public interface Shape {

	public void setPosition(int x, int y);

	public void draw(Graphics g);

}
