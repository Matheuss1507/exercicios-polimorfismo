package exercicio8_questao5;

public class ResizableCircle extends Circle implements Resizable{
	
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public String toString() {
		return "ResizableCircle[Circle[radius=" + radius + "]]";
	}
	
	@Override
	public double resize(int percent) {
		return radius *= percent/100.0;
	}

}
