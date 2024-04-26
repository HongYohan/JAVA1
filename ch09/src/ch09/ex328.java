package ch09;
class X {
	int width;
	int height;
	int depth;
	public X(int width, int height, int depth) {
		this.width=width; // 자기 클래스 내의 width 변수에 지역변수로 받는 width의 값을 입력함
		this.height=height; // 이렇게 함으로써 값의 구분 오류 발생이 덜함
		this.depth=depth;
		
		// width=width로 하면 생성자 내에서만 수행되는 메서드로 인식되기 때문에 오류발생
	}
}
public class ex328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
