
public class Square implements Shape {
	double height;
	double width;
	double area;

	public Square(double h, double w) {
		height = h;
		width = w;
	}

	@Override
	public double area() {
		area = height * width;
		return area;
	}

}
