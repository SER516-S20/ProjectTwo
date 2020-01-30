import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * @author Karandeep Singh Grewal
 * @author Aditya Bajaj
 * @since 01-29-2020
 */

//left panel from where we select shapes
public class LeftPanel implements Panel {
    JPanel panel;

    LeftPanel() {
        panel = new JPanel();
        panel.setBounds(0, 0, 200, 800);
        panel.setBackground(new Color(210, 210, 210));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel triangle = new Triangle();
        JPanel circle = new Circle();
        JPanel square = new Square();

        panel.add(triangle);
        panel.add(circle);
        panel.add(square);

        for (Object shape : panel.getComponents()) {
            selectShape((JPanel) shape);
        }
    }

    /*
     *Adds onClick Listener to the Shape
     *Shape is stored in mainFrame.java/selectedShape
     */
    public void selectShape(JPanel shape) {
        shape.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                mainWindow.selectedShape = shape.toString().substring(0, shape.toString().indexOf('['));
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
