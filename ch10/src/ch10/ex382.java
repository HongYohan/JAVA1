package ch10;

class OIaa{
	void show(String str) { // 한정자 없는메소드
		System.out.println("상위 클래스의 메소드 수행 : "+str);
	}
}
class OIbb extends OIaa{
	public void show(String s) { // public 한정자 ,, 사용 허용됨
		// 둘다 show일때 하위 메소드를 먼저 받음
		System.out.println("하위 클래스의 메소드 show() 수행"+s);
	}
}

// 그러나 public에서 protected,, public에서 한정자 없이,,
// 클래스 메소드를 일반 메소드로 선언할 경우 오버라이딩이 생김

public class ex382 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OIbb oibb = new OIbb(); // oibb는 OIbb로 선언된 객체에서
		oibb.show(" 쉽다 자바프로그래밍!!!"); // show는 하위 클래스를 받음
	}
}
