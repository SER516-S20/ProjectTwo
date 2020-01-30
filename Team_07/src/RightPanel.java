import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class RightPanel implements Panel {
    JPanel panel;

    RightPanel() {
        panel = new JPanel();
        panel.setBounds(200, 0, 800, 800);
        panel.setBackground(Color.GRAY);
        makeShapes(panel);

    }

    final int[] X = new int[1];
    final int[] Y = new int[1];
    
    public void drag(JPanel shape){
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
                else if (mainFrame.selectedShape.contains("Circle"))
                    shape = new Circle();
                shape.setBounds(mouseEvent.getX() - 100, mouseEvent.getY() - 100, mouseEvent.getX() + 100, mouseEvent.getY() + 100);
                panel.add(shape);
                panel.setBackground(Color.WHITE);
                System.out.println("Touched");
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
