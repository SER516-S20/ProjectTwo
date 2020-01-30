/*
 *@author Ashutosh Dey
 */
public class TriangleIcon implements Icon {
    public final int POSITION_DEVIATION = 0;

    public int getIconWidth() {
        return 0;
    }

    public int getIconHeight() {
        return 0;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Triangle triangle = new Triangle();
        triangle.setPosition(x - POSITION_DEVIATION, y - POSITION_DEVIATION);
        triangle.draw(g);

    }

}
