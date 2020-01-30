import javax.swing.*;
import java.awt.*;
public class RightPanel implements Panel {
    JPanel panel;

    RightPanel() {
        panel = new JPanel();
        panel.setBounds(200, 0, 800, 800);
        panel.setBackground(new Color(200, 200, 200));
    }
}
