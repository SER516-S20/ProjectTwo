import java.awt.*;
import javax.swing.*;
/** 
 * @author Nikitha
 * @Since 1-26-2020
 * @version 1.0
 */ 
public class Frame extends JFrame
{
	private static final String FRAME_TITLE = "Team4";
	
	public Frame()
	{
	    this.setTitle(FRAME_TITLE);
	    this.setMinimumSize(new Dimension(800, 600));
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container content = this.getContentPane();
	    content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
	    content.add(new OptionsPanel());
	    content.add(new DrawingCanvas());
	    this.pack();
	    this.setLocationRelativeTo(null);
	    this.setVisible(true);
	}
	
	public static void main(String[] args) {
		    new Frame();
	}
}
