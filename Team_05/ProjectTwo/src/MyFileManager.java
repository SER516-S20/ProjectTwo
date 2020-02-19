import java.io.File;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MyFileManager {
	
	private static RightPanel rightPanel;
	private JFrame parentFrame;
	JFileChooser fileChooser;
	Hashtable<Integer, JButton> shapes;
	
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
			System.out.println(fileToSave.toString());
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
	
	private void saver(File file)
	{
		try
		{
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("shapes");
			doc.appendChild(rootElement);
			shapes = rightPanel.getShapes();
			for(int key:shapes.keySet())
			{
				Element shape = doc.createElement("shape");
				rootElement.appendChild(shape);
				shape.setAttribute("id",Integer.toString(key));
				JButton theShape = shapes.get(key);
				Element type = doc.createElement("type");
				if(theShape instanceof RoundButton)
				{
					type.appendChild(doc.createTextNode("round"));
				}
				else if(theShape instanceof RectangleButton)
				{
					type.appendChild(doc.createTextNode("rectangle"));
				}
				else//TriangleButton
				{
					type.appendChild(doc.createTextNode("triangle"));
				}
				shape.appendChild(type);
			}
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
