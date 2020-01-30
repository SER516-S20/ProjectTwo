import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


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

    public void selectShape(JPanel shape) {
        shape.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                mainFrame.selectedShape = shape.toString().substring(0, shape.toString().indexOf('['));
                System.out.println(mainFrame.selectedShape);
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
