package Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    int left, top;      // Position of top left corner of rectangle that bounds this shape.
    int width, height;  // Size of the bounding rectangle.
    Color color = Color.WHITE;

    public void reshape(int left, int top, int width, int height) {
        // Set the position and size of this shape.
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void moveBy(int dx, int dy) {
        // Move the shape by dx pixels horizontally and dy pixels vertically
        // (by changing the position of the top-left corner of the shape).
        left += dx;
        top += dy;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean containsPoint(int x, int y) {
        // Check whether the shape contains the point (x,y).
        if (x >= left && x < left+width && y >= top && y < top+height)
            return true;
        else
            return false;
    }

    public abstract void draw(GraphicsContext g);
    // Draw the shape in the graphics context g.

}