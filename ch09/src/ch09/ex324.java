package ch09;

class Cons3{
	public int num;
	public Cons3(String s) {
		System.out.println(s+"명시적 생성자"); // 명시적 생성자
	}
}

class Box1{
	int width;
	int height;
	int depth;
	double dwidth;
	double dheight;
	double ddepth;
	public Box1(int w, int h, int d) { // 3개의 매개변수를 가진 생성자
		width =w;
		height = h;
		depth=d;
	}
	public Box1(double w, double h, double d) {
		dwidth = w;
		dheight = h;
		ddepth =d;
	}
}

public class ex324 {
	public static void main(String[] args) {
		Cons3 cons1 = new Cons3("1번째");
		
		Box1 mybox1 = new Box1(10,20,30); // 3개의 정수 매개변수를 가진 생성자 수행
		int vol = mybox1.depth * mybox1.height * mybox1.width;
		System.out.println("박스의 부피(정수 매개 변수) : "+vol);
		
		mybox1 = new Box1(10.5,20.5,30.5); // 3개의 실수 매개변수를 가진 생성자 수행
		double dvol = mybox1.ddepth * mybox1.dheight * mybox1.dwidth;
		System.out.println("박스의 부피(정수 매개 변수) : "+dvol);
		
		mybox1 = new Box1(10,20,30.5); 
		// 혼합되어 있는 경우 자동으로 확대 형 변환으로 실수로 수행됨
		dvol = mybox1.ddepth * mybox1.dheight * mybox1.dwidth;
		System.out.println("박스의 부피(정수 매개 변수) : "+dvol);
	}

}
