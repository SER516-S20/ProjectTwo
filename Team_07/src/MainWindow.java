import javax.swing.*;

/**
 * @author Karandeep Singh Grewal
 * @since 01-26-2020
 */

public class MainWindow extends JFrame {
    static String selectedShape = "None";
    static JFrame mainWindow;

    public static void main(String[] args) {
        mainWindow = new JFrame("SER516-Project-Team07");
        mainWindow.setSize(1000, 800);

        LeftPanel leftPanel = new LeftPanel();
        RightPanel rightPanel = new RightPanel();

        mainWindow.add(leftPanel.panel);
        mainWindow.add(rightPanel.panel);
        mainWindow.setLayout(null);
        mainWindow.setVisible(true);
        mainWindow.setResizable(false);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

