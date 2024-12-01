package exercicio8_questao1;

public class Square extends Rectangle  {
	protected double side;
	
	public Square() {}
	
	public Square(double side) {
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
