import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
 * @author Karandeep Singh Grewal
 * @author Praveen
 * @since 01-29-2020
 */

//right panel where we create shapes
public class RightPanel implements Panel {
    JPanel panel;
    final int[] X = new int[1];
    final int[] Y = new int[1];

    RightPanel() {
        panel = new JPanel();
        panel.setBounds(200, 0, 800, 800);
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        makeShapes(panel);

    }

    //makes the shape draggable
    public void drag(JPanel shape) {
        final int[] X = new int[1];
        final int[] Y = new int[1];
        shape.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int final_x = e.getXOnScreen() + X[0];
                int final_y = e.getYOnScreen() + Y[0];
                if (final_x > 650) {
                    final_x = 650;
                } else if (final_x < -50) {
                    final_x = -50;
                }
                if (final_y > 625) {
                    final_y = 625;
                } else if (final_y < -50) {
                    final_y = -50;
                }
                shape.setLocation(final_x,
                        final_y);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                X[0] = shape.getX() - e.getXOnScreen();
                Y[0] = shape.getY() - e.getYOnScreen();
            }
        });
    }

    //creates the shape when we click on the mouse location
    public void makeShapes(JPanel panel) {
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                JPanel shape = new Triangle();
                if (mainWindow.selectedShape.contains("Square"))
                    shape = new Square();
                if (mainWindow.selectedShape.contains("Circle"))
                    shape = new Circle();
                int mouseLocationX = mouseEvent.getX();
                int mouseLocationY = mouseEvent.getY();
                shape.setBounds(mouseLocationX - 50, mouseLocationY - 50, mouseLocationX + 50, mouseLocationY + 50);
                panel.add(shape);
                panel.revalidate();
                panel.repaint();
                drag(shape);
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
