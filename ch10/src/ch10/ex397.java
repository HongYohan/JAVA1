package ch10;
class AAA1{
	public int a; // 따로 선언을안해주면 값은 0이다
	public String toString() {
		// object 클래스의 toString 메소드 오버라이딩
		return "AAA1 클래스 객체, 속성 a의 값은 : "+a;
	}
}
public class ex397 {

	public static void main(String[] args) {
		AAA1 aa = new AAA1();
		System.out.println(aa); 
		// toString에서 지정된 객체의 특성을 출력함
		System.out.println(aa.toString());
		
		// equals(조건)는 조건에 해당하는 값에 대한 true or false 만 나타낸다
		
		// final 객체 변수에서 상수로 지정
		// 메소드를 final 설정 즉,, 하위 클래스에서 이 메소드 오버라이딩 불가
		// 보안 설계부분에 명확하게 하기 위해서 final을 사용
	}
}
