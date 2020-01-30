import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class RightPanel implements Panel {
    JPanel panel;

    RightPanel() {
        panel = new JPanel();
        panel.setBounds(200, 0, 800, 800);
        panel.setBackground(new Color(200, 200, 200));
        makeShapes(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    }

    public void makeShapes(JPanel panel) {
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                JPanel shape = new Triangle();
                panel.setBackground(Color.white);
                panel.add(shape);
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
