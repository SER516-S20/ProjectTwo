import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JPanel;

public class LeftPanel extends JPanel
{
	private RoundButton roundButton = new RoundButton("Round");
	private TriangleButton triangleButton = new TriangleButton("Triangle");
	private RectangleButton rectangleButton = new RectangleButton("Rectangle");
	
	public LeftPanel()
	{
		GridLayout gridLayout = new GridLayout(3,1);
		this.add(roundButton);
		this.add(triangleButton);
		this.add(rectangleButton);
		this.setLayout(gridLayout);
	}
	
	public void SetMouseAdapter_RoundButton(MouseAdapter adapter) 
	{
		roundButton.addMouseListener(adapter);
	}
	
	public void SetMouseAdapter_TriangleButton(MouseAdapter adapter) 
	{
		triangleButton.addMouseListener(adapter);
	}
	
	public void SetMouseAdapter_RectangleButton(MouseAdapter adapter) 
	{
		rectangleButton.addMouseListener(adapter);
	}
}
