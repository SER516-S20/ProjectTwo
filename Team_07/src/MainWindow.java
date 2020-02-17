import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Karandeep Singh Grewal
 * @since 01-26-2020
 */

public class MainWindow extends JFrame {
    static String selectedShape = "None";
    static JFrame mainWindow;
    static Bar selectedBarOne = null;
    static Bar selectedBarTwo = null;
    static List<Integer> x1 = new ArrayList<>();
    static List<Integer> x2 = new ArrayList<>();
    static List<Integer> y1 = new ArrayList<>();
    static List<Integer> y2 = new ArrayList<>();
    static List<Bar> bar1 = new ArrayList<>();
    static List<Bar> bar2 = new ArrayList<>();
    static int linesCreated = 0;
    final int MAXLINES = 100;

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

