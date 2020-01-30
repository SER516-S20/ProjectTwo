import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;

public class LeftPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private RoundButton roundButton = new RoundButton("Round");
	private TriangleButton triangleButton = new TriangleButton("Triangle");
	private RectangleButton rectangleButton = new RectangleButton("Rectangle");
	private Dimension buttonSize = new Dimension(100,100);
	
	public LeftPanel()
	{
		roundButton.setPreferredSize(buttonSize);
		triangleButton.setPreferredSize(buttonSize);
		rectangleButton.setPreferredSize(buttonSize);
		this.add(roundButton);
		this.add(triangleButton);
		this.add(rectangleButton);
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
