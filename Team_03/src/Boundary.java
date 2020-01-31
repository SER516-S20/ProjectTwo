/*This class returns a decission on whether a shape has to be dragged or not*/
public class Boundary {
	static Object selectedObject;

	/*
	 * The method is used to check whether the click(mouse click) is inside circle
	 * ,square or triangle
	 */
	boolean polygonCheck(int x1, int y1, int x2, int y3, int x, int y) {
		if (x >= x1 && x <= x2 && y >= y1 && y <= y3) {
			return true;
		}
		return false;
	}

	public boolean checkBoundary(int cordinateX, int cordinateY) {

		for (int i = 0; i < Frame.drawingArea.listOfShapes.size(); i++) {
			Object object = Frame.drawingArea.listOfShapes.get(i);
			if (object instanceof Square) {
				Square square = (Square) object;
				int squareX = square.getCordinateX();
				int squareY = square.getCordinateY();
				if (polygonCheck(squareX, squareY, squareX + square.SQUARE_WIDTH, squareY + square.SQUARE_HEIGHT,
						cordinateX, cordinateY)) {
					selectedObject = square;
					return true;
				}
			} else if (object instanceof Circle) {
				Circle circle = (Circle) object;
				int circleX = circle.getCordinateX();
				int circleY = circle.getCordinateY();
				if (polygonCheck(circleX, circleY, circleX + circle.CIRCLE_WIDTH, circleY + circle.CIRCLE_HEIGHT,
						cordinateX, cordinateY)) {
					selectedObject = circle;
					return true;
				}
			} else if (object instanceof Triangle) {
				Triangle triangle = (Triangle) object;
				int triangleX = triangle.getCordinateX();
				int triangleY = triangle.getCordinateY();
				if (polygonCheck(triangleX - triangle.TRIANGLE_SIZE, triangleY, triangleX + triangle.TRIANGLE_SIZE,
						triangleY + triangle.TRIANGLE_SIZE, cordinateX, cordinateY)) {
					selectedObject = triangle;
					return true;
				}
			}

		}

		return false;
	}
}
