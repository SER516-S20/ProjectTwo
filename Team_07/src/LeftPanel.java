import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Karandeep Singh Grewal
 * @author Aditya Bajaj
 * @since 01-29-2020
 */

//left panel from where we select shapes
public class LeftPanel {
    final JPanel panel;

    LeftPanel() {
        this.panel = new JPanel();
        this.panel.setBounds(0, 0, 200, 800);
        this.panel.setBackground(new Color(241, 241, 241));
        this.panel.setLayout(new BoxLayout(this.panel, BoxLayout.Y_AXIS));

        JPanel triangle = new Triangle();
        JPanel circle = new Circle();
        JPanel square = new Square();

        this.panel.add(triangle);
        this.panel.add(circle);
        this.panel.add(square);

        for (Component shape : this.panel.getComponents()) {
            selectShape(shape);
            shape.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }

    }

    /*
     *Adds onClick Listener to the Shape
     *Shape is stored in MainWindow.java/selectedShape
     */
    public void selectShape(Component shape) {
        shape.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                String shapeInfo = shape.toString();
                MainWindow.selectedShape = shapeInfo.substring(0, shapeInfo.indexOf('['));
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
            }
        });
    }
}
