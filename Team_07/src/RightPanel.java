import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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


    public void drag(JPanel shape) {
        final int[] X = new int[1];
        final int[] Y = new int[1];
        shape.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                shape.setLocation(e.getXOnScreen() + X[0],
                        e.getYOnScreen() + Y[0]);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                X[0] = shape.getX() - e.getXOnScreen();
                Y[0] = shape.getY() - e.getYOnScreen();
            }
        });
    }
    
    public void makeShapes(JPanel panel) {
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                JPanel shape = new Triangle();
                if (mainFrame.selectedShape.contains("Square"))
                    shape = new Square();
                if (mainFrame.selectedShape.contains("Circle"))
                    shape = new Circle();
                shape.setBounds(mouseEvent.getX() - 50, mouseEvent.getY() - 50, mouseEvent.getX() + 50, mouseEvent.getY() + 50);
                panel.add(shape);
                panel.revalidate();
                panel.repaint();
                panel.setBackground(Color.WHITE);
                System.out.println("Touched");
                System.out.println(panel);
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
