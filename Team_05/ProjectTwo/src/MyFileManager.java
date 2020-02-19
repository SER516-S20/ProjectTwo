import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFileManager {
	
	private static RightPanel rightPanel;
	private JFrame parentFrame;
	JFileChooser fileChooser;
	
	MyFileManager()
	{
		
	}
	
	public void save()
	{
		parentFrame = new JFrame();
		fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Save file");
		int selection = fileChooser.showSaveDialog(parentFrame);
		if(selection == fileChooser.APPROVE_OPTION)
		{
			File fileToSave = fileChooser.getSelectedFile();
		}
	}
	
	public void open()
	{
		parentFrame = new JFrame();
		fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Open file");
		int selection = fileChooser.showOpenDialog(parentFrame);
		if(selection == fileChooser.APPROVE_OPTION)
		{
			File fileToSave = fileChooser.getSelectedFile();
		}
	}

}
