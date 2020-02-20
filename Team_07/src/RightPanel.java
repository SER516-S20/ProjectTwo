import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @author Karandeep Singh Grewal
 * @author Aditya Bajaj
 * @author Praveen
 * @since 01-29-2020
 */

//right panel where we create shapes
public class RightPanel {
    final JPanel panel;
    static JPanel transparent = new TransparentDrawingArea();

    RightPanel() {
        panel = new JPanel();
        panel.setBounds(200, 0, 800, 800);
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        makeShapes(panel);
        panel.add(transparent);
    }

    /*makes the shape draggable*/
    public void drag(JPanel shape) {
        final int[] dragX = new int[1];
        final int[] dragY = new int[1];
        shape.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                Cursor moveCursor = new Cursor(Cursor.MOVE_CURSOR);
                shape.setCursor(moveCursor);
                shape.getGraphics().setColor(shape.getGraphics().getColor().brighter());
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
                shape.setCursor(defaultCursor);
            }
        });
        shape.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int mouseLocationX = e.getXOnScreen() + dragX[0];
                int mouseLocationY = e.getYOnScreen() + dragY[0];
                if (mouseLocationX > 650) {
                    mouseLocationX = 650;
                } else if (mouseLocationX < -50) {
                    mouseLocationX = -50;
                }
                if (mouseLocationY > 625) {
                    mouseLocationY = 625;
                } else if (mouseLocationY < -50) {
                    mouseLocationY = -50;
                }
                shape.setLocation(mouseLocationX,
                        mouseLocationY);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                dragX[0] = shape.getX() - e.getXOnScreen();
                dragY[0] = shape.getY() - e.getYOnScreen();
            }
        });
    }

    /*creates the shape when we click on the mouse location*/
    public void makeShapes(JPanel panel) {
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                JPanel shape = null;
                if (MainWindow.selectedShape.contains("Square"))
                    shape = new Square();
                if (MainWindow.selectedShape.contains("Triangle"))
                    shape = new Triangle();
                if (MainWindow.selectedShape.contains("Circle"))
                    shape = new Circle();
                int mouseLocationX = mouseEvent.getX();
                int mouseLocationY = mouseEvent.getY();
                if (shape != null) {
                    shape.setBounds(mouseLocationX - 50, mouseLocationY - 50,
                            mouseLocationX + 50, mouseLocationY + 50);
                    panel.add(shape);
                    panel.revalidate();
                    panel.repaint();
                    drag(shape);
                }
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
    public void deleteAllshapes()
    {
    	panel.removeAll();   
		panel.repaint();
    }
}
