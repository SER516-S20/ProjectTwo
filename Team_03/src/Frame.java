
import javax.swing.*;
import java.awt.*;

/**
 * @author srinivasan sundar
 * @since 01/26/2020
 * @version 1.0
 */
public class Frame extends JFrame{
    static DrawingArea drawingArea;
    
	static final int FRAME_HEIGHT = 800;
	static final int FRAME_WIDTH = 600;

    Frame(){
        this.setTitle("Project Two - Team 3");
        this.setBackground(Color.LIGHT_GRAY);
        this.setSize(new Dimension(FRAME_HEIGHT, FRAME_WIDTH ));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        drawingArea = new DrawingArea();
        this.getContentPane().add(drawingArea);
        this.getContentPane().add(new ShapePanel(), BorderLayout.WEST);
    }

}