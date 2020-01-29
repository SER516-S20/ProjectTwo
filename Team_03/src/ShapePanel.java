
import javax.swing.*;
import java.awt.*;

/**
 * @author srinivasan sundar
 * @since 01/26/2020
 * @version 1.0
 */
public class ShapePanel extends JPanel {

    ShapePanel(){
        this.setLayout(new BorderLayout());
        this.add(constructCircle(), BorderLayout.NORTH);
        this.add(constructRectangle(), BorderLayout.CENTER);
        this.add(constructTriangle(), BorderLayout.SOUTH);
    }

    /**
     * returns a JButton with Circle shape on it
     * @return JButton
     */
    private static JButton constructCircle(){
        JButton circleButton = new JButton();
        circleButton.setPreferredSize(new Dimension(190, 190));
        circleButton.setText("Circle");
        return circleButton;
    }

    /**
     * returns a JButton with Rectangle shape on it
     * @return JButton
     */
    private static JButton constructRectangle(){
        JButton rectangleButton = new JButton();
        rectangleButton.setPreferredSize(new Dimension(190, 190));
        rectangleButton.setText("Rectangle");
        return rectangleButton;
    }

    /**
     * returns a JButton with Triangle shape on it
     * @return JButton
     */
    private static JButton constructTriangle(){
        JButton triangleButton = new JButton();
        triangleButton.setPreferredSize(new Dimension(190, 190));
        triangleButton.setText("Triangle");
        return triangleButton;
    }

}
