package exercicio8_questao5;

public class TestResizableCircle {
	public static void main(String[] args) {
		ResizableCircle resizableCircle = new ResizableCircle(5);
		
		System.out.println(resizableCircle);
		resizableCircle.resize(10);
		
		System.out.println(resizableCircle);
		
		System.out.println(resizableCircle.getArea());
		System.out.println(resizableCircle.getPerimeter());
	}
}
