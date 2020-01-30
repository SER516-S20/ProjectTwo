package Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SquareShape extends Shape {
    public void draw(GraphicsContext g) {
        g.setFill(color);
        g.fillRect(left, top, width, height);
        g.setStroke(Color.BLACK);
        g.strokeRect(left, top, width, height);
    }
}