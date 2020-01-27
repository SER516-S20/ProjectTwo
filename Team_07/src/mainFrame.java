import javax.swing.*;
import java.awt.*;

public class mainFrame extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("SER574-Project-Team07");
        f.setSize(1000, 800);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 200, 800);
        panel.setBackground(Color.gray);
        JPanel panel1 = new JPanel();
        panel1.setBounds(200, 0, 800, 800);
        panel1.setBackground(Color.WHITE);
        f.add(panel1);
        f.add(panel);
        f.setLayout(null);
        f.setVisible(true);
    }
}
