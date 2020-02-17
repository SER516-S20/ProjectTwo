import javax.swing.*;
import java.awt.*;

/**
 * @author Karandeep Singh Grewal
 * @since 02-17-2020
 */

public class TransparentDrawingArea extends JPanel {
    TransparentDrawingArea() {
        setOpaque(false);
        setBounds(0, 0, 800, 800);
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics tempGraphics) {
        final Color WHITE = new Color(255, 255, 255, 240);
        tempGraphics.setColor(WHITE);
        Graphics2D tempGraphics2D = (Graphics2D) tempGraphics;
        for (int i = 0; i < MainWindow.y2.size(); i++) {
//            System.out.println("Drawing line"+i+MainWindow.x1.get(i)+" "+ MainWindow.y1.get(i)+" "+MainWindow.x2.get(i)+" "+MainWindow.y2.get(i));
            tempGraphics2D.setStroke(new BasicStroke(3));
            tempGraphics2D.drawLine(MainWindow.x1.get(i), MainWindow.y1.get(i), MainWindow.x2.get(i), MainWindow.y2.get(i));
            MainWindow.selectedBarOne = null;
            MainWindow.selectedBarTwo = null;
        }
    }
}
