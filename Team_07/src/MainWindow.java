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

        JMenuBar menuBar = new JMenuBar();
        mainWindow.setJMenuBar(menuBar);
        JMenu file = new JMenu("File");
        menuBar.add(file);
        
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        file.add(open);
        file.add(save);        
        
        LeftPanel leftPanel = new LeftPanel();
        RightPanel rightPanel = new RightPanel();
        
        MenuBar myMenuBar = new MenuBar(rightPanel);
        
        open.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				myMenuBar.open();
				System.out.println("open pressed");
			}
        });
        save.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("save pressed");
				myMenuBar.save();
			}
        });

        mainWindow.add(leftPanel.panel);
        mainWindow.add(rightPanel.panel);
        mainWindow.setLayout(null);
        mainWindow.setVisible(true);
        mainWindow.setResizable(false);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

