package ch11;

abstract class Figure{ // 추상 클래스로 선언
	abstract void draw(); // 추상 클래스 하위로 선언함
}
interface Shape{ // 인터페이스로 선언함
	public void computeArea(double a, double b);
}
// 추상은 extends로 연동하고 인터페이스는 implements로 연동한다
class Triangle extends Figure implements Shape{
	void draw() {
		System.out.println("삼각형을 그리는 기능");
	}
	public void computeArea(double a, double h) {
		System.out.println("삼각형의 넓이 : "+(a*h/2));
	}
}
class Rectangle extends Figure implements Shape{
	void draw() {
		System.out.println("사각형을 그리는 기능");
	}
	public void computeArea(double a, double h) {
		System.out.println("사각형의 넓이 : "+(a*h));
	}
}
class Oval extends Figure implements Shape{
	void draw() {
		System.out.println("원을 그리는 기능");
	}
	public void computeArea(double a, double h) {
		System.out.println("원의 넓이 : "+(a*h*3.14));
	}
}
class Polydraw{
	// Figure f는 Figure로 속성을 정한다
	public void pdraw(Figure f) {
		f.draw();
	}
	public void pcomputeArea(Shape s, double a, double b) {
		s.computeArea(a, b);
	}
}

public class ex444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polydraw p = new Polydraw();
		Figure fg1 = new Triangle(); // 부모 클래스 선언후 하위 클래스 선언
		Figure fg2 = new Rectangle();
		Figure fg3 = new Oval();
		Shape sp1 = new Triangle(); // 인터페이스 선언후 하위 클래스 선언
		Shape sp2 = new Rectangle();
		Shape sp3 = new Oval();
		p.pdraw(fg1); // 해당 값을 입력해 문제를 품
		p.pcomputeArea(sp1, 4, 4);
		p.pdraw(fg2);
		p.pcomputeArea(sp2, 4, 4);
		p.pdraw(fg3);
		p.pcomputeArea(sp3, 4, 4);
	}

}
