import javax.swing.*;
import java.awt.*;

public class mainFrame extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SER574-Project-Team07");
        frame.setSize(1000, 800);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 200, 800);
        panel.setBackground(Color.gray);

        JPanel panel1 = new JPanel();
        panel1.setBounds(200, 0, 800, 800);
        panel1.setBackground(Color.WHITE);

        frame.add(panel1);
        frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
