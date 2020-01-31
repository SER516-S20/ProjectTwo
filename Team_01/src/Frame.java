import java.awt.Color;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

/**
 * @author Chandan Kiragadalu Javaregowda
 *
 */
public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private final String title = "Team 1";
	public static List<Shape> shapes = new ArrayList<>();
	private static Map<Shape, ShapesEnum> shapesMap = new HashMap<>();
	LeftPanel leftPanel;
	RightPanel rightPanel;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	public Frame() {
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		setTitle(title);
		setVisible(true);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * Create left panel to the frame
	 */
	private void createLeftPanel() {
		try {
			leftPanel = new LeftPanel();
			leftPanel.setBounds(0, 0, screenSize.width / 4, screenSize.height);
			leftPanel.setVisible(true);
			this.add(leftPanel);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create right panel to the frame paintComponent creates new shapes upon click
	 */
	private void createRightpanel() {
		try {
			rightPanel = new RightPanel();
			rightPanel.setBounds(screenSize.width / 4, 0, 3 * screenSize.width / 4, screenSize.height);
			rightPanel.setVisible(true);
			this.add(rightPanel);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method to update shapes and shapesMap lists. Used to track the shapes created
	 * and kind of shape created.
	 * 
	 * @param shape
	 * @param shapesEnum
	 */
	public static void addShape(Shape shape, ShapesEnum shapesEnum) {
		if (!getShapes().contains(shape)) {
			getShapes().add(shape);
			getShapesMap().put(shape, shapesEnum);
		}
		System.out.println(getShapes());
	}

	public static List<Shape> getShapes() {
		return shapes;
	}

	public static void setShapes(List<Shape> shapes) {
		Frame.shapes = shapes;
	}

	public static Map<Shape, ShapesEnum> getShapesMap() {
		return shapesMap;
	}

	public static void setShapesMap(Map<Shape, ShapesEnum> shapesMap) {
		Frame.shapesMap = shapesMap;
	}

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.createLeftPanel();
		frame.createRightpanel();

	}
}
