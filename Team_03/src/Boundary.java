/**
 * Boundary.java - a class to check if the point selected resides inside any shape
 * @author chandan yadav
 * @version 1.0
 * @since 01/26/2020
 */
public class Boundary {

	static Object selectedObject;

	private static boolean polygonCheck(int x1, int y1, int x2, int y3, int x, int y) {
		return x >= x1 && x <= x2 && y >= y1 && y <= y3;
	}

	public static boolean checkBoundary(int coordinateX, int coordinateY) {
		for (int i = 0; i < DrawingArea.listOfShapes.size(); i++) {
			Object object = DrawingArea.listOfShapes.get(i);
			if (object instanceof Square) {
				Square square = (Square) object;
				int squareX = square.getCoordinateX();
				int squareY = square.getCoordinateY();
				if (polygonCheck(squareX, squareY, squareX + Square.SQUARE_WIDTH, squareY + Square.SQUARE_HEIGHT,
						coordinateX, coordinateY)) {
					selectedObject = square;
					return true;
				}
			} else if (object instanceof Circle) {
				Circle circle = (Circle) object;
				int circleX = circle.getCoordinateX();
				int circleY = circle.getCoordinateY();
				if (polygonCheck(circleX, circleY, circleX + Circle.CIRCLE_WIDTH, circleY + Circle.CIRCLE_HEIGHT,
						coordinateX, coordinateY)) {
					selectedObject = circle;
					return true;
				}
			} else if (object instanceof Triangle) {
				Triangle triangle = (Triangle) object;
				int triangleX = triangle.getCoordinateX();
				int triangleY = triangle.getCoordinateY();
				if (polygonCheck(triangleX - Triangle.TRIANGLE_SIZE, triangleY, triangleX + Triangle.TRIANGLE_SIZE,
						triangleY + Triangle.TRIANGLE_SIZE, coordinateX, coordinateY)) {
					selectedObject = triangle;
					return true;
				}
			}
		}
		return false;
	}

}
