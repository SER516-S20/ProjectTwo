/**
 * @author Ashwin Srinivasan
 * @since 01/28/2020
 * @version 1.0
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used to identify which shape has been selected by the user
 */

public class JButtonActionListener {

    static boolean isCirclePanelClicked = false, isTrianglePanelClicked = false, isSquarePanelClicked = false;

    public void addActionListener() {

        addCircleButtonActionListener();
        addSquareButtonActionlistener();
        addTriangleButtonActionlistener();

    }

    public void activateCirclePanel() {
        isCirclePanelClicked = true;
        ShapePanel.circleButton.setBackground(Color.YELLOW);
        ShapePanel.circleButton.setOpaque(true);

    }

    public void deActivateCirclePanel() {
        isCirclePanelClicked = false;
        ShapePanel.circleButton.setBackground(Color.GRAY);
        ShapePanel.circleButton.setOpaque(true);
    }

    public void activateSquarePanel() {
        isSquarePanelClicked = true;
        ShapePanel.squareButton.setBackground(Color.YELLOW);
        ShapePanel.squareButton.setOpaque(true);

    }

    public void deActivateSquarePanel() {
        isSquarePanelClicked = false;
        ShapePanel.squareButton.setBackground(Color.GRAY);
        ShapePanel.squareButton.setOpaque(true);
    }

    public void activateTrianglePanel() {
        isTrianglePanelClicked = true;
        ShapePanel.triangleButton.setBackground(Color.YELLOW);
        ShapePanel.triangleButton.setOpaque(true);

    }

    public void deActivateTrianglePanel() {
        isTrianglePanelClicked = false;
        ShapePanel.triangleButton.setBackground(Color.GRAY);
        ShapePanel.triangleButton.setOpaque(true);
    }

    public void addCircleButtonActionListener() {
        ShapePanel.circleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isCirclePanelClicked) {
                    activateCirclePanel();
                    deActivateSquarePanel();
                    deActivateTrianglePanel();

                } else {
                    deActivateCirclePanel();
                }
            }
        });
    }

    public void addSquareButtonActionlistener() {
        ShapePanel.squareButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isSquarePanelClicked) {
                    activateSquarePanel();
                    deActivateCirclePanel();
                    deActivateTrianglePanel();

                } else {
                    deActivateSquarePanel();
                }
            }
        });
    }

    public void addTriangleButtonActionlistener() {
        ShapePanel.triangleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isTrianglePanelClicked) {
                    activateTrianglePanel();
                    deActivateSquarePanel();
                    deActivateCirclePanel();

                } else {
                    deActivateTrianglePanel();
                }
            }
        });
    }

}
