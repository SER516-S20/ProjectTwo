import javax.swing.*;
import java.awt.*;

/*
 * @author Karandeep Singh Grewal
 * @since 01-26-2020
 */

public class mainFrame extends JFrame {
    static int selectedShape = 1;
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame("SER574-Project-Team07");
        mainWindow.setSize(1000, 800);

        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(0, 0, 200, 800);
        leftPanel.setBackground(Color.gray);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        JPanel triangle = new Triangle();
        leftPanel.add(triangle);
        leftPanel.add(new Circle());
        leftPanel.add(new Square());


        JPanel rightPanel = new JPanel();
        rightPanel.setBounds(200, 0, 800, 800);
        rightPanel.setBackground(Color.WHITE);

        mainWindow.add(rightPanel);
        mainWindow.add(leftPanel);
        mainWindow.setLayout(null);
        mainWindow.setVisible(true);
    }
}

