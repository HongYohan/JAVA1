package ch11;

class Rectangle5{
	public int width;
	public int height;
	public Rectangle5(int w, int h) {
		width = w;
		height = h;
	}
	// 정사각형의 클래스
	public int computeRectangleArea() {
		return width * height;
	}
}
class Cube5 extends Rectangle5{ // Cube5가 하위 클래스임
	public int depth;
	public Cube5(int w, int h, int d) {
		super(w,h);
		depth = d;
	}
	// 정육면체 클래스
	public int computeCubeArea() {
		// super로 상위 클래스에 접근
		return super.computeRectangleArea()*depth;
	}
}

public class ex421 {
	public static void main(String args[]) {
		// 상위 클래스 형의 객체 변수에 하위 클래스의 객체를 생성하여 배정
		Rectangle5 r = new Cube5(10,20,30);
		System.out.println("정사각형의 넓이 : "+r.computeRectangleArea());
		
		// 하위 클래스의 메소드 호출은 불가능해 진다
		// System.out.println("넓이 : "+r.computeCubeArea());
		
		Cube5 c =(Cube5) r; // 하위클래스 선언,, 형변환으로 선언함
		System.out.println("직육면체의 부피 : "+c.computeCubeArea());
		
		
		
		Rectangle5 r1 = new Rectangle5(10,20);
		Cube5 c1 = new Cube5(10,20,30);
		
		System.out.println("r1이 Rectangle5의 객체?"+(r1 instanceof Rectangle5));
		System.out.println("r1이 Cube5의 객체?"+(r1 instanceof Cube5)); 
		//Cube5는 하위객체 이므로 상위 객체에는 없다
		System.out.println("c1이 Rectangle5의 객체?"+(c1 instanceof Rectangle5));
		System.out.println("c1이 Cube5의 객체?"+(c1 instanceof Cube5));
		System.out.println();
		r1 = new Cube5(20,30,40);
		System.out.println("형 변환 r1이 Rectangle5의 객체?"
		+(r1 instanceof Rectangle5));
		System.out.println("형 변환 r1이 Cube5의 객체?"+(r1 instanceof Cube5));
		System.out.println("형 변환 c1이 Rectangle5의 객체?"
		+(c1 instanceof Rectangle5));
		System.out.println("형 변환 c1이 Cube5의 객체?"+(c1 instanceof Cube5));
		System.out.println();
		// c1은 object의 하위객체이므로 포함이 된다
		System.out.println("c1가 Object의 객체?"+(c1 instanceof Object));
	}
}