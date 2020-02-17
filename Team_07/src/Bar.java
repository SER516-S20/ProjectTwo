import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Karandeep Singh Grewal
 * @since 02-16-2020
 */

public class Bar extends JPanel {
    public Bar() {
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if (MainWindow.selectedBarOne == null) {
                    MainWindow.selectedBarOne = (Bar) mouseEvent.getSource();
                    Point tempPoint = MainWindow.selectedBarOne.getParent().getLocation();
                    if (mouseEvent.getSource().toString().contains("Left")) {
                        MainWindow.x1.add(tempPoint.x + 20);
                    } else {
                        MainWindow.x1.add(tempPoint.x + 70);
                    }
                    MainWindow.y1.add(tempPoint.y + 50);
                    MainWindow.bar1.add((Bar) mouseEvent.getSource());

                } else if (MainWindow.selectedBarTwo == null) {
                    MainWindow.selectedBarTwo = (Bar) mouseEvent.getSource();
                    Point tempPoint = MainWindow.selectedBarTwo.getParent().getLocation();
                    if (mouseEvent.getSource().toString().contains("Left")) {
                        MainWindow.x2.add(tempPoint.x + 20);
                    } else {
                        MainWindow.x2.add(tempPoint.x + 70);
                    }
                    MainWindow.y2.add(tempPoint.y + 50);
                    MainWindow.bar2.add((Bar) mouseEvent.getSource());

                    RightPanel.transparent.repaint();
                    RightPanel.transparent.revalidate();

                }
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
