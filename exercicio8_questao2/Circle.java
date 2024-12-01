package exercicio8_questao2;

public class Circle implements GeometricObject {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
	
	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
	

}
