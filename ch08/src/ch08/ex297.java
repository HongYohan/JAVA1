package ch08;

public class ex297 {

	public static void main(String[] args) {
		// 멤버 변수의 선언
		// [public/private/protected][static][final] 변수형 변수명;
		public int width; // public 변수 선언,, public 선언시 다른 참조 파일에서도 사용 가능
		private double rate; // private 변수 선언
		static int idnumber; // 클래스 변수 선언
		
		// 생성자, 메소드에서의 매개 변수와 지역 변수의 선언
		// [final] 변수형 변수명;
		final int Max=100; // 종단 변수 선언
		
		// 클래스 변수
		// static [final]변수형 변수명;
		static int idnumber; // 클래스 변수 idnumber을 선언
		static final int fixnumber; // 클래스 변수이면서 값이 변할 수 없는 종단 변수
		
		// 종단 변수
		// final 변수형 변수명 = 초기값;
		final int MAX=100; // 종단 변수값은 변경이 불가능 하다
	}
}