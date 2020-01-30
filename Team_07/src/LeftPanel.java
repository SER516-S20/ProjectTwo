import javax.swing.*;
import java.awt.*;
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

    }
}
