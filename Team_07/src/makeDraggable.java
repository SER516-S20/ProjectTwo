import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class makeDraggable {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("makeDraggable.java");
        jFrame.setSize(1000, 800);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1000, 800);
        panel.setBackground(Color.gray);

        JButton button = new JButton();
        button.setBounds(200, 200, 200, 200);
        button.setBackground(Color.RED);

        final int[] X = new int[1];
        final int[] Y = new int[1];

        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                button.setLocation(mouseEvent.getXOnScreen() + X[0],
                        mouseEvent.getYOnScreen() + Y[0]);
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                X[0] = button.getX() - mouseEvent.getXOnScreen();
                Y[0] = button.getY() - mouseEvent.getYOnScreen();
            }
        });

        panel.add(button);
        jFrame.add(panel);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}