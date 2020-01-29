
import javax.swing.*;
import java.awt.*;

/**
 * @author srinivasan sundar
 * @since 01/26/2020
 * @version 1.0
 */
public class ShapePanel extends JPanel {

    static JButton circleButton, squareButton, triangleButton ;

    ShapePanel() {
        this.setLayout(new BorderLayout());
        this.add(constructCircle(), BorderLayout.NORTH);
        this.add(constructSquare(), BorderLayout.CENTER);
        this.add(constructTriangle(), BorderLayout.SOUTH);
        new JButtonActionListener().addActionListener();
    }

    /**
     * returns a JButton with Circle shape on it
     * @return JButton
     */
    private static JButton constructCircle() {
        circleButton = new JButton();
        circleButton.setPreferredSize(new Dimension(190, 190));
        circleButton.setBackground(Color.GRAY);
        circleButton.setOpaque(true);
        return circleButton;
    }

    /**
     * returns a JButton with Rectangle shape on it
     * @return JButton
     */
    private static JButton constructSquare() {
        squareButton = new JButton();
        squareButton.setPreferredSize(new Dimension(190, 190));
        squareButton.setBackground(Color.GRAY);
        squareButton.setOpaque(true);
        return squareButton;
    }

    /**
     * returns a JButton with Triangle shape on it
     * @return JButton
     */
    private static JButton constructTriangle() {
        triangleButton = new JButton();
        triangleButton.setPreferredSize(new Dimension(190, 190));
        triangleButton.setBackground(Color.GRAY);
        triangleButton.setOpaque(true);
        return triangleButton;
    }

}
