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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MyFileManager {
	
	private static RightPanel rightPanel;
	private JFrame parentFrame;
	private Object object;
	JFileChooser fileChooser;
	Hashtable<Integer, JButton> shapes;
	
	MyFileManager()
	{
		
	}
	
	MyFileManager(RightPanel rightPanel)
	{
		this.rightPanel = rightPanel;
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
			
			saver(fileToSave);
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
			File fileToOpen = fileChooser.getSelectedFile();
			opener(fileToOpen);
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
			transformer.transform(source, result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void opener(File file)
	{
		try
		{
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(file);
			doc.getDocumentElement().normalize();  
			//System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			NodeList nodeList = doc.getElementsByTagName("shape");
			for(int i = 0;i<nodeList.getLength();i++)
			{
				Node node = nodeList.item(i);
				//System.out.println("\nNode Name :" + node.getNodeName());
				if (node.getNodeType() == Node.ELEMENT_NODE)   
				{  
				Element eElement = (Element) node;
				int ID = Integer.parseInt(node.getAttributes().getNamedItem("id").getNodeValue());
				switch(eElement.getElementsByTagName("type").item(0).getTextContent())
				{
				case "round":
					rightPanel.addRound(ID);
					break;
				case "rectangle":
					rightPanel.addRectangle(ID);
					break;
				default:
					rightPanel.addTriangle(ID);
					break;
				}
//				System.out.println("Student id: "+ eElement.getElementsByTagName("id").item(0).getTextContent());  
//				System.out.println("First Name: "+ eElement.getElementsByTagName("firstname").item(0).getTextContent());  
//				System.out.println("Last Name: "+ eElement.getElementsByTagName("lastname").item(0).getTextContent());  
//				System.out.println("Subject: "+ eElement.getElementsByTagName("subject").item(0).getTextContent());  
//				System.out.println("Marks: "+ eElement.getElementsByTagName("marks").item(0).getTextContent());  
				}  
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
