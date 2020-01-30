import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class RightPanel implements Panel {
    JPanel panel;

    RightPanel() {
        panel = new JPanel();
        panel.setBounds(200, 0, 800, 800);
        panel.setBackground(Color.GRAY);
        makeShapes(panel);

    }

    public void makeShapes(JPanel panel) {
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                JPanel shape = new Triangle();
                if (mainFrame.selectedShape.contains("Square"))
                    shape = new Square();
                else if (mainFrame.selectedShape.contains("Circle"))
                    shape = new Circle();
                shape.setBounds(mouseEvent.getX() - 100, mouseEvent.getY() - 100, mouseEvent.getX() + 100, mouseEvent.getY() + 100);
                panel.add(shape);
                panel.setBackground(Color.RED);
                System.out.println("Touched");
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
