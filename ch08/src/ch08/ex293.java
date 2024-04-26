package ch08;
class Box1{
	public int width;
	public int height;
	public int depth;
}

public class ex293 {

	public static void main(String[] args) {
		// 객체의 선언과 생성
		// 클래스명 객체변수명 = new 클래스명();
		Box1 mybox1 = new Box1();
		Box1 mybox2 = new Box1(); // Box1로 2개의 객체를 생성
		int vol1, vol2;
		
		mybox1.width=78;
		mybox1.height=145;
		mybox1.depth=87;
		
		mybox2.width=48;
		mybox2.height=45;
		mybox2.depth=137;
		
		vol1=mybox1.depth*mybox1.height*mybox1.width;
		System.out.println("첫 부피"+vol1);
		
		vol2=mybox2.depth*mybox2.height*mybox2.width;
		System.out.println("두번째 부피"+vol2);
	}

}
