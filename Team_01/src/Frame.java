import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Chandan Kiragadalu Javaregowda
 *
 */
public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private final String title = "Team 1";
	private static List<Shape> shapes = new ArrayList<>();
	private static Map<Shape, ShapesEnum> shapesMap = new HashMap<>();
	private int x, y;

	private Frame() {
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
			JPanel leftPanel = new JPanel() {
				private static final long serialVersionUID = 1L;
				public void paintComponent(Graphics g) {
					super.paintComponent(g);
					Shapes square = new Square();
					square.drawShape(g, 50, 50);
					Shapes circle = new Circle();
					circle.drawShape(g, 50, 350);
					Shapes triangle = new Triangle();
					triangle.drawShape(g, 50, 800);
				}
			};
			leftPanel.setBounds(0, 0, this.getWidth() / 4, this.getHeight());
			leftPanel.setVisible(true);
			this.add(leftPanel);
			
			leftPanel.addMouseListener(new LeftPanelMouseListener());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Create right panel to the frame paintComponent creates new shapes upon click
	 */
	private void createRightpanel() {
		try {
			JPanel rightPanel = new JPanel() {
				private static final long serialVersionUID = 1L;
				/**
				 * Uses Graphics to create shapes
				 * Checks in shapes list for all the list and creates all the shapes in the right
				 * panel. This is required while repaint() is called as all the existing components 
				 * on the right panel will be erased by default. We need to re-draw all the components
				 * each time repaint() is invoked.
				 */
				public void paintComponent(Graphics g) {
					super.paintComponent(g);
					for (Shape shape : getShapes()) {
						if (shape.getBounds().getX() != 50) {
							Graphics2D g2 = (Graphics2D) g;
							g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
							g2.draw(shape);
						}
					}
					ShapesEnum selectedShape = LeftPanelMouseListener.getSelectedShape();
					if (selectedShape == ShapesEnum.SQUARE) {
						new Square().drawShape(g, x, y);
					} else if (selectedShape == ShapesEnum.TRIANGLE) {
						new Triangle().drawShape(g, x, y);
					} else if (selectedShape == ShapesEnum.CIRCLE) {
						new Circle().drawShape(g, x, y);
					}
				}

			};
			rightPanel.setBackground(Color.WHITE);
			rightPanel.setBounds(this.getWidth() / 4, 0, 3 * this.getWidth() / 4, this.getHeight());
			rightPanel.setVisible(true);
			this.add(rightPanel);
			
			rightPanel.addMouseListener(new MouseAdapter() {
				/**
				 * Overridden method to add mouse click event handler.
				 * Will call paintComponent(Graphics) method using repaint().
				 * 
				 */
				@Override
				public void mouseClicked(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Method to update shapes and shapesMap lists.
	 * Used to track the shapes created and kind of shape created.
	 * @param shape
	 * @param shapesEnum
	 */
	public static void addShape(Shape shape, ShapesEnum shapesEnum) {
		if (!getShapes().contains(shape)) {
			getShapes().add(shape);
			getShapesMap().put(shape, shapesEnum);
		}
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

	/**
	 * @param args This method schedules a job for the event-dispatching thread.
	 *             This method is responsible for creating and showing application's
	 *             GUI.
	 */
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Frame frame = new Frame();
				frame.createLeftPanel();
				frame.createRightpanel();
			}
		});
	}
}
