import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;
/** 
 * @author Nikitha
 * @Since 1-26-2020
 * @version 1.0
 */ 
public class OptionsPanel extends JPanel
{
	public OptionsPanel()
	{
		Dimension size = new Dimension(-200,600);
		setPreferredSize(size);
		Border blackline = BorderFactory.createLineBorder(Color.black);
		setBorder(blackline);	
		setLayout(new GridLayout(3,1));
		Circle circle_button = new Circle();
		add(circle_button);
		Triangle triangle_button = new Triangle();
		add(triangle_button);
		Square square_button = new Square();
		add(square_button);
	}
}
